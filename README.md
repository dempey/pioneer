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

__Autodeploy during React.js development__

Because the React.js code is embedded inside the Pioneer project, there is a workaround for running
just the React code.  Following the steps below will allow the developer to make changes to any React
code and quickly see the change appear in the browser.  The alternative would be to do a complete
npm build and then deploy the whole project, then go through the sign-in process to see the change.

1. In a separate terminal window, run the command, "webpack --watch" from the project root.
2. In another terminal window (could be in your IDE if it supplies one), run the command, "webpack-dev-server --debug".
3. Go to http://localhost:8080/dev-index.html.
4. After a React.js change, click on the browser refresh button to see your changes.
    
__Run the project in debug mode (Intellij)__

Create a debug configuration

1. Click Run | Edit Configurations
2. Click '+' and select Remote
3. Enter a name in the top field like 'Pioneer Debug'
4. Click Apply | OK

Start the app in debug mode

    mvn spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005 -Dserver.port=8080"
    
Connect to the debug port

1. Click Run | Debug...
2. Select 'Pioneer Debug' or whatever name you added

Open your browser to localhost:8080

Any java breakpoints you add may now be fired as you walk through the code.
