const url=" ";
const dbpar={
    host:'localhost',
    user:'root',
    password:'cdac',
    database:'ameymhadgut_019_juhu',
    port:3306
};


const mysql =require("mysql2");
const con= mysql.createConnection(dbpar);
console.log("database connected");

const express=require('express');
const app=express();


app.use(express.static('cp'));


app.get('/insert',(req,res)=>{

    let eid=req.query.empid;
    let ename1=req.query.empname;
    let edept=req.query.deptname;
    let esal=req.query.empsal;

    console.log(eid,ename1,edept,esal);
    let output={ status:false, message:"Employee already exists"}

    con.query('insert into employee (empid,ename,dname,sal) values(?,?,?,?)',[eid,ename1,edept,esal],(err,rows)=>{

        if(err){
            console.log("Error"+err);
        } else{
            if(rows.affectedRows>0){
                output.status=true;
                output.message="Employee info inserted";
            }else{
                console.log("no rows affected");
            }
        }
        res.send(output);
    });

});


app.get('/delete',(req,res)=>{

    let eid=req.query.empid;
    

    console.log(eid);
    let output={ status:false, message:"Employee not exists"}

    con.query('delete from employee where empid=?',[eid],(err,rows)=>{

        if(err){
            console.log("Error"+err);
        } else{
            if(rows.affectedRows>0){
                output.status=true;
                output.message="Employee info deleted";
            }else{
                console.log("no rows affected");
            }
        }
        res.send(output);
    });

});


app.get('/showinfo',(req,res)=>{

    let eid=req.query.empid;
    

    console.log(eid);
    let output={ status:false,ename:"",dname:"",sal:"", message:"Employee not exists"}

    con.query('select * from employee where empid=?',[eid],(err,rows)=>{

        if(err){
            console.log("Error"+err);
        } else{
            if(rows.length>0){
                output.status=true;
                output.ename=rows[0].ename;
                output.dname=rows[0].dname;
                output.sal=rows[0].sal;
                output.message="Employee info found";
            }else{
                console.log("no rows affected");
            }
        }
        res.send(output);
    });

});


app.get('/update',(req,res)=>{

    let eid=req.query.empid;
    let ename1=req.query.empname;
    let edept=req.query.deptname;
    let esal=req.query.empsal;

    console.log(eid,ename1,edept,esal);
    let output={ status:false}

    con.query('update employee set ename=?,dname=?,sal=? where empid=?',[ename1,edept,esal,eid],(err,rows)=>{

        if(err){
            console.log("Error"+err);
        } else{
            if(rows.affectedRows>0){
                output.status=true;
                console.log(rows.affectedRows);
            }else{
                console.log("no rows affected");
            }
        }
        res.send(output);
    });

});


app.get('/getAllDetails',(req,res)=>{
    con.query('select * from employee',[],(err,rows)=>{
    res.send(rows);
    });
});


app.listen(900,function(){
    console.log("server listening at port 900 ...")
});