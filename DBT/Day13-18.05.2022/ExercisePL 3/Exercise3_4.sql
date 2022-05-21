create table temp
(
fir varchar (20),
sec varchar (20)
);

delimiter //
create function palindrome(s varchar(20))
returns boolean
deterministic
begin
	if s=reverse(s) then
    return true;
    else 
    return false;
    end if;
end; //
delimiter ;

delimiter //
create procedure abc(a varchar(20))
begin
	if palindrome(a) then
		insert into temp values(a,'palindrome');
	else 
		insert into temp values(a,'not palindrome');
	end if;
end; //
delimiter //

call abc ('level');
call abc ('motor');
call abc ('amey');
call abc ('rotor');

select * from temp;

drop function palindrome;
drop procedure abc;
drop table temp;




    
    
