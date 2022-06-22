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

let empno=1;  //assume this came from http request
con.query('select empno, empname, mobile from emp where empno=?', [empno], 
(err, rows) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(rows.length > 0)
          console.log(rows[0].empno + " " + rows[0].empname + " " + rows[0].mobile);// rows is an array which contains one object per row.     
        else
           console.log("no emp found with "+ empno);
    
        }
}
);
