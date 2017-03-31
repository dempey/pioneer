# Pioneer Spring-Boot

A barebones Spring-Boot template, which can easily be deployed to Heroku.

### Getting Started

A good example of getting started with deploying a Spring Boot application to
Heroku can be found [here](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku).

### Tips and Tricks

__Start Spring Boot application locally__

    mvn spring-boot:run

__View project logs from system__

    heroku logs --app pioneer-project

__Referencing static resources__

This project includes a 'resources' directory, under which I've included 
a 'static' directory.  This is where all of the static javascript, stylesheet
and image resources have been placed.  Spring Boot will automatically add
static web resources located within any of the following directories:

* /META-INF/resources/
* /resources/
* /static/
* /public/

This allows me to reference the stylesheet by simply referencing the path 'styles/app.css'.

__Heroku reports "App crashed" after successful deployment__

By default, Spring Boot will listen on port 8080 when it's started.  Heroku though will assign
a port number at random so your application will crash.  To resolve this, 
do the following.

1. In Procfile file at root of the project, make sure the line reads

    ```web: java $JAVA_OPTS -jar target/*.jar```
  
2. In the file /resources/application.properties add this line

    ```server.port: ${port:8080}```
    
