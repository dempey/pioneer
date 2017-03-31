# Pioneer Spring-Boot

A barebones Spring-Boot template, which can easily be deployed to Heroku.

### Getting Started

A good example of getting started with deploying a Spring Boot application to
Heroku can be found [here](https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku).

### Tips and Tricks

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

