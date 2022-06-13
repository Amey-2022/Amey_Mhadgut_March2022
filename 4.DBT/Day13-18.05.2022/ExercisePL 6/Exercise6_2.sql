create table temp(
DOB date,
Age float
);

delimiter //
create function age_calc(DOB date)
returns int
deterministic 
begin
	return datediff(sysdate(),DOB)/365;
end; //
delimiter ;

delimiter //
create procedure abc(DOB date)
begin
	declare age float;
    set age=age_calc(DOB);
    insert into temp values(DOB,age);
end; //
delimiter ;

call abc('1995-05-03');
call abc('1990-09-14');

select * from temp;

drop function age_calc;
drop procedure abc;
drop table temp;

