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
    In this project I have created REST ( Representational State Transfer ) API (Application programming Interface), that performs CRUD ( Create, Read, Update, 
    Delete) operation.
    Backend technologies : JAVA Spring-boot ( used to create microservice ), Maven ( automation tool- used to run automated tests and packages ).
    Database - MongoDB ( nosql Database - uses JSON(javascript object notation) format to store data.).
    IDE - Intellij IDEA Community edition.
    API Testing Software - POSTMAN



# 1.Project Setup:

## 1. Java Spring Boot API Contoller Setup.

![1_ApiControl1](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/2aaed049-2a07-4b47-aeb7-17c817820956)


![2](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/09615d61-f16f-415b-badd-e01567812566)



## 2. MongoDB Initially ( conatins empty server or data ).
    
![3_mongoDDyeKrnaHAi](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/bcdbb38b-8973-412a-945e-0318a16e8d5a)

![4_SetupFor_mongoSpring](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/6b2c7e46-c012-428e-8872-db5f8450bf6f)


# 2. GET Request ( initially )

###    Testing the **GET** Request API ( http://localhost:8080/) - It will display or fetch the data from MongoDB.

###    Now it will return the empty List. [].

  
 ![6_Initial_get](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/a992158b-2d82-4567-86f4-90e2872f94fb)


# 3. POST Request ( Adding data )

###   Testing the **POST** Request API ( http://localhost:8080/send) - It will Add the data in the mongoDB.

###   After adding the data,  the message " Data saved to database..." is displayed on Successful addition.

  
![7_Addding_data_1](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/c0cb020e-42ce-4e11-9230-c5d2466ba6eb)

  
###   Adding more data

  
![8_Adding_data_2](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/b59cbcfc-91c2-42ee-935d-784b075669b0)

  
###   Now we have to check whether the data has been added or not.

###   Using  GET Request ( http://localhost:8080/)

##   Through POSTMAN.
  
![Get_all_servers_by_slash](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/fd9d80bc-533b-4cbf-bd74-ccb8d8a7063f)

  
##   In Mongo-DB.
  
 ![9final_data](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/504f50a5-f0c0-4f68-96a5-e9aad0671e67)


##   Ok ALL Set. 
  
 
# 4. PUT Request ( updating the server with id )

###    Testing the PUT Request ApI (http://localhost:8080/updata{id}) - Used to Update the data.
   

    Initially The Parameter "framework"    [ In id = 4 ]
    { "framework" : "Reactjs" } 
    
    Changed to 
    { "framework" : "Spring" }

    
![Update_The_Data](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/a7a559a6-ef38-4259-aed3-34a921cce0d9)


### After Successful Updation it will display the message "Data is updated..."

### POSTMAN:  Getting The UPDATED Data: In [ id = 4 ]

![put_postman_Updated](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/33841cc1-e684-4ab5-8a72-50b470ea0f98)


### MongoDB :

![put_MongoDb_Updated](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/ce8d5294-4a53-4155-82b7-df4b03d31644)

    
# 5. DELETE Request ( deleting the server with id)

###   Testing the **DELETE** Request API ( http://localhost:8080/delete/{id}) - Used to Delete the data from the Databsae.

###   Now we are going to delete the data having [  "id": 4 ]

  
![11_DeletedDone](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/906f54c3-8882-485e-8782-d660e1f7bc09)


### After Successful deletion it will display the message " delete user with id {id}...."

### Now we have to check whether the data has been deleted or not.

   
## POSTMAN -   **GET** Request (http://localhost:8080/)

![After_deletoin_postman](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/2dacfef7-a23e-4877-be70-55ec230bf119)



## MONGODB -

![12_Deleted_show](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/f8342512-8925-42b6-9810-8b39aa671cfc)




# 6. GET Request ( by id parameter) 

###  Testing the **GET** Request API  ( http://localhost:8080/{id}) - Used to display the server or data that matches the id.

## POSTMAN API test : 

       `   Example : (http://localhost:8080/4)`
       

![14_IDonly](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/c94b0339-2645-475b-859f-97002db8e27a)



# 7. GET Request ( by name parameter)


### Testing the **GET** Request API  ( http://localhost:8080/{name}) - Used to display the server or data that matches the name.


## POSTMAN API test : 

       `   Example : (http://localhost:8080/krishna)`

       
![13_Server_name](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/55cff167-dc0f-4031-804b-683bfb0bcbef)



# 8. GET Request (final - to show all the servers. )

### Testing the **GET** Request API  ( http://localhost:8080/)

![After_deletoin_postman](https://github.com/krishnasaw8340/Task-1-Java-REST-API-example-2023/assets/63328010/0fca512e-0919-47d6-893b-950b407903e7)


  
