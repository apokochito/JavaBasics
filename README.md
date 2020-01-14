# Java Basics Repository

1. Java Basics (**master branch**) 
	
	Topics
	
	- Hello World Java
	- Class
	- Interface
	- Object
	- Constant
	- Properties (java.util.Properties)
	- MANIFEST file
	- Jar file

	To generate and execute JAR file on Command Prompt
	
	1. $cd src (Package in your project)
	2. **COMPILE** all classes > javac com\java\basic\*.java
	3. **EXECUTE** main class > java -cp . com.java.basic.Main
	(If everything is ok follow step 4, but If you have a problem, please help yourself follow the information of this link bellow: https://javahungry.blogspot.com/2018/11/solved-error-could-not-find-or-load-main-class.html)
	4. **CREATE JAR** > jar cvfm preferredNameForYourJarFile.jar packageRouteToManifestFile\MANIFEST.MF com\java\basic\*.class
	5. **RUN JAR** > java -jar file.jar

2. Java Libraries (**libraries branch**)

3. Java Servlets (**servlet branch**)

4. Java Hibernate (**hibernate branch**)

5. Java Threads (**thread branch**)

6. Java Async (**async branch**)

7. Java Lambdas (**lambdas branch**)

8. Java Fibers (**fibers branch**)

9. Java JDBC (**jdbc branch**)
