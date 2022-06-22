const express = require('express');
const app = express();

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
    //do some stupid logic how..
    let loginstatus={ status:false, message:"login due to user"};
    if(username === password)
    {
        loginstatus.status=true;
        loginstatus.message="success";
    }
    resp.send(loginstatus);
});




app.get("/updateprofile",(req,resp)=> {
    resp.send("ok for update profile");
});

//setup the server.
app.listen(900, function () {
    console.log("server listening at port 900...");
});