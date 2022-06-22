const express = require('express');
const app = express();

app.use(express.static("sf")) ;//you are telling express framework
//hey this folder sr contains resources which you should process give
// to the client as it is.

app.get("/abc",(req,resp)=>{
        resp.send("abc request is being processed");

});

app.get("/def",(req,resp)=>{
    resp.send("def request is being processed");

});







app.listen(900, function () {
    console.log("server listening at port 8081...");
});

