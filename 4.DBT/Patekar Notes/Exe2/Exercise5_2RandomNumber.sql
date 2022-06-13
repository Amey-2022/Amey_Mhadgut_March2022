delimiter //
create function random_number()
returns int
deterministic
begin
	return RAND()*(10-1)+1 ;
end ;//
delimiter ;

delimiter //
create procedure abc()
begin
	declare x int ;
    set x = random_number() ;
    insert into tempp values (x) ;
end ;//
delimiter ;

call abc();

create table tempp (
ran int ) ;