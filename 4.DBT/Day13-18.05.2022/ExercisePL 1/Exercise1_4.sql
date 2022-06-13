create table temp(
num int,
yards int,
feet int,
inches int
 );
 
delimiter //
create procedure inch_convt(num int)
begin
	declare y int;
	declare f int;
    declare i int;
    declare  m int;
    set y = num / 36;
    set m = num % 36;
    set f = m / 12;
    set i = m % 12;
    insert into temp values(num,y,f,i);
end; //
delimiter ;

call inch_convt(248);
select * from temp;

drop procedure inch_convt;
drop table temp;


    