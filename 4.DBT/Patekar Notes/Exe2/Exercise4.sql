create table customer (
Meter_Number Varchar (4),
Meter_Type Char (1),
Previous_Reading Int ,
Current_Reading Int,
Customer_Type Char(1),
Last_Bill_payment Char(1)
);

create table Electricity_Bill (
Amount float,
Surcharge float,
Excise float,
Net float
);

delimiter //
create function amount (units int,ct char(1))
returns float
deterministic
begin
	if ct = 'A' then
     return units*1 ;
	elseif ct = 'I' then
     return units*1.25 ;
	elseif ct = 'C' then
     return units*1.50 ;
	elseif ct = 'R' then
     return units*1.30 ;
	end if ;
end ; //
delimiter ;

delimiter //
create function surcharge (amt float,mt char(1))
returns float
deterministic
begin
	if mt='S' then 
		return 0.05 * amt;
	elseif mt='T' then 
		return 0.10 * amt;
	end if;
end ;//
delimiter ;

delimiter //
create procedure abc(mn varchar(4),mt char(1), prv int, cur int , ct char(1), lbp char(1))
begin
	declare u int ;
    declare amt float;
    declare sur float;
    declare exc float;
    declare net float ;
    set u = cur-prv ;
    set amt= amount(u,ct) ;
    set sur = surcharge (amt,mt) ;
    set exc = 0.30 * (amt+sur) ;
    set net = amt + sur + exc ;
    insert into customer values (mn,mt,prv,cur,ct,lbp) ;
    insert into Electricity_Bill values (amt,sur,exc,net) ;
end ; //
delimiter ;

call abc('A100','T',150,200,'A','Y') ;
call abc('A101','S',6548,6845,'I','Y') ;
call abc('A102','T',1515,1720,'c','Y') ;
call abc('A103','S',150,200,'R','Y') ;
call abc('A104','T',150,200,'R','Y') ;

select * from electricity_bill;
select * from customer;




