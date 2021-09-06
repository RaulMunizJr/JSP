# JSP

Useful References:

---------------The Servlet Interface and Request and Response Objects---------------:
https://docs.oracle.com/cd/B14099_19/web.1012/b14017/overview.htm#i1001303
```
init(...): Initialize the servlet.

destroy(...): Terminate the servlet.

doGet(...): Execute an HTTP GET request.

doPost(...): Execute an HTTP POST request.

doPut(...): Execute an HTTP PUT request.

doDelete(...): Execute an HTTP DELETE request.

service(...): Receive HTTP requests and, by default, dispatch them to the appropriate doXXX() methods.

getServletInfo(...): Retrieve information about the servlet.
```
