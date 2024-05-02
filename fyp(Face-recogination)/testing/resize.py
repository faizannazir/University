import cv2
import os 
import face_recognition
import pickle

# Importing images and ids 
folderPath = 'images'
pathList = os.listdir(folderPath)

encodeDict = []

for path in pathList:
    img = cv2.imread(os.path.join(folderPath,path))
    # img = cv2.resize(img,[350,350])
    # change color
    img =  cv2.cvtColor(img,cv2.COLOR_BGR2RGB)
    faceLocation = face_recognition.face_locations(img)
    # encode images
    encode = face_recognition.face_encodings(img,faceLocation)
    print(encode)
    encodeDict.append(encode)

with open("EncodingFile.pkl",'wb') as f:
    f.write(pickle.dumps(encodeDict))
