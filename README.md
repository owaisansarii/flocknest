<!-- MD041/first-line-heading/first-line-h1: First line in a file should be a top-level heading -->

# Flocknest Backend

## Spring Boot Overview

Spring Boot is a framework designed for creating stand-alone, production-grade Spring-based applications effortlessly. It simplifies setup, configuration, and execution of applications, including web apps. Spring Initializr helps generate project structures, while Maven serves as the chosen build tool. MongoDB integration is achieved by adding a dependency in the `pom.xml` file.

### Spring Initializr

Spring Initializr is a web tool aiding in generating initial project setups for Spring Boot applications. It streamlines development by providing necessary configurations and basic files.

### Maven as Build Tool

Maven is the chosen build tool for this project, managing dependencies, compiling code, and packaging artifacts. It utilizes the `pom.xml` file for configuration.

### MongoDB Dependency

To interact with MongoDB, the MongoDB dependency is added in the `pom.xml` file. This provides essential classes and methods for MongoDB integration, leveraging the Spring Boot ecosystem.

Project Structure which I'll be following for this project

```bash
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── Readme.md
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com
│ │ │ └── socialmedia
│ │ │ └── flocknest
│ │ │ ├── config
│ │ │ ├── controller
│ │ │ ├── dto
│ │ │ ├── exception
│ │ │ ├── FlocknestApplication.java
│ │ │ ├── model
│ │ │ │ └── User.java
│ │ │ ├── repository
│ │ │ │ └── UserRepository.java
│ │ │ ├── security
│ │ │ └── service
│ │ └── resources
│ │ ├── application.properties
│ │ ├── static
│ │ └── templates
│ └── test
│ └── java
│ └── com
│ └── socialmedia
│ └── flocknest
│ └── FlocknestApplicationTests.java
└── target
├── classes
│ ├── application.properties
│ └── com
│ └── socialmedia
│ └── flocknest
│ ├── config
│ ├── controller
│ ├── dto
│ ├── exception
│ ├── FlocknestApplication.class
│ ├── model
│ │ └── User.class
│ ├── repository
│ ├── security
│ └── service
└── test-classes
└── com
└── socialmedia
└── flocknest
└── FlocknestApplicationTests.class
```

I will start by creating a User model class in the model package which will be used to store the user details in the database.
Note: I will be using MongoDB as the database for this project.
