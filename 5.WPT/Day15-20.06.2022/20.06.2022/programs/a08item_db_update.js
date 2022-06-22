let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; // change port to 3306 that may be the port mostly.


//fate means other person design
let input={itemno:190,itemname:'abc',price:200};
const mysql = require('mysql2'); //fate
const con=mysql.createConnection(dbparams);//fate  
con.query('update item set itemname = ?,price =? where itemno=?',
[input.itemname,input.price,input.itemno],
(error,whathappenedtoinsert)=>{
        if(error)
        {
            //when you dont have data why problem is there collect data first.
                console.log("only for insert , insert failed" + error);
        }

        else if(whathappenedtoinsert.affectedRows>0)
           console.log("update successful");
        else
          console.log("update failed due to where condition");
        
}
);





