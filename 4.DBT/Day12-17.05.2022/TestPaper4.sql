create table DEPT4(
DEPTNO int,
DNAME varchar(15),
LOC varchar(10)
);

insert into DEPT4 values
(10,'ACCOUNTING','NAINITAL'),
(20,'RESEARCH','DEHRADUN'),
(30,'SALES','CHENNAI'),
(40,'OPERATIONS','BILASPUR');

select * from dept4;

create table emp4(
EMPNO			int,
ENAME			varchar(10),
JOB				varchar(9),
HIREDATE		date,
SAL				float,
COMM			float,
DEPTNO			int
);

insert into emp4 values
(7839,	'KAILASH'	,	'MANAGER'	,'1991-11-17'	,5000	,NULL	,10),
(7698,	'BELA'	,		'CLERK',	'1981-05-01'	,2850	,NULL,	30),
(7782,	'CHETAN'	,	'MANAGER'	,'1981-06-09'	,2450	,NULL	,10),
(7566,	'JASPREET',		'CLERK',	'1981-04-02',	2975	,NULL ,20),
(7654,	'MAMTA',		'SALESMAN',	'1981-09-28'	,1250	,1400	,30),
(7499,	'AMAR',		'SALESMAN'	,'1981-02-20'	,1600	,300	,30 );

select * from emp4;

select last_day(HIREDATE) from emp4;

select  ename,sal,sal*12 "Anuual Sal" from emp4;

select ename,job from emp4 
where deptno =
(select deptno from emp4 where ename='king');

select replace(ename,'A','a') from emp4;

select ename as "NAME",empno as "NUMBER" from emp4;

select ename,sal from emp4
where sal=
(select max(sal) from emp4);

select deptno,sum(sal) from emp4
where deptno=10;

select job from emp4
where job like '%T';



delimiter //
create procedure HRA_cal(empno int,deptno int,sal float)
begin
	declare hra float; 
	if deptno=10 then 
		set hra=0.2*sal*12;
    elseif deptno=20 then
		set hra=0.3*sal*12;
    else 
		set hra=0.1*sal*12;
    end if;
    insert into temp values(empno,deptno,sal,hra);
end; //
delimiter ;

create table temp(
empno int,
deptno int,
sal float,
hra float
);

call  HRA_cal(7839,10,5000);
call  HRA_cal(7698,30,2850);
call  HRA_cal(7566,20,2975);

select * from temp; 

delimiter //
create function cube_(num int)
returns int
deterministic
begin
	return num*num*num;
end; //
delimiter ;

select cube_(10) from dual;

drop procedure HRA_cal;
drop function cube_;

    
    



