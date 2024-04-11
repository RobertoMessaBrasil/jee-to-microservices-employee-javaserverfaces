## JEE example application

#About

This is a JEE JSF example application. It it used to show how to convert a JEE JSF application to a Microservices based application.

The system just renders an employee list from a Mysql database.

#Requisites

To run the exemple you'll need:

- jdk 17+
- maven 3+
- tomcat server 8+
- mysql 5+

#Mysql table

Create the following table in a database of yours and insert some data

```
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
```
#Install

There are two versions of this example:

1. Original (main branch)
2. Migrated version to use api call (jeetoms branch)

Original version

1. Clone the main branch
2. Change the authorization data in EmployeeData.java
3. Run mvn clean package
4. Copy employee.war to your tomcat webapps
5. Start up Tomcat
6. Open a browser and go to yourtomcat/employee

Migrated version

Obs.: the [https://github.com/RobertoMessaBrasil/jee-to-microservices-employee-api](https://github.com/RobertoMessaBrasil/jee-to-microservices-employee-api) microservice must be running before these steps are performed

1. Clone the jeetoms branch
2. Run mvn clean package
3. Copy employee.war to your tomcat webapps
4. Start up Tomcat
5. Open a browser and go to yourtomcat/employee

#Youtube Tutorial

[Migrating JEE to Microservices](https://www.youtube.com/playlist?list=PLAI1xdOxR60MhPnVDvbvZWgCXysu81Dv9)
