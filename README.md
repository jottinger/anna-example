# README

You can run this a lot of ways:

<pre>mvn package dependency:copy-dependencies

# then one of...
java -cp "target/dependency/*;target/original-anna-example-1.0-SNAPSHOT.jar" com.autumncode.annaexample.App`

#or
mvn package exec:java

#or

java -jar target/anna-example-1.0-SNAPSHOT.jar<pre>
