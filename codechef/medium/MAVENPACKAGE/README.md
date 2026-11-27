# MAVENPACKAGE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maven WAR Packaging and Tomcat Deployment

You are working with a Java Servlet web application that is intended to run on an Apache Tomcat server.

The project uses Maven for building and dependency management. To deploy the application correctly, the Maven configuration must be set up to package the application as a  **WAR (Web Application Archive)**  and correctly declare the Servlet API dependency.

Your task is to complete the project's `pom.xml` with the required Maven configuration.
The Servlet application and the required Tomcat deployment setup are already provided.

 **Objective** 
Configure the Maven project so that the Servlet application can be successfully packaged as a WAR and deployed to Tomcat.

 **Requirements** 
Complete the `pom.xml` to satisfy the following requirements:

- Configure WAR Packaging
- Configure the project to use war packaging.
- This ensures that Maven creates a Web Application Archive instead of the default JAR file.
- Add the Servlet API Dependency Add the Java Servlet API dependency with the following details:
- Group ID: javax.servlet
- Artifact ID: javax.servlet-api
- Version: 4.0.1

The Servlet API is required to compile the Servlet application.

- Use the Correct Dependency Scope
- Configure the Servlet API dependency with provided scope.
- Tomcat provides the Servlet API at runtime, so the Servlet API should be available during compilation but should not be bundled inside the application's WAR file.
- Preserve the Existing WAR Plugin Configuration
- The required maven-war-plugin configuration is already provided in the pom.xml.
- Do not remove or modify the existing WAR plugin configuration.

 **Expected Result** 

- After completing the pom.xml, the project should build successfully using Maven.
- When the project is run, the application will be packaged as a WAR, deployed to Tomcat, and the /hello Servlet endpoint will be accessed automatically.
- A successful deployment should produce the following output: WAR Deployment Successful

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T14:09:30.172Z  

```cpp
Maven manages Java project builds and dependencies.

mvn package compiles the code, runs tests, and packages the application as a JAR or WAR file depending on the project configuration.
```

---

[View on CodeChef](https://www.codechef.com/problems/MAVENPACKAGE)