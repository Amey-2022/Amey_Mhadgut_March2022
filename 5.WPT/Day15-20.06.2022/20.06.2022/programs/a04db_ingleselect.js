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
con.query('select userid,password from  cusers  where userid=? and password=?', [userid,password], 
(err, rows) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(rows.length > 0)
        console.log(rows[0].userid);// rows is an array which contains one object per row.     
    }
}
);
