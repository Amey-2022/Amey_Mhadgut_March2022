delimiter //
create procedure abc(dd int)
begin
    declare a int;
    declare b varchar(15);
    declare c int;
    declare d int;
    declare hra float;
    declare y int default 0;
    declare c1 cursor for select * from emp_cursors where deptno=dd;
    declare continue handler for not found set y=1;
    open c1;
    cursor_c1_loop:loop
			fetch c1 into a,b,c,d;
            if y = 1 then 
				leave  cursor_c1_loop;
                end if;
            set hra=0.4*c;
            insert into temp values (c,b);
		end loop cursor_c1_loop;
    close c1;
end; //
delimiter ;

call abc(1);
call abc(2);
select * from temp;

drop procedure abc;
truncate table temp;


