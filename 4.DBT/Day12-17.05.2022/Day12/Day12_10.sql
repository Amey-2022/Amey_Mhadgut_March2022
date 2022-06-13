create table temp(
fir int,
sec char(15)
);

delimiter //
create procedure abc()
begin
	declare x int default 1;
    while x < 10 do
		insert into temp values(x,'in while loop');
		set x=x+1;
	end while;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;