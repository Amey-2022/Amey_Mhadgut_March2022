#!/bin/bash

echo "Enter Marks: "
read marks

while [ $marks -lt 101 ]

do

if [[ $marks -gt 90 && $marks -lt 101 ]]
then
	echo "Grade A+" 
	break
elif [[ $marks -gt 74 && $marks -lt 91 ]]
then
	echo "Grade A" 
	break
elif [[ $marks -gt 59 && $marks -lt 75 ]]
then
	echo "Grade B"
	break
elif [[ $marks -gt 49 && $marks -lt 60 ]]
then
	echo "Grade C"
	break
elif [[ $marks -gt 39 && $marks -lt 50 ]]
then
	echo "Grade D"
	break
else
        echo "Fail"
	break

fi

done


