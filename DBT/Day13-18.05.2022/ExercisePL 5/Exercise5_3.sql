create table temp(
orig_str varchar(100),
change_str varchar(100)
);

delimiter //
create function change_str(s1 varchar(100))
returns varchar(20)
deterministic
begin
		return reverse(s1);
end; //
delimiter ;


delimiter //
create procedure abc(s1 varchar(20))
begin
	declare x varchar(100);
    set x= change_str(s1);
    insert into temp values(s1,x);
end; //
delimiter ;

call abc('Amey');

select * from temp;

drop procedure abc;
drop function change_str;
drop table temp;

