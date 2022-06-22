/* 1.	Non http
a.	Write a function that returns previous number. Call that function and ensure you print the result in the console. Do it in nodejs */


function previousNum(num){
    return num-1
}

let num=10;
let x=previousNum(10)
console.log("Previous number of "+num+ " is "+x)

