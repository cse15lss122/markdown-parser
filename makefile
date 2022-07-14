CLASSPATH = lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:lib/commonmark-0.18.1.jar:.

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -g -cp $(CLASSPATH) MarkdownParseTest.java

MarkdownParse.class: MarkdownParse.java
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/javac -g  MarkdownParse.java

test: MarkdownParseTest.class
	/software/CSE/oracle-java-17/jdk-17.0.1/bin/java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest
