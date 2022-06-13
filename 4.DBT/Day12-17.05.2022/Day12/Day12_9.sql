create table temp(
fir int,
sec char(15)
);

delimiter //
create procedure abc()
begin 
	Declare x Boolean default FALSE;
	if not x then 
		insert into temp values (1,'Mumbai');
	end if;
End ; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;