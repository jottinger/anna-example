# README

You can run this a lot of ways:

<pre>mvn package dependency:copy-dependencies</pre>

then one of these:

Windows: <code>java -cp "target/dependency/*;target/original-anna-example-1.0-SNAPSHOT.jar" com.autumncode.annaexample.App</code>

Non-Windows: <code>java -cp "target/dependency/*:target/original-anna-example-1.0-SNAPSHOT.jar" com.autumncode.annaexample.App</code>

or

<pre>mvn package exec:java</pre>

or

<pre>java -jar target/anna-example-1.0-SNAPSHOT.jar<pre>
