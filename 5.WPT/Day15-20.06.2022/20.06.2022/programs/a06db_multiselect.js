
//these are the database paramters we have to pass so that
//ready made function knows where is databse located
//what is database also
let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: '1234',
    database: 'pleasework',
	port:3309
}; // change port to 3306 that may be the port mostly.


//fate means other person design
const mysql = require('mysql2'); //fate
const con=mysql.createConnection(dbparams);//fate  
// above two lines does not need any change in your code.




let location='nasik';  //assume this came from http request
con.query('select empno, empname, mobile,location from emp where location=?', [location], 
(err, rows) => {
    if (err) {
        console.log("error has occured let us see");  
    } else {
        if(rows.length > 0)
        {
            for(let i=0; i < rows.length; i++)
            console.log(rows[i].empno + " " + rows[i].empname + " " + rows[i].mobile);// rows is an array which contains one object per row.     
        }
            else
           console.log("no emp found with "+ empno);
    
        }
}
);
