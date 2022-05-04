#!/bin/bash
echo "Area of Circle"

echo "Enter Radius:"
read r

((area=$r*$r*22/7))
echo "Area of Circle=$area"
