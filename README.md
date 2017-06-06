<<<<<<< HEAD

### Registration and Login System

+   Breif Introduction
+   Server terminal
+   Client terminal

#### Breif Introduction

This is an important part of my project.I achieve a basic registration and enthentication system.Server part is finished by python(Use flask to build the web server and sqlite3 for database part).Client part is finished by Java,using
post to transmit the username and password,and get back the result.

- - -

#### Server Terminal

Using Python Flask to build a Web Server to recerive and send information.Using
sqlite3 as database to save data and query data.This part basically has two main functons.One is used to register the new account in the database,if this username has been existed in database,return back error,otherwise,return back the information of sucess.

#### Client terminal

Client Terminal is achived by Java and a post function.This part is very simply.If you wnat to register an account,post the register link with
username and password,then you will get the inforamtion if you register this account successfully.If you want to login,post the login link with
username and password and you will get the information if you log in successfully.
---
Here are all possible cases you will see when you use client terminal to
registration or login.
---
When you are registering:
This username has been taken already
![This username has been taken already](https://raw.githubusercontent.com/s2117402/Registration-and-Login-System/master/Image/duplicatedname.png)
---
Register Successfully!
![Register Successfully!](https://raw.githubusercontent.com/s2117402/Registration-and-Login-System/master/Image/success.png)
---
When you are log in:
No This User!
![No This User!](https://raw.githubusercontent.com/s2117402/Registration-and-Login-System/master/Image/nouser.png)
---
Password Incorrect!
![Password Incorrect!](https://raw.githubusercontent.com/s2117402/Registration-and-Login-System/master/Image/incorrectpassword.png)
---
Login Successfully!
![Login Successfully!](https://raw.githubusercontent.com/s2117402/Registration-and-Login-System/master/Image/login%20success.png)

=======
# Authentication-System-By-Python-Flask
>>>>>>> origin/master
