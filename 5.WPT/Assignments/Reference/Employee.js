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

app.use(express.static("cp"));

app.get('/insert',(req,res)=>{
    let eid=req.query.employeeid;
    let ename=req.query.employeename;
    let dname=req.query.deptname;
    let sal=req.query.salary;
    console.log(eid,ename,dname ,sal);
    let output={status:false,message:"Employee already exists"};

    con.query('insert into employee (empid,ename,dname,sal) values(?,?,?,?)',[eid,ename,dname,sal],(err,rows)=>{
        if(err){
            console.log('Error '+err);
        }
        else{
            if(rows.affectedRows>0){
                output.status=true;
                output.message="Employee information inserted";
                
            }
            else{
                console.log("no rows affected")
            }
        }
        res.send(output);
    });
});


app.get('/showinfo',(req,res)=>{
    let eid=req.query.employeeid;
    
    let output={status:false,ename:"",dname:"",sal:"",message:"Employee Not in database"};

    con.query('select * from employee where empid=?',[eid],(err,rows)=>{
        if(err){
            console.log('Error '+err);
        }
        else{
                if(rows.length>0){
                output.status=true;
                output.message="Employee already exists ";
                output.ename=rows[0].ename;
                output.dname=rows[0].dname;
                output.sal=rows[0].sal;
                res.send(output);
            }
            else{
                console.log('no rows are affected')
                res.send(output);
            }
            
        }
        
    });
});

app.get('/update',(req,res)=>{
    let eid=req.query.employeeid;
    let ename=req.query.employeename;
    let dname=req.query.deptname;
    let sal=req.query.salary;
    
    let output={status:false};

    con.query('update employee set ename=?,dname=?,sal=? where empid=? ',[ename,dname,sal,eid],(err,rows)=>{
        if(err){
            console.log('Error '+err);
        }
        else{
            if(rows.affectedRows>0){
                console.log(rows.affectedRows)
                output.status=true;
            }

        }
        res.send(output);
        
    });
});


app.listen(900,function(){
    console.log("server listening at port 900 ...")
});



