create table temp(
num float,
divisible_by_5 char(3)
 );
 
delimiter //
create procedure abc(num int)
begin
	declare x char(3); 
	if (num%5=0) then
    set x='YES';
    else 
    set x='NO';
    end if;
    insert into temp values(num,x);
end; //
delimiter ;

call abc(25);
call abc(16);
call abc(12.20);
call abc(17.31);
call abc(50);

select * from temp;


drop procedure abc;
drop table temp;    
    