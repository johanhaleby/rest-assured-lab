rest-assured-lab
================

Prerequisites
=============

* JDK 5+
* Maven
* Mercurial
* Git

Part 1
======

* Follow installation instructions on http://www.hascode.com/2011/10/testing-restful-web-services-made-easy-using-the-rest-assured-framework/.
* When installation is completed you should run "mvn tomcat:run" and then go to http://localhost:8080 where you'll find all the services.
* There's a sample test case in com.jayway.restassured.lab.part1.SingleUserServiceSpec for the "single-user". Complete this spec and then create similar
  specifications/tests for all services while following the instructions on hascode.com.

Part 2
======

* Clone the rest-assured repo by doing "git clone git://github.com/jayway/rest-assured.git"
* Go into rest-assured and run "mvn clean install -Dmaven.test.skip=true"
* Go into rest-assured/examples/scalatra-webapp and run "mvn jetty:run -Pdev"
* Implement com.jayway.restassured.lab.part2.AdvancedValidationTest. For this you'll need some knowledge on Groovy collections and closures.
  See http://groovy.codehaus.org/groovy-jdk/java/util/Collection.html and http://groovy.codehaus.org/Closures.
* Implement com.jayway.restassured.lab.part2.CustomAuthDemoTest. The assignment here is to create an authentication filter (see http://code.google.com/p/rest-assured/wiki/Usage#Filters)
  that automatically deals with logging in to the custom-auth service in order to get the secret message. But try to get access to "secretMessage" without implementing a filter
  in the first test case and then implement the filter in the second one.

