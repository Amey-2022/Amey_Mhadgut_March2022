
create table temp
(
FIR char(1),
SEC char(1)
);

desc temp;

Show variables LIKE '%recur%';
SET @@GLOBAL.max_sp_recursion_depth = 255;

 -- 20:06:55	call toh(3,'A','B','C')	Error Code: 1456. Recursive limit 0 (as set by the max_sp_recursion_depth variable) was exceeded for routine toh	0.016 sec

 call toh(3,'A','B','C');


delimiter //
create procedure toh(n int , s char(1), inter char(1), d char(1))
begin
IF  n=1 THEN
   insert into temp values (s,d);
ELSE
    call toh(n-1 ,s,d,inter);
	insert into temp values (s,d);
	call toh(n-1,inter,s,d);
END IF;
END;
delimiter;
