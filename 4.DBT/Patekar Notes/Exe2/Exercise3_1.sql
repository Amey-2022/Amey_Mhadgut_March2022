create table tempp(
I int
);

delimiter //
create procedure abc()
begin
	declare i int default 100;
    repeat
		insert into tempp values (i);
        set i =i + 100;
    until i>1000
    end repeat;
end; //
delimiter ;

call abc();
select * from tempp;

drop procedure abc;
drop table tempp;
