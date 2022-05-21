create table temp(
s1 char(20),
s2 char(20),
ans char(10)
);

delimiter //
create procedure abc(s1 char(20),s2 char(20))
begin 
	declare a int;
    set a=locate(s1,s2);
    if (a <> 0) then
		insert into temp values(s1,s2,'present');
	else
		insert into temp values(s1,s2,'absent');
	end if;
end; //
delimiter ;

call abc('amey', 'ameymhadgut');
call abc('amey', 'mhadgutamey');
call abc('abcd', 'abcfgasd');
call abc('abs', 'ameybhgts');
call abc('ands', 'ameymhadgut');

select * from temp;
drop procedure abc;
drop table temp;


    
