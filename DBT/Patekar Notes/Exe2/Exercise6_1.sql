create table tempp (
principal float,
rateOfInterest float,
numberOfYears float,
Interest float,
TotalAmount float
);


delimiter //
create procedure Comp_intr (p float, r float, y float)
begin
	declare i float ;
    declare ta float ;
    declare rate float ;
    set rate = r /100;
    set i = (p * power(1+rate,y)) - p ;
    set ta = p + i ;
    insert into tempp values (p, r, y , i, ta) ;
end; //
delimiter ;

call Comp_intr(10000,10,2);
call Comp_intr(10000,12,2);
select * from tempp;


