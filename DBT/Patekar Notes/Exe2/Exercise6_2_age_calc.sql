delimiter //
create function age_calc(birthdate date)
returns int
deterministic
begin
	return datediff(sysdate(),birthdate)/365 ;
end ; //
delimiter ;

delimiter //
create procedure abc(bd date)
begin
	declare y int ;
    set y = age_calc(bd) ;
    insert into tempp values (y) ;
end ; //
delimiter ;

call abc('1996-12-30');

create table tempp (
	 age int
);

select * from tempp;


drop table tempp;
drop procedure abc;
drop function age_calc;