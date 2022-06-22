const url="";
let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; // change port to 3306 that may be the port mostly.


const mysql = require('mysql2');
const con=mysql.createConnection(dbparams);

let userid='y';  //assume this came from http request
let password='z';  //assume this came from http request
con.query('insert into cusers(userid,password) values (?,?)', [userid,password], 
(err, res1) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        console.log(res1.affectedRows)     
       
    }
}
);
