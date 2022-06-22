let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; //

const mysql = require('mysql2');
const con=mysql.createConnection(dbparams);

const express = require('express');
const app = express();

app.use(express.static("sf"))


app.get("/getEmployeeInfo",(req,res)=>{
        let input =req.query.empno;

        let output={status:false,empdetail:{empno:0, empname:"",mobileno:0}};

    //database logic I have not written any database logic for this.
    //ok then stay away from this code, and try your database logic separately.

    con.query('select empno, empname, mobile from emp where empno=?', [input], 
(err, rows) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(rows.length > 0)
        {
            output.empdetail=rows[0];
            output.status=true;


        }
            
        }
        res.send(output);
}
);


        

});





app.get("/ihad",(req,res)=>{

    res.send("if this does not work nothing will work");

})

app.listen(900, function () {
    console.log("server listening at port 900...");
});