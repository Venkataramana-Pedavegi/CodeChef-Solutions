# ADVJAVA15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Application Security Basics

A web application receives a username directly from an HTTP request.

Which is the best basic security practice before using the value?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T14:14:23.486Z  

```cpp
Two-tier: Client directly communicates with the database server.

Three-tier: Client communicates with an application server, which communicates with the database.

Main difference: Three-tier architecture has an additional application/business logic layer, making it more scalable and maintainable.
```

---

[View on CodeChef](https://www.codechef.com/problems/ADVJAVA15)