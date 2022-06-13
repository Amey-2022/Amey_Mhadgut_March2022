create table temp(
fir int,
sec char(15)
);


Delimiter //
Create procedure abc()
Begin 
	Declare x int;
	Select sal into x from emp where ename ='Kirun';
	If x > 3000 then 
		Insert into temp values (x,'High sal') ;
	Else
		If x < 3000 then
			Insert into temp values (x,'Low sal') ;
		Else 
			Insert into temp values (x,'Medium sal') ;
		End if;

	End if;
End ; //
Delimiter ;

call abc();
select * from temp;

drop procedure abc;
truncate table temp;
