create table temp(
num float,
num_square float,
num_cube float 
);

delimiter //
create procedure abc()
begin
	declare num float default 17.35;
    declare square float;
    declare cube_ float;
    set square=num*num;
    set cube_=num*num*num;
    insert into temp values(num,square,cube_);
end; //
delimiter ;

call abc();
select * from temp;

drop procedure abc;
drop table temp;
    
    