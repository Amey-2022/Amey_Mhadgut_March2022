create table temp(
fir int,
sec char(15)
);

delimiter //
create procedure abc()
begin
	declare x int default 1;
    pqr_loop:loop
				if x > 10 then
						leave pqr_loop;
				end if;
                set x=x+1;
                if mod(x,2) != 0 then
						iterate pqr_loop;
				else
					insert into temp values(x,'loop');
				end if;
			end loop;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;

