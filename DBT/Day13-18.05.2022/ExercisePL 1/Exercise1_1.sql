create table temp(
length float,
width float,
area float, 
perimeter float
);

delimiter //
create procedure abc()
begin
	declare l float default 12.5;
    declare w float default 6.25;
    declare a float;
    declare p float;
    set a=l*w;
    set p=2*(l+w);
    insert into temp values(l,w,a,p);
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
drop table temp;


