const express=require('express');
const app = express();

app.use(express.static("cp"));


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
});  */


app.get('/areadetails',(req,res)=>{

let input=req.query.pincode;

let output={status:false,city:"", message:"City with given pin not found"};


con.query('select location from areadetails where pin=?',[input],(err,rows)=>{
    if(err){
        console.log("Error occured");
    }else{
        if(rows.length>0){
            output.status=true;
            output.city=rows[0].location;
            output.message="City found"
        }
    }
    res.send(output);
});


});

app.listen(786,()=>{
    console.log("server listenig to 786....");
});

//create table 
/* con.query('create table areadetails (pin integer primary key,location varchar(15))',[],(err,rows)=>{
    if(err)
        console.log("Error has occured" +err);
        else
        console.log(table created);
});
 */


//insert
/* con.query('insert into areadetails (pin,location) values(?,?)',[416602,'Kankavli'],(err,rows)=>{
    if(err)
        console.log("Error"+err);
    else
        console.log(rows.affectedRows);
}); */


//display table
/* con.query('select * from areadetails',[],(err,rows)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(rows);
    }
}); */