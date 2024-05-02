import cv2
import face_recognition
import pickle
import mysql.connector
import numpy as np 
import os 
try:
      connector = mysql.connector.connect(host='localhost',user='root',password='BimsCS@8A',database='Testing')
      print("Connected")  
    
except:
    print("Error unable to connect")




cursor  = connector.cursor()
cursor.execute(""" select e.db_picture,u.id FROM attendance_app_employee e INNER JOIN auth_user u on u.id = e.user_id; """)
data  = cursor.fetchall()

for data in data:
    image = data[0]
    userid= data[1]

    # Save the image with the userid as filename in the current working directory
    with open(f'{os.getcwd()}/images/{userid}.jpg', 'wb') as f:
        f.write(image)
        # cv2.imshow(str(userid),cv2.imread(f'{os.getcwd()}/images/{userid}.jpg '))
        # cv2.waitKey(0)

cursor.close()
connector.close()

# Importing images and ids 
folderPath = 'images'
pathList = os.listdir(folderPath)
imgList = []   # images
idList = []    # ids 

for path in pathList:
    imgList.append(cv2.imread(os.path.join(folderPath,path)))
    idList.append(os.path.splitext(path)[0])

print(len(imgList))
print(len(idList))



def findEncodings(imgList):
    encodeList = []

    for img in imgList:
        # change color
        img =  cv2.cvtColor(img,cv2.COLOR_BGR2RGB)
        # encode images
        encode = face_recognition.face_encodings(img,face_recognition.face_locations(img))[0]
        print(encode)
        encodeList.append(encode)

    return encodeList


encodedList = findEncodings(imgList=imgList)

# save encoding lists with id lists

encodedListwithIds = [encodedList, idList]

with open("EncodingFile.pkl", 'wb') as f:
    pickle.dump(encodedListwithIds, f)

print(" Encoding done with ids ")
