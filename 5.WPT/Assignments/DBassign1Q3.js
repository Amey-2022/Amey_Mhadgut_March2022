const url="";
let dbparams=
{
    host:'localhost',
    user:'root',
    password:'cdac',
    database:'ameymhadgut_019_juhu',
    port:3306

};

const mysql=require('mysql2');
const con=mysql.createConnection(dbparams);
console.log("db adventures");


//for checking connection with d/b
/* con.connect((err)=>{
if (err) throw err;
console.log("Connected!");
});  */



//create table resource
/* con.query('create table resource (resource_id integer primary key, resource_name varchar(15),status boolean)',[],(err,rows)=>{
    if(err){
        console.log("Error has occured"+err);
    }else{
        console.log(rows);
    }
});
 */

//insert
/* con.query('insert into resource (resource_id , resource_name ,status ) values(?,?,?)',[4,'stone',false],(err,rows)=>{
    if(err){
        console.log("Error has occured");
    }else{
        console.log(rows.affectedRows);
    }
});
 */


//single select
/* con.query('select * from resource where resource_id=?',[4],(err,rows)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(rows);
    }
}); */


//multiselect query
con.query('select resource_id,resource_name,status from resource where status=?',[true],(err,rows)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        if (rows.length > 0)
        for (let i = 0; i < rows.length; i++) {
            console.log(rows[i].resource_id+" "+rows[i].resource_name+" "+rows[i].status);
        }
    }
});




//display table 
/* con.query('select * from resource',[],(err,rows)=>{
    if(err){
        console.log("Error"+err);
    }
    else{
        console.log(rows);
    }
}); */

