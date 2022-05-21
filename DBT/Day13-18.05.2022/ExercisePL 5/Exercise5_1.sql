create table temp(
s1 float,
s2 float,
s3 float,
remark char(20)
);

delimiter //
create function istriangle(s1 float,s2 float,s3 float)
returns boolean
deterministic
begin
	if (s1+s2>s3) and (s2+s3>s1) and (s1+s3>s2) then  
    return true; 
    else 
    return false;
    end if;
end; //
delimiter ;

delimiter //
create procedure abc(s1 float,s2 float,s3 float)
begin
	if istriangle(s1,s2,s3) then
		insert into temp values(s1,s2,s3,'valid triangle');
	else 
		insert into temp values(s1,s2,s3,'invalid triangle');
	end if;
end; //
delimiter ;

call abc (6,8,10);
call abc (6,8,16);

select * from temp;

drop function istriangle;
drop procedure abc;
drop table temp;



