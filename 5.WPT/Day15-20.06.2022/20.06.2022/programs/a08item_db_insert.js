let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; // change port to 3306 that may be the port mostly.


//fate means other person design
let input={itemno:90,itemname:'textbook',price:100};
const mysql = require('mysql2'); //fate
const con=mysql.createConnection(dbparams);//fate  
con.query('insert into item(itemno,itemname,price) values (?,?,?)',
[input.itemno,input.itemname,input.price],
(error,whathappenedtoinsert)=>{
        if(error)
        {
                console.log("only for insert , insert failed");
        }

        else if(whathappenedtoinsert.affectedRows>0)
           console.log("insert successful");

}
);





