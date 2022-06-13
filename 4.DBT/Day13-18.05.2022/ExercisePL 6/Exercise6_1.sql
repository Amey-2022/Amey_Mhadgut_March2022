create table temp(
principal float,
interest_rate float,
numberOfYears float,
interestAmount float,
TotalAmount float
);

delimiter //
create procedure comp_intr(p float,r float,y float)
begin
	declare i float;
    declare rate float;
    declare ta float;
    set rate=r/100;
    set i=(p*pow(1+rate,y))-p;
    set ta=p+i;
		insert into temp values(p,r,y,i,ta);
end; //
delimiter ;

call comp_intr(10000,10,1);
call comp_intr(10000,10,2);
call comp_intr(10000,10,3);

select * from temp;

drop procedure comp_intr;
drop table temp;


    
    