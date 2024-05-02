import cv2
import face_recognition as FR
import os 
import pickle as pk
from datetime import datetime
import time

with open('train.pkl','rb') as f:
    names = pk.load(f)
    knownEncodings = pk.load(f)


def attendance(name):
    with open('Attendance.csv', 'r+') as f:
        myDataList = f.readlines()
        nameList = []
        for line in myDataList:
            entry = line.split(',')
            nameList.append(entry[0])
        if name not in nameList:
            time_now = datetime.now()
            tStr = time_now.strftime('%H:%M:%S')
            dStr = time_now.strftime('%d/%m/%Y')
            f.writelines(f'\n{name},{tStr},{dStr}')
        
            # time_now = datetime.now()
            # tStr = time_now.strftime('%H:%M:%S')
            # dStr = time_now.strftime('%d/%m/%Y')
            # f.writelines(f'\n{name},{tStr},{dStr}')
            # time.sleep(1)
font=cv2.FONT_HERSHEY_SIMPLEX
cam = cv2.VideoCapture(0) # making camera object
# Set the width and height of the capture frame
cam.set(cv2.CAP_PROP_FRAME_WIDTH, 640)
cam.set(cv2.CAP_PROP_FRAME_HEIGHT, 480)
while True:
    success , frame = cam.read()
    if success:
        # Resize the frame to a smaller size
        frame = cv2.resize(frame, (300, 300))
        faceLocations=FR.face_locations(frame)
        unknownEncodings=FR.face_encodings(frame,faceLocations)
        for faceLocation,unknownEncoding in zip(faceLocations,unknownEncodings):
            top,right,bottom,left=faceLocation
            cv2.rectangle(frame,(left+10,top-10),(right,bottom),(255,0,0),3)
            name='Unknown Person'
            matches=FR.compare_faces(knownEncodings,unknownEncoding)
            if True in matches:
                matchIndex=matches.index(True)
                name=names[matchIndex]
                attendance(name)
            cv2.putText(frame,name,(left,top),font,.75,(0,0,255),2)
    
    cv2.imshow('My Faces',frame)

    
    # Exit the loop if the user presses the 'q' key
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
cam.release()
cv2.destroyAllWindows()
