# TOMCATPRT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tomcat Servlet

Complete the given Maven configuration and Servlet implementation to build a simple Java web application for Apache Tomcat.

Your goal is to configure the project as a WAR-based web application and complete `HelloServlet` so that it is accessible at `/hello` and returns the required message.

 **TASK** 
Complete the missing parts of the Maven configuration and Servlet code:

- Configure the project so that Maven builds it as a deployable web application.
- Configure the Servlet API version to 4.0.1.
- Configure the Servlet API dependency so that it is available during compilation but is expected to be provided by the servlet container at runtime.
- Map HelloServlet to the URL:

```
/hello

```

- Complete the Servlet response so that accessing /hello displays:

```
Hello Tomcat!

```

 **Testing the Servlet** 

- When you click the Run button, the project will build and the Tomcat server will start. The Servlet response will not be displayed automatically in the terminal.
- To access the Servlet and see its output, run the following command in the terminal after Tomcat has started: curl http://localhost:8080/tomcat-lab/hello
- The expected output is: Hello Tomcat!
- The URL follows this structure: http://localhost:8080/tomcat-lab/hello └──────┘ └─────┘ context servlet path mapping

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T16:26:58.291Z  

```cpp
A web container is required because it provides the runtime environment for Servlets. It receives HTTP requests, manages the Servlet lifecycle, calls methods such as doGet() and doPost(), and sends HTTP responses back to the client.

```

---

[View on CodeChef](https://www.codechef.com/problems/TOMCATPRT)