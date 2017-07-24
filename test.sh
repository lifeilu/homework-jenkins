#!/bin/bash

cat '/Users/lulifei/Desktop/homework-jenkins/homework-jenkins/output.txt' | while read line
do
    echo $line
done
echo 'success'
