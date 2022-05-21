create table temp (
num int,
low int,
high int
);
select * from temp ;
drop table temp;

delimiter //
create procedure abc (d int)
begin
	declare x int ;
    select ran_num into x from num where ran_num = d ;
    if x between 1 and 10 then
		insert into temp values (x, '1 to 10') ;
	elseif x between 11 and 20 then 
		insert into temp values (x, '11 to 20') ;
	elseif x between 21 and 30 then 
		insert into temp values (x, '21 to 30') ;
	elseif x between 31 and 40 then 
		insert into temp values (x, '31 to 40') ;
	elseif x between 41 and 50 then 
		insert into temp values (x, '41 to 50') ;
	elseif x between 51 and 60 then 
		insert into temp values (x, '51 to 60') ;
	elseif x between 61 and 70 then 
		insert into temp values (x, '61 to 70') ;
	elseif x between 71 and 80 then 
		insert into temp values (x, '71 to 80') ;
	elseif x between 71 and 80 then 
		insert into temp values (x, '81 to 90') ;
	else
		insert into temp values (x, 'greater than 90') ;
	end if ;
end ; //
delimiter ;

delimiter //
create procedure pqr (d int)
begin
	declare x int ;
    declare m int default 0;
    declare o int default 0;
    declare n int default 0;
    select ran_num into x from num where ran_num = d;
    set m = x / 10 ;
    set o = ( m * 10  + 1 )-10;
    set n = o + 9 ;
    insert into temp values (x , o, n) ;
end; //
delimiter ;
call pqr(5) ;
call pqr(25) ;
call pqr(35) ;
call pqr(40) ;
call pqr(75) ;
call pqr(88) ;

create table num (
ran_num int
);
insert into num values(5),(12),(25),(35),(40),(75),(88); 
select * from num;
drop table num;

drop procedure pqr;
drop procedure abc;

