const express = require('express');
const app = express();

app.use(express.static("sf")) ;// here sf is folder which will contains html
//files and other javascript files which should not be processed by the server.

//setup up URI's what is URI, a scenario in your http


app.get("/login",(req,resp)=>{

    resp.send("ok for login we need to do some logic")
});

app.get("/updateprofile",(req,resp)=> {
    resp.send("ok for update profile");
});

//setup the server.
app.listen(900, function () {
    console.log("server listening at port 900...");
});