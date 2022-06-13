delimiter //
create function rev(str varchar(100))
returns varchar(100)
deterministic
begin
	return reverse(str) ;
end ; //
delimiter ;

delimiter //
create procedure abc(str1 varchar(100))
begin
	declare s varchar (100);
    set s = rev(str1) ;
	insert into tempp values (str1,s);
end ; //
delimiter ;
	
call abc('yema');

create table tempp (
fir varchar(100),
sec varchar(100)
);
select * from tempp;