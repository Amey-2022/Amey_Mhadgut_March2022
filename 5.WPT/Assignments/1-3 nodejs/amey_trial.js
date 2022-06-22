const http = require('http');
const url = require("url");
//why two things, we want to call functions of these objects.
http.createServer(
    (req,resp)=>{ 
        //this function gets called only when request is made.
        let q = url.parse(req.url,true).query ;//why I want to read paramters
        resp.write(q.adults +  " " + q.child  + " "+ q.infant);
        console.log("request handling function");
        resp.end();



    }
    ).listen(90);
