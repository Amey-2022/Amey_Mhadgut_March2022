delimiter //
create function valid_triangle(s1 float, s2 float, s3 float)
returns boolean
deterministic
begin	
	 if (s1+s2>s3) and (s1+s3>s2) and (s2+s3>s1) then
     return true ;
     else
     return false;
     end if ;
end ; //
delimiter ;

delimiter //
create procedure abc(s1 float, s2 float, s3 float)
begin
	if valid_triangle(s1,s2,s3) then
		insert into tempp values (s1,s2,s3,'Valid triangle');
	else 
		insert into tempp values (s1,s2,s3,'Invalid triangle');
	end if ;
end ;//
delimiter ;

call abc (7,10,5) ;

create table tempp (
side1 float,
side2 float,
side3 float,
triangle_status varchar(20));


drop table tempp;

