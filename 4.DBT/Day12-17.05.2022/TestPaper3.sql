create table author (
author_id integer primary key, 
authorName varchar(30),
 email varchar (25),
 gender varchar (6)
 );
 
 create table book (
 BookId integer not null unique,
 ISBN integer primary key, 
 book_name varchar (30) not null, 
 author integer,
 ed_num integer, 
 price integer,
 pages integer, 
 foreign key (author) references author (author_id) );
 
 insert into author values 
(1, "Kraig Muller", "Wordnewton@gmail.com", "Male"),
(2, "Karrie Nicolette", "karrie23@gmail.com", "Female");

insert into book values
(1, 001, "Glimpses of the past", 1, 1, 650, 396),
(2, 002, "Beyond The Horizons of Venus", 1, 1, 650, 396),
(3, 003, "Ultrasonic Aquaculture", 2, 1, 799, 500),
(4, 004, "Cyrogenic Engines", 2, 1, 499, 330);

select * from author;

delimiter //
create procedure bookdetails()
begin
	select * from book;
end; //
delimiter ;

call bookdetails();

delimiter //
create procedure updateprice(x int, y int)
begin
	update book
    set price=y 
    where ISBN = x;
end; //
delimiter ;

call updateprice(1,670);
select * from book;

delimiter //
create procedure highestprice()
begin
	select * from book
    where price =
    (select max(price) from book);
end; //
delimiter ;

call highestprice();

delimiter //
create procedure gendercount(x char(6))
begin
	declare c int;
    if x= 'male' then 
    set c = (select count(*) from author where gender = 'male');
    insert into temp values(c,'Male');
    else
     set c = (select count(*) from author where gender = 'female');
     insert into temp values(c,'Female');
     end if;
end; //
delimiter ;

call gendercount('male');
call gendercount('female');
select * from temp;

drop procedure bookdetails;
drop procedure highestprice;
drop procedure updateprice;
drop procedure gendercount;











