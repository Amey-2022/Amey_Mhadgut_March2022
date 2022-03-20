#!/bin/bash

sum=0;

for ((i=1;i<11;i++))
do
	sum=`expr $sum + $i`
done
	echo "$sum"


