const url="";
let dbparams=
{
    host: 'localhost',
    user: 'root',
    password: 'cdac',
    database: 'ameymhadgut_019_juhu',
	port:3306
}; // change port to 3306 that may be the port mostly.


const mysql = require('mysql2');
const con=mysql.createConnection(dbparams);
console.log("db adventures");

/* con.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
  });
 */

  /* con.query('select * from emp',[],(err,res1)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(res1);
    }
});

   */
