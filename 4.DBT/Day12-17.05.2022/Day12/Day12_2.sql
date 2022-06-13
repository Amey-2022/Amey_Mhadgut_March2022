create table temp(
fir int,
sec char(15)
);

delimiter // 
create procedure abc(y char(15))
begin
	declare x int;
    declare hra int default 0;
    select sal into x from emp
    where ename=y;
    set hra=x*0.4;
    insert into temp values(hra,y);
end; //
delimiter ;

call abc('Arun');
select * from temp;

drop procedure abc;
truncate table temp;

