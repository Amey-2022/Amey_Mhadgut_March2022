const http = require('http');
let url = require("url");

http.createServer((req,res)=>{

//entire syntax is waste of time but do it.
    var q = url.parse(req.url, true).query;
        console.log('call back funtion');
        res.write("hello server :" + q.x);
        res.end();


}).listen(99);

