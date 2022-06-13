create table temp(
random_num int
);

delimiter //
create function random_number()
returns int
deterministic
begin
		return rand()*(10-1)+1;
end; //
delimiter ;


delimiter //
create procedure abc()
begin
	declare x int;
    set x= random_number();
    insert into temp values(x);
end; //
delimiter ;

call abc();

select * from temp;
drop procedure abc;
drop function random_number;
drop table temp;
