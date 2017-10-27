echo Executing fizzBuzz...........

call mvn clean package


cd target
@echo off
echo *******************************
echo *******************************


java -jar fizzbuzz-0.0.1-SNAPSHOT.jar

pause