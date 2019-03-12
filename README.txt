Please refer to the code in the RegisterController to see how to fetch the list of registered users from the backend and display it on the frontend

The url for the Controller i wrote will be:
http://localhost:8181/spring-mvc-demo/controller/list

The logic is the same like the other example i shared on passing data from controller to view

Now on the JSP, to help us write the forloop and other instructions, it's recommended to use something called as JSTL

Please refer to displayUsers.jsp to understand how to iterate over the list and display the details one by one

Please add the following dependency to pom.xml for adding support for JSTL

<dependency>
<groupId>javax.servlet</groupId>
<artifactId>jstl</artifactId>
<version>1.2</version>
</dependency>

Also please remember, it's optional to create DTOs, you can use the Entity class itself as DTO if there is no difference



