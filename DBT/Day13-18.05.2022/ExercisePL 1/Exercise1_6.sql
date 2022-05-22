create table temp(
num1 float,
num2 float,
product_greater_than_100 char(3)
);

delimiter //
create procedure abc(num1 float,num2 float)
begin
	declare product float;
    declare x char(3);
    set product=num1*num2;
    if product >= 100 then
    set x='YES';
    else
    set  x='NO';
    end if;
    insert into temp values(num1,num2,x);
end; //
delimiter ;

call abc(25,5);
call abc(18,5);
call abc(15.5,4.2);
call abc(10,10);

select * from temp;

drop procedure abc;