java -jar antlr-4.5.3.jar Trago.g
javac -cp antlr-4.5.3.jar Trago*.java 

SET CLASSPATH=.;antlr-4.5.3.jar;%CLASSPATH%

doskey antlr4=java org.antlr.v4.Tool $*
doskey grun =java org.antlr.v4.gui.TestRig $*


java TragoParser < Test.trago > Test.j

java -jar jasmin-2.4.jar Test.j 

java Test