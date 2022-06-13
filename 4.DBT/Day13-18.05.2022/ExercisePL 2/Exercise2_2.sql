create table temp(
side1 float,
side2 float,
side3 float,
valid_triangle varchar(20));

delimiter //
create procedure abc(s1 float,s2 float, s3 float)
begin
		if (s1+s2) > s3 and (s3+s2) > s1 and (s1+s3) > s2 then
			insert into temp values(s1,s2,s3,'valid triangle');
		else 
			insert into temp values (s1,s2,s3,'Invalid triangle') ;
		end if ;
end; //
delimiter ;

call abc(2,3,2) ;
call abc(4,8,10) ;
call abc(4,8,15) ;
call abc(4,7,16) ;
call abc(4,4,4) ;

select * from temp;
drop procedure abc;
drop table temp;
