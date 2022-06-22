const url=" ";
const dbpar={
    host:'localhost',
    user:'root',
    password:'cdac',
    database:'ameypatekar_20_jh',
    port:3306
};

const mysql=require('mysql2');
const con=mysql.createConnection(dbpar);
console.log("Database connecting");

const express = require('express');
const app = express();

app.use(express.static("cp"))


app.get('/pin',(req,res)=>{


    let input= req.query.pincode;
    let output={status:false, city:"",message:"Pincode not found"};

    con.query('select areaname from pincodedata where pincode=?',[input],(err,rows)=>{
        if(err){
            console.log("error has occured let us see");
        }
        else{
            if(rows.length>0)
            {
                output.status=true;
                output.message="Pincode found";
                output.city=rows[0].areaname;
                
            }
        }
        res.send(output);
    });

});


app.get('/getname',(req,res)=>{
    let x=req.query.name;
    res.send(x);
  
})

app.listen(900,function(){
    console.log("server listening at port 900 ...")
});


/* con.query('create table pincodedata (pincode integer primary key, areaname varchar(15))',[],(err,res)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("table created");
    }
}); */

let pincode=400001;
let area="Mumbai";

/* con.query('insert into pincodedata (pincode,areaname) values(?,?)',[pincode,area],(err,rows)=>{
    if(err){
        console.log("error"+err)
    }
    else{
        if(rows.affectedRows>0)
        console.log(rows.affectedRows);
    }
}); */

/* con.query('select * from pincodedata',[],(err,rows)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log(rows);
    }
}); */





