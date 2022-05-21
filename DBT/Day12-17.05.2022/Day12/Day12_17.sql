delimiter //
create procedure abc()
begin
	declare a int;
    declare b varchar(15);
    declare c int;
    declare d int;
    declare hra int;
    declare x int default 0;
    declare c1 cursor for select * from emp_cursors;
    open c1;
    while x < 3 do 
			fetch c1 into a,b,c,d;
            set hra=0.4*c;
            insert into temp values (hra,b);
            set x=x+1;
	end while;
    close c1;
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;


