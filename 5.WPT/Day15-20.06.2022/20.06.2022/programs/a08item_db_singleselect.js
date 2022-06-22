let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; // change port to 3306 that may be the port mostly.


//fate means other person design
let itemno =33;
const mysql = require('mysql2'); //fate
const con=mysql.createConnection(dbparams);//fate  
con.query('select * from item where itemno =?',[itemno],(error,rows)=>{

        console.log(rows);

}
);





