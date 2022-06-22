/* 2.	Non http
a.	Write the function which returns previous number in a file called lib.js
b.	In the file use.js , ensure the lib.js previousnumber function is getting called and print the result in the console. ( tiny bit on module) */


function previousNum(num){
    return num-1
}

exports.r=previousNum(10);
