const express = require('express');
const app = express();

app.use(express.static("sf"));


app.get("/getAllItems",(req,resp)=>{

    let items=[];
items.push({itemno:1,itemname:'pen',price:3});
items.push({itemno:2,itemname:'compass',price:5});
items.push({itemno:3,itemname:'box',price:50});
resp.send(items);



});



app.listen(900, function () {
    console.log("server listening at port 900...");
});