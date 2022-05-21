create table Test(id integer);
insert into Test values(1 ),(2),(3),(4),(5),(10);
select * from Test;
-- Your code here!

create table tempp (
radius float,
circumference float,
area float,
volume float
);

delimiter //
create procedure abc()
begin
        declare min float ;
        declare max float ;
        declare cir float ;
        declare area float; 
        declare volume float ;
        select id into min from Test where id = 2;
        select id into max from Test where id = 10;
        while min<=max do
            set area = 4 * (22/7) * min * min ;
            set cir = 2 * (22/7) * min ;
            set volume = (4/3 )*( 22/7) * min * min * min ;
            insert into tempp values (min, cir, area, volume) ;
        set min = min + 1;
        end while ;
end ; //
delimiter ;

call abc();
select * from tempp;