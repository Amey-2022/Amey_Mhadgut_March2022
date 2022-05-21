/*2. Write a program that examines all the numbers from 1 to 999,
 displaying all those for which the sum of the cubes of the digits equal the number itself.*/


create table arm (num integer);

delimiter //
create procedure abc()
begin
    declare i integer default 1;
    
    declare tmp integer;
    declare n integer ;
    declare s integer default 0;
      while i <1000 do
      set tmp=i;
          while i!=0 do
          set n = mod(i,10) ;
          set s = s + pow(n,3) ;
          set i = truncate(i/10,0) ;
        end while;
        if tmp = s then
          insert into arm values (s);
        end if ;
        set i = tmp + 1;
        set s = 0;
      end while ;
end ; //
delimiter ;

call abc();
select * from arm;