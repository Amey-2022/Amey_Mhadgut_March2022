delimiter //
create function palindrome (p varchar(20))
returns boolean
deterministic
begin
	if p = reverse (p) then
	return true ;
    else
    return false;
    end if ;
end ; //
delimiter ;

delimiter //
create procedure abc(a varchar(20))
begin
	-- declare a varchar(20) default 'level' ;
    if palindrome(a) then
        insert into tempp values (a,'IS PALINDROME') ;
	else
		 insert into tempp values (a,'NOT PALINDROME') ;
	end if ;
end ; //
delimiter ;

call abc ('level');
call abc ('motor');
call abc ('amey');
call abc ('rotor');

Create table tempp
(
fir varchar (20),
sec varchar (20)
);