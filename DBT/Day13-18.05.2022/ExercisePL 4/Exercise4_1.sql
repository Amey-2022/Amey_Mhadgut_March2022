create table Customer(
Meter_num varchar(4),
Meter_Type char(1),
Previous_Reading int,
Current_reading int,
Customer_Type char(1),
Last_Bill_Payment char(1)
);

create table Customer_Bill(
Meter_num varchar(4),
Units_used int,
Rate float,
Amount float,
Surcharge float,
Excise float,
Net float
);


delimiter //
create function surcharge(amt float,mt char(1))
returns float
deterministic 
begin
		if mt='S' then
			return 0.05*amt;
		elseif mt='T' then
			return 0.1*amt;
		end if;
end; //
delimiter ;

delimiter //
create procedure abc(mn varchar(4),mt char(1),prv int,cur int,ct char(1),lbp char(1))
begin
	declare u int;
    declare amt float;
    declare sur float;
    declare exec float;
    declare net float;
    declare rate float;
		if ct='A' then
		set rate=1;
		elseif ct='I' then
		set rate=1.25;
		elseif ct='C' then
        set rate=1.5;
		elseif ct='R' then
		set rate=1.3;
        end if;
        
        set u=(cur-prv);
        set amt=(rate*u);
        set sur=surcharge(amt,mt);
        set exec=(0.3*(amt+sur));
        set net= (amt+sur+exec);
        
        insert into Customer values(mn,mt,prv,cur,ct,lbp);
        insert into Customer_Bill values(mn,u,rate,amt,sur,exec,net);
end; //
delimiter ;

call abc('A100','T',150,200,'A','Y');
call abc('A101','S',6548,6845,'I','Y') ;
call abc('A102','T',1515,1720,'c','Y') ;
call abc('A103','S',150,200,'R','Y') ;
call abc('A104','T',150,200,'R','Y') ;

select * from Customer;
select * from Customer_Bill;

drop table Customer;
drop table Customer_Bill;

drop procedure abc;
drop function surcharge;



	
        
        