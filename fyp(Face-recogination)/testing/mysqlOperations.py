import mysql.connector

import os 

connector = mysql.connector.connect(host='localhost',user='root',password='BimsCS@8A',database='Testing')

cursor  = connector.cursor()
cursor.execute(""" select e.db_picture,u.id FROM attendance_app_employee e INNER JOIN auth_user u on u.id = e.user_id; """)
data  = cursor.fetchall()

for data in data:
    image = data[0]
    username = data[1]
    # print(f"image: {image}")
    # print(f"username: {username}")

    # Save the image with the username as filename in the current working directory
    with open(f'{os.getcwd()}/images/{username}.jpg', 'wb') as f:
        f.write(image)

# print(data)


cursor.close()
connector.close()