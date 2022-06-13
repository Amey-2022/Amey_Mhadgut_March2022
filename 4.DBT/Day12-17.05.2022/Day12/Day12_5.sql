create table temp(
fir int,
sec char(15)
);

delimiter // 
create procedure abc()
begin
	declare x int;
    select sal into x from emp
    where ename='Kirun';
    if x > 4000 then
		insert into temp values(x,'High Sal');
    else 
		insert into temp values(x,'Low Sal');
    end if;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;