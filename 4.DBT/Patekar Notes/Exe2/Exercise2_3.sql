create table temp
(
year_ int 
);
insert into temp values (2001),(1954),(1700),(2022),(2020),(2000);
select * from temp;

create table tempp
(Leapyear char(5));


drop table tempp;
drop table temp;

delimiter //
create procedure abc (d int)
begin	
	declare x int;
	select year_ into x from temp where year_=d;
    if (x % 4 =0 and not x%100=0 ) or (x%4=0 and x %400=0) then
		insert into tempp values ('YES') ;
    else 
		insert into tempp values ('NO') ;
    end if ;
end; //
delimiter ;

call abc (2001);
call abc (1954);
call abc (1700);
call abc (2022);
call abc (2000);
call abc (2020);

select * from tempp;
drop procedure abc;