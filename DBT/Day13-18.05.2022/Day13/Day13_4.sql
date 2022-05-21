Delimiter //
Create procedure abc ()
Begin 
	Declare a int;
	Declare b varchar (15);
Declare c int;
Declare d int;
Declare y int default 0;
Declare c1 cursor for select * from emp_cursors for update;
Declare continue handler for not found set y = 1;
	
Open c1;
Cursor_c1_loop: loop
	Fetch c1 into a, b, c, d;
	If y =1 then 
		Leave cursor_c1_loop;
	End if;
	If c>7000 then
		delete from emp_cursors  where empno = a;
	End if;
End loop cursor_c1_loop;
Close c1;
Commit;
End; //
Delimiter ;


call abc();
select * from emp_cursors;

commit;
rollback; 

drop procedure abc;
truncate table temp;