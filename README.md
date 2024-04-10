## JEE example application

what

This is a JEE JSF example application. It it used to show how to convert a JEE JSF application to a Microservices based application.

The system just renders an employee list from a Mysql database.

requisites

To run the exemple you'll need:

- jdk 17+
- maven 3+
- tomcat server 8+

employees example versions

There are two versions of this example:

1. Original (main branch)
2. Migrated version to use api call (jeetoms branch)

Install and Run

Original version

1. Clone the main branch
2. Run mvn clean package
3. Copy employee.war to your tomcat webapps
4. Start up Tomcat
5. Open a browser and go to yourtomcat/employee

Migrated version

Obs.: the [https://github.com/RobertoMessaBrasil/jee-to-microservices-employee-api](https://github.com/RobertoMessaBrasil/jee-to-microservices-employee-api) microservice must be running before these steps are performed

1. Clone the jeetoms branch
2. Run mvn clean package
3. Copy employee.war to your tomcat webapps
4. Start up Tomcat
5. Open a browser and go to yourtomcat/employee

