const express = require('express');
const app = express();

const mysql = require('mysql2');


let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; //

const con=mysql.createConnection(dbparams);

app.use(express.static("sf")) ;// here sf is folder which will contains html
//files and other javascript files which should not be processed by the server.

//setup up URI's what is URI, a scenario in your http


app.get("/login",(req,resp)=>{

//reading username and password from the http request.
    let username =req.query.username;//syntx will change depending on whih
    //http server we are using that nodejs inbuilt http server or 
    //express http server.
    let password=req.query.password;
    console.log("talking to database that can be done later on");
    
    let loginstatus={ status:false, message:"login due to user"};
    //here put the databse part
    //create the connection.
    con.query('select userid,password from  cusers  where userid=? and password=?', 
    [username,password], 
(err, rows) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(rows.length > 0)
        {
        loginstatus.status=true;
        loginstatus.message="login successful";
    }

    }
    resp.send(loginstatus);//observe this line inside the call back
    //function of query 

    

});

  
});




app.get("/updateprofile",(req,resp)=> {
    resp.send("ok for update profile");
});

//setup the server.
app.listen(900, function () {
    console.log("server listening at port 900...");
});