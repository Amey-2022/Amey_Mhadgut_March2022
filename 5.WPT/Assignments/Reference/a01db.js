const url="";
let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: 'cdac',
    database: 'ameypatekar_20_jh',
	port:3306
}; // change port to 3306 that may be the port mostly.


const mysql = require('mysql2');
const con=mysql.createConnection(dbparams);
console.log("db adventures");




 con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
});


/* 
let itemno=1;

  con.query('insert into item(itemno,itemname,price) values (?,?,?)', [6,"rubber",3], 
(err, res1) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        console.log(res1.affectedRows)     
       
    }
}
); */ 

/* con.query('update  item set price =? where itemname=? ', [12,"pen"], 
(err,res1) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(res1.affectedRows===0)
        {
            console.log("update failed");
        } 
        else
           console.log("update suceeded");    
       
    }
}
); */

/* con.query('select itemno,itemname,price from item where price=?',[12],(err,res)=>{
    if(err){
        console.log("Error"+err);
    }
    else {
        if(res.length > 0)
        //console.log(rows[0].userid);
        console.log(res[0].itemno+" "+res[0].itemname+" "+res[0].price);
    }
} ) */; 

/* con.query('select * from item',[],(err,res)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(res);
    }
} );  */


con.query('select itemno,itemname,price from item where itemname=?',["rubber"],(err,res)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        if(res.length>0){
            console.log(res.length);
           for (let index = 0; index < res.length; index++) {
               console.log(res[index].itemno+" "+res[index].itemname+" "+res[index].price);
               
           }
        }
        else{
            console.log("item not found");
        }
    }
} );

