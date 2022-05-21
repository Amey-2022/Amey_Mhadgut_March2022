create table temp(
celsius float,
fahrenheit float
 );
 
delimiter //
create procedure  f_to_c(f float)
begin
	declare c float;
    set c=(f-32)*5/9;
    insert into temp values (c,f);
end; //
delimiter ;

delimiter //
create procedure  c_to_f(c float)
begin
	declare f float;
    set f=9/5*c+32;
    insert into temp values (c,f);
end; //
delimiter ;

call f_to_c(98);
call c_to_f(37.5);

select * from temp;

drop procedure f_to_c;
drop procedure c_to_f;
drop table temp;
