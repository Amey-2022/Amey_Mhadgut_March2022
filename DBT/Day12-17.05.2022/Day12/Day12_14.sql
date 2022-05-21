create table temp(
fir int,
sec char(15)
);

delimiter //
create procedure abc()
begin
	declare x int default 1;
    repeat
		insert into temp values(x,'in loop');
        set x= x+1;
	until x > 5
    end repeat;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;
