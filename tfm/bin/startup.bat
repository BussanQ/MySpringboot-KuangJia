@echo off
color 0b
java -Xmx1024M -Xms512M -classpath .;..\lib\* com.ehl.ece.situation.tfm.Application
echo. & pause
