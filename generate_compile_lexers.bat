java -jar antlr-3.5.2-complete.jar Trago.g
javac -cp antlr-3.5.2-complete.jar Trago*.java 

SET CLASSPATH=.;antlr-3.5.2-complete.jar;%CLASSPATH%

doskey antlr4=java org.antlr.v4.Tool $*

java TragoParser < Test.trago

java TragoParser < Test.trago > Test.j

java -jar jasmin-2.4.jar Test.j 

java Test