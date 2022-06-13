create table temp(
fir int,
sec char(15)
);

delimiter // 
create procedure abc()
begin
	declare x int;
    select sal into x from emp
    where ename='Jack';
    if x > 4000 then
    insert into temp values(x,'High Sal');
    end if;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;