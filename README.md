# Task-1-Java-REST-API-example-2023
Implement an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:
● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.
● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
{
“name”: ”my centos”,
“id”: “123”,
“language”:”java”,
“framework”:”django”
}
● DELETE a server. The parameter is a server ID.
● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.
“Server” objects should be stored in MongoDB database.
Be sure that you can show how your application responds to requests using postman, curl or
any other HTTP client.

# Table of Contents:

1. Project Setup:
   1. Java Spring-Boot API setup
   2. MongoDB setup
2. GET Request ( initially )
3. POST Request ( Adding Servers )
4. PUT Request ( updating the server with id )
5. DELETE Request ( deleting the server with id)
6. GET Request ( by id parameter)
7. GET Request ( by name parameter)
8. GET Request (final - to show all the servers. )

# Project description:
  

    It is java-based backend project.
    In this project I have created REST ( Representational State Transfer ) API (Application programming Interface), that performs CRUD ( Create, Read, Update, Delete) operation.
    Backend technologies : JAVA Spring-boot ( used to create microservice ), Maven ( automation tool- used to run automated tests and packages ).
    Database - MongoDB ( nosql Database - uses JSON(javascript object notation) format to store data.).
    IDE - Intellij IDEA Community edition.
    API Testing Software - POSTMAN



# 1.Project Setup:
    1. Java Spring Boot API Contoller Setup.

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\1_ApiControl1.png" alt="img"/>
<img src="C:\Users\krish\Documents\kaiburr\Img\1_ApiControl1.png"/>

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\2.png" alt="img"/>


    2. MongoDB Initially ( conatins empty server or data ).
<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\3_mongoDDyeKrnaHAi.png" alt="img"/>
<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\4_SetupFor_mongoSpring.png" alt="img"/>

# 2. GET Request ( initially )
  Testing the **GET** Request API ( http://localhost:8080/) - It will display or fetch the data through MongoDB.
  For now it will return the empty List. [].
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\6_Initial_get.png"/>

# 3. POST Request ( Adding data )
  Testing the **POST** Request API ( http://localhost:8080/send) - It will Add the data in the mongoDB.
  After adding the data,  the message " Data saved to database..." is displayed on Successful addition.
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\7_Addding_data_1.png" alt="img"/>
  
  Adding more data
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\8_Adding_data_2.png" alt="img"/>
  
  Now we have to check whether the data has been added or not.
  Using  GET Request ( http://localhost:8080/)

  Through POSTMAN.
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\Get_all_servers_by_slash.png" alt="img"/>
  
  In mongo-db.
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\9final_data.png" alt="img"/>

  Ok ALL Set. 
 
# 4. PUT Request ( updating the server with id )
   Testing the PUT Request ApI (http://localhost:8080/updata{id}) - Used to Update the data.

    Initially The Parameter "framework"    [ In id = 4 ]
    { "framework" : "Reactjs" } 
    
    Changed to 
    { "framework" : "Spring" }

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\Update_The_Data.png" alt="img"/>
After Successful Updation it will display the message "Data is updated..."
### POSTMAN:  Getting The UPDATED Data: In [ id = 4 ]

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\put_postman_Updated.png" alt="img"/>

### MongoDB :

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\put_MongoDb_Updated.png" alt="img"/>
    
# 5. DELETE Request ( deleting the server with id)
  Testing the **DELETE** Request API ( http://localhost:8080/delete/{id}) - Used to Delete the data from the Databsae.
  Now we are going to delete the data having [  "id": 4 ]
  <img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\11_DeletedDone.png" alt="img"/>

After Successful deletion it will display the message " delete user with id {id}...."

     Now we have to check whether the data has been deleted or not.
   
POSTMAN -   **GET** Request (http://localhost:8080/)
<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\After_deletoin_postman.png" alt="img"/>
MONGODB -
<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\12_Deleted_show.png" alt="img" alt="img"/>


# 6. GET Request ( by id parameter) 
 Testing the **GET** Request API  ( http://localhost:8080/{id}) - Used to display the server or data that matches the id.

POSTMAN API test : 

       `   Example : (http://localhost:8080/4)`

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\14_IDonly.png" alt="img"/>



# 7. GET Request ( by name parameter)
Testing the **GET** Request API  ( http://localhost:8080/{name}) - Used to display the server or data that matches the name.

POSTMAN API test : 

       `   Example : (http://localhost:8080/krishna)`

<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\13_Server_name.png" alt="img"/>


# 8. GET Request (final - to show all the servers. )
Testing the **GET** Request API  ( http://localhost:8080/)
<img src="C:\Users\krish\Downloads\Kaiburr\Documentation\Task-1\After_deletoin_postman.png" alt="img"/>

  