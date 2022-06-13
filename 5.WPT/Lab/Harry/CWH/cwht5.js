console.log('welcome to tut5');
let myvar=34;
console.log(myvar);
console.log(myvar,(typeof myvar));

myvar=String(34);
console.log(myvar,(typeof myvar));


let arr=[1,2,3,4,5];
console.log(arr.length,(typeof arr));

let arr1=String([1,2,3,4,5]);
console.log(arr1.length,(typeof arr1));


let x=10;
console.log(x.toString());

let stri="3434";
console.log(stri,(typeof stri));

stri=Number("3434");
console.log(stri,(typeof stri));

let number="34.098"
console.log(number,(typeof number));

number=parseInt("34.098");
console.log(number,(typeof number));

number=parseFloat("34.098");
console.log(number.toFixed(2),(typeof number));


//Type coercion

let mystr ="698";
let mynum=34;

console.log(mystr + mynum );

mystr =Number("698");
console.log(mystr + mynum );