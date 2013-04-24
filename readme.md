To run, simply import the project into your IDE and deploy to a Servlet 2.5 or > container such as Tomcat 6 or 7. You can also deploy from the command line with: $ mvn tomcat:run

Access the project at http://localhost:8080/spring-social-xing-quickstart



Install spring-social-xing-1.0.0.jar to local maven repository:

$ mvn install:install-file -Dfile=spring-social-xing-1.0.0.jar -DgroupId=org.springframework.social -DartifactId=spring-social-xing -Dversion=1.0.0 -Dpackaging=jar


This is how dependency looks like for above line:

<dependency>
	<groupId>org.springframework.social</groupId>
	<artifactId>spring-social-xing</artifactId>
	<version>1.0.0</version>
</dependency>
