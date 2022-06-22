const express = require('express');
const app = express();

app.use(express.static("sf"))


app.get("/getEmployeeInfo",(req,res)=>{
        let input =req.query.empno;

        let output={status:false,empdetail:{empno:0, empname:"",mobileno:0}};
//stupid logic
console.log("input got is " + input);
        if(parseInt(input) === 44)
        {
            output.status=true;
            output.empdetail.empno=44;
            output.empdetail.empname="xyz";
            output.empdetail.mobileno=89;
        }

        res.send(output);

});





app.get("/ihad",(req,res)=>{

    res.send("if this does not work nothing will work");

})

app.listen(900, function () {
    console.log("server listening at port 900...");
});