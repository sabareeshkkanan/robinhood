# Robinhood API Unofficial Documentation

Few days ago saw a post(https://news.ycombinator.com/item?id=15994312) on how every developer should automate and robinhood really made me excited. As there was no official API documentation and not easy way to kick start your algorithm trading I decided to convert Sanko's documentation (https://github.com/sanko/Robinhood) into open api specification which is already a wonderful work.

This repository presents the unofficial api document in swagger specification (open api) https://swagger.io/
which lets us to generate the api client on your preffered language to consume the api. 
# Code Gen
You can directly use the robinhood.json or robinhood.yaml file to generate a api client using 
https://editor.swagger.io/

Or you can just the codegen service to generate the code for you using the api . Document can be found here 
https://github.com/swagger-api/swagger-codegen#customizing-the-generator


I generated the client as follows
Url to post , type application/json
https://generator.swagger.io/api/gen/clients/{language}

    https://generator.swagger.io/api/gen/clients/java

    {
    "options":{
	    "groupId":"com.kalki",
	    "artifactId":"robinhood-cli",
	    "artifactVersion":"0.0.1",
	    "library":"feign",
	    "dateLibrary":"java8"
    },	   
    "swaggerUrl":"https://github.com/sabareeshkkanan/robinhood/releases/download/0.2/robinhood.json"
    }

And i got a one time url back to download the generated client

Spring boot and Spring Fox is used to generate the swagger specification.




