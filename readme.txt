https://howtodoinjava.com/junit5/execute-testcase-eclipse/

(a)
junit 5.
Must need @RunWith(JUnitPlatform.class)  <-- needed Must to give running context and runner env. Otherwise @Test not recognized.


passed.

(b)
maven from simple project adding mainifest file with entry point under <build> element
<mainClass>com.subra.Main</mainClass>. See pom.xml
C:\Users\sdass\STS\2019workspace\Junit5Expt>mvn celan; mvn install
C:\Users\sdass\STS\2019workspace\Junit5Expt>java -jar target\Junit5Expt-0.0.1-SNAPSHOT.jar
This is test
---------------------------
https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-running-unit-tests-with-maven/
(c) introducing mvaen Surefire Plugin (to use its native JUnit 5 support) and  removing junit-platform-runner dependency