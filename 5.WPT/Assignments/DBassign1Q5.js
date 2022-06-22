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


app.get('/bankdetails',(req,res)=>{

    let input=req.query.accountnum;
    
    let output={status:false,amount:"", message:"Account number not in database"};
    
    
    con.query('select balance from bankdetails where accono=?',[input],(err,rows)=>{
        if(err){
            console.log("Error occured");
        }else{
            if(rows.length>0){
                output.status=true;
                output.amount=rows[0].balance;
                output.message="Balance retrived"
            }
        }
        res.send(output);
    });
    
    
    });
    
    app.listen(786,()=>{
        console.log("server listenig to 786....");
    });
    