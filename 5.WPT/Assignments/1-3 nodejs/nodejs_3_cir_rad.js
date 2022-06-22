/* 3.	Nodejs inbuilt module http
a.	Setup a web server on port 800
b.	Read a parameter called radius from the url string
c.	Print the diameter on the browser window.
 */


const http=require('http');
const url=require('url');

http.createServer(
    (req,resp)=>{

        let q=url.parse(req.url,true).query;
        resp.write("diameter : "+q.radius*2);
        console.log("request handeled by function");
        resp.end();
}).listen(800);