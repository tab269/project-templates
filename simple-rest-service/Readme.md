# Simple RESTful Webservice Demo
## Requirements
* Java EE 8 application server
* Maven 3

## Properties
* Packaging: WAR-File

## Build
* ```mvn clean package```

## Deployment
* ```target/restservicedemo.war```
* by hand (see application server manual)

## Use
* ```127.0.0.1:8080/restservicedemo/hello```
* ```127.0.0.1:8080/restservicedemo/bye```

## Tested on
* Oracle Glassfish 5
* Wildfly 12

