create table temp(
side1 float,
side2 float,
side3 float,
valid_triangle char(20)
);

select * from temp;
drop table temp;
truncate table temp;
delimiter //
create procedure abc (s1 float,s2 float, s3 float)
begin 
	if (s1+s2) > s3 then 
		insert into temp values (s1,s2,s3,'valid triangle') ;
	elseif (s1+s3) > s2 then 
		insert into temp values (s1,s2,s3,'valid triangle') ;
	elseif (s2+s3) > s1 then 
		insert into temp values (s1,s2,s3,'valid triangle') ;
	else 
		insert into temp values (s1,s2,s3,'Invalid triangle') ;
	end if ;
end ; //
delimiter ;

call abc(2,3,2) ;
call abc(4,8,10) ;
call abc(4,8,15) ;
call abc(4,7,16) ;
call abc(4,4,4) ;
drop procedure abc;
