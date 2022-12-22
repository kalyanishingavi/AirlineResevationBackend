# AirlineResevationBackend

>Back-end development means working on server-side software, which focuses on everything you can’t see on a website. Back-end developers ensure the website performs correctly, focusing on databases, back-end logic, application programming interface (APIs), architecture, and servers. They use code that helps browsers communicate with databases, store, understand, and delete data.

**Project Description**
1) In this project I have used java as programming language and executed on Spring boot framework, MySql for database connection and postman for testing purpose. 
2) This project is made by using Three microsservices i.e BookingMicroservice, FlightSearchMicroservice, CheckinMicroservice and created DicoveryServer by using eureka server to register all microservice on single server and also created ApiGateway to register all microservice on single port no.
3) For this project you need to install different software such as Springboot, Java, MySql<sub>you can use any database</sub> and Postman.
4) In this project i have used Swagger for api documentation and i have also implemented spring security.

**Project Implementation step wise**
1) Create first Spring boot project and add eureka server dependency to it, so that will act as server for rest microservices.
2) Create three Spring boot project as flightsearch, booking, checkin microservice by adding eureka client dependency and accordingly as mentioned in above code.
3) Create fifth Spring boot project as APIgateway and add Spring cloud dependency in it and do configuration in application properties as mentioned in above code
4) In all microservices except server microservice you need to do configuration in application properties for database connection.
5) After adding data in database according to attributes and by calling apis in postman then check the output.

**video reference:-** https://youtu.be/U7a53hkFsWg

**Directly Implementing using code mentioned above**
1) Import this code in spring framework.
2) First start the eureka server and make sure your database configuration is done for all other microservices.
3) After Successfull execution, test apis in postman.
