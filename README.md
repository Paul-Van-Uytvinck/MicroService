# Java Web Service for movie library



## How to use it

* Download the folder movielibrary on your device

* _(Recommended :)_ Launch Eclipse and choose the folder you just downloaded for your workspace

* Configure and run a Java Application
![alt](https://github.com/Paul-Van-Uytvinck/Pictures/blob/master/running_configuration.jpg "Running configuration")

* _(Recommended :)_ Meanwhile launch Postman or a web browser and send one of these HTTP requests
⋅⋅⋅http://localhost:8080/movieLibrary/movies with GET method to read movies⋅⋅
⋅⋅⋅http://localhost:8080/movieLibrary/movie with POST method to create a movie⋅⋅
⋅⋅⋅http://localhost:8080/movieLibrary/movie/{id} with PUT method to update a movie⋅⋅
⋅⋅⋅http://localhost:8080/movieLibrary/movie/{id} with DELETE method to delete a movie⋅⋅
⋅⋅⋅http://localhost:8080/movieLibrary/movies/{releaseDate} with GET method to read specific movies⋅⋅

* The supported format is JSON (application/json)
![alt](https://github.com/Paul-Van-Uytvinck/Pictures/blob/master/postman_configuration.jpg "Postman configuration")



## What softwares were involved for the conception
* [Eclipse](https://www.eclipse.org/downloads/) : for my integrated development environment
* [Postman](https://www.getpostman.com/) : for my HTTP client for testing the web service
