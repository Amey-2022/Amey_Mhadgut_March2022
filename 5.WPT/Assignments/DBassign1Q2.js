const url="";
let dbparams=
{
    host:'localhost',
    user:'root',
    password:'cdac',
    database:'ameymhadgut_019_juhu',
    port:3306

};


const mysql=require('mysql2');
const con=mysql.createConnection(dbparams);
console.log("db adventures");

//for checking connection with d/b
/* con.connect((err)=>{
if (err) throw err;
console.log("Connected!");
}); */


//insert item
/* con.query('insert into item (itemno,itemname,price) values(?,?,?)',[6,'bag',500],
(err,res1)=>{
    if(err){
        console.log("Error has occured");
    }else{
        console.log(res1.affectedRows);
    }
}); */

//update item price by itemname
/* con.query('update item set price=? where itemname=?', [18,'scale'],
(err,res1)=>{
    if(err){
        console.log("Error has occured");
    }else{
        if(res1.affectedRows===0)
        console.log("update failed");
        else
        console.log("update succeded");
    }
}); */

//single select
/* con.query('select * from item where itemno=?',[4],(err,res1)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(res1);
    }
}); */

//multiselect query
con.query('select itemno,itemname from item where price=?',[10],(err,res1)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        if (res1.length > 0)
        for (let i = 0; i < res1.length; i++) {
            console.log(res1[i].itemno+" "+res1[i].itemname);
        }
    }
});

//display table 
/* con.query('select * from item',[],(err,res1)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(res1);
    }
}); */
