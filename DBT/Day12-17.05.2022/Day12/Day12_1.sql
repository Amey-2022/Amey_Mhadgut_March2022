create table temp(
fir int,
sec char(15)
);

delimiter // 
create procedure abc()
begin
	declare x int;
    declare hra int default 0;
    select sal into x from emp
    where ename='kirun';
    set hra=x*0.4;
    insert into temp values(hra,'kirun');
end;//
delimiter ;

call abc();
select * from temp;


drop procedure abc;
truncate table temp;



