CREATE TABLE dept_testpaper2(
  DEPTNO INT NOT NULL,
  DNAME VARCHAR(15) NULL,
  LOC VARCHAR(10) NULL,
  PRIMARY KEY (DEPTNO));
  
INSERT INTO dept_testpaper2 (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept_testpaper2 (DEPTNO, DNAME, LOC) VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO dept_testpaper2 (DEPTNO, DNAME, LOC) VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO dept_testpaper2 (DEPTNO, DNAME, LOC) VALUES (40, 'OPERATIONS', 'BOSTON');

select * from dept_testpaper2;

create table emp_testpaper2(
EMPNO INT,
ENAME VARCHAR(15),
JOB VARCHAR(9),
HIREDATE DATE,
SAL FLOAT,
COMM FLOAT,
DEPTNO INT	
);

select * from emp_testpaper2;
desc emp_testpaper2;

insert into emp_testpaper2 values
(7839,'KING','MANAGER','1991-11-17',5000,NULL,10),
(7698,'BLAKE','CLERK','1981-05-01',2850,NULL,30),
(7782,'CLARK','MANAGER','1981-06-09',2450,NULL,10),
(7566,'JONES','CLERK','1981-04-02',2975,NULL,20),
(7654,'MARTIN','SALESMAN','1981-09-28',1250,1400,30),
(7499,'ALLEN','SALESMAN','1981-02-20',1600,300,30);


select ename from emp_testpaper2
where hiredate like '____-02%';


select ename from emp_testpaper2
where ename like '%m';

select ename,job from emp_testpaper2
where deptno =
(select deptno from emp_testpaper2 where ename='King');

select ename,sal*0.2 as "HRA" from emp_testpaper2;

select distinct job from emp_testpaper2;

select ename,dname from emp_testpaper2,dept_testpaper2
where emp_testpaper2.deptno=dept_testpaper2.deptno;

select ename,deptno from emp_testpaper2
order by deptno;

select ename from emp_testpaper2
where comm is null;

select ename "NAME",empno "NUMBER" from emp_testpaper2;

select ename from emp_testpaper2
where sal=
(select max(sal) from emp_testpaper2);

select sum(sal) from emp_testpaper2
where deptno = 10;

select * from emp_testpaper2
where job like '%T';



create table Ce_to_Fe(
Celcius float,
Fahrenheit float);

delimiter //
create procedure C_to_F(C float)
begin
	declare F float;
    set F=9/5*C+32;
    insert into Ce_to_Fe values(C,F);
end; //
delimiter ;

call C_to_F(38);
select * from Ce_to_Fe;

create table NUMR_CUBE(
NUMB float,
NUMB_CUBE float
);

delimiter //
create function  Num_cube(num float)
returns float
deterministic
begin
     return num*num*num;
end; //
delimiter ;

delimiter //
create procedure forcube(y float)
begin
	declare	 x float;
    set x = Num_cube(y);
    insert into NUMR_CUBE values (y,x);
end; //
delimiter ;
call forcube(10);
call forcube(12.35);
select * from NUMR_CUBE;

drop procedure C_to_F;
drop function Num_cube;
drop procedure forcube;


drop table dept_testpaper2;
drop table emp_testpaper2;
drop table Ce_to_Fe; 
drop table NUMR_CUBE;















