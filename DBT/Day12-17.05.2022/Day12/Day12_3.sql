create table temp(
fir int,
sec char(15)
);

delimiter // 
create procedure abc()
begin
	declare x int;
    declare y char(15);
    declare hra int default 0;
    select sal,job into x,y from emp
    where ename='Kirun';
    set hra=x*0.4;
    set y=lower(y);
    insert into temp values(hra,y);
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;