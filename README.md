# USER MANAGEMENT SYSTEM 
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.5.0-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a user management system built using spring boot with Java.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The user Data model define in the user class
```
User ID : uniq identifier for each other
Name : user name
User Name : Organisation user name
Adress : user address
Phone Number : user phone number
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 

 * add user --->
 ```
 * PostMapping
 endpoints make a call to the method in user service class which is connected to database. in data base we used new user given through API
```
* find user 
```
* GetMaping/(getAll)
this api make a call to method user service which is retrive data of all user from user database
```
* Update user
```
PutMaping/(updateUser)
endpoint makes a call to method in userService class which is connected to database. In database we update a user by userid given through API
```

* Delete User
```
* DeleteMapin
endpoint makes a call to method in userService class which is connected to database. In database we delete a user by user id given through API
```
## Data Structure Used
* ArrayList

## Project Summary
```

```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
