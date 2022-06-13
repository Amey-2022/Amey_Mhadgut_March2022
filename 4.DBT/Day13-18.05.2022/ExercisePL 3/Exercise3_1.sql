create table temp(
I int
);

delimiter //
create procedure abc()
begin
	declare i int default 100;
    while  i < 1001 do
		insert into temp values(i);
        set i=i+100;
	end while;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
drop table temp;    