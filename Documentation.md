#Spring Boot Bill Generator


This project leverages Spring Boots MVC Architecture and ingerates with the relational database for storing bill details(postgres).

Requirements :

Java

IDE which support spring boot

need Docker postgres image for database



Developing Process:

(First run the project for the first time to check everything is fine at first)

1.First configure the application.properties for the postgres credentials and the application running port

2.Then start to make the required packages i.e Controller,Service,Models and Repository


Controller Package --> It has BillController class to accept the request from the user and provide the responds as request by communicating with the service module.

Models -->It define the entity table for the database like Bill(for table bill) and Item (for table item which store the individual items in database)

Business Service -->this module only do the business operation required in the system and provide the data to the controller package

Repository -->it has the bill repository which communicate with the database with the help of Spring JPA



Requesting and Getting the data is done by the postman agent.(RestController)