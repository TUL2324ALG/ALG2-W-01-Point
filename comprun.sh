#/bin/bash

read -p "Class to comprun: " classname
javac src/mekina/$classname.java -d target
cd target
java mekina.$classname
