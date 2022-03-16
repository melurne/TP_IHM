CC=javac

all : tp1/test.java
	javac tp1/test.java

run : all
	java tp1.test
	