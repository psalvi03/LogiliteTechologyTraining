--This Sql Query Are Perform in PostGrey SQL


--Create Database

CREATE DATABASE "Employee_DB";


--Create Table

CREATE TABLE PERSONE(
     PID integer not null primary key,
     PNAME text not null, 
     AGE integer not null,ADDRS text
);

CREATE TABLE Employee (
    eid integer NOT NULL primary key,
    pid integer NOT NULL,
    dept text,
    CONSTRAINT FK_PID FOREIGN KEY (pid)
    REFERENCES Person(pid)
)



--Insert record into Person Table

INSERT INTO public.person (
pid, pname, age, addrs) VALUES (
'111'::integer, 'prahlad'::text, '24'::integer, 'cor'::text)
 returning pid;

-- Insert record into Employee Table
INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'102'::integer, 'SDE1'::text, '50000'::integer)
 returning eid;

INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'103'::integer, 'SDE2'::text, '40000'::integer)
 returning eid;

INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'104'::integer, 'tester'::text, '35000'::integer)
 returning eid;

INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'105'::integer, 'Project Manager'::text, '80000'::integer)
 returning eid;

INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'106'::integer, 'HR'::text, '55000'::integer)
 returning eid;

INSERT INTO public."Employee" (
pid, desg, salary) VALUES (
'107'::integer, 'Java developer'::text, '35000'::integer)
 returning eid;

--Select operation

Select * from person;

Select * from employee;

-- Where cluse

Select * from employee where pid=105;

Select * from employee where pid between 104 and 107;

Select * from person where age>30;

Select * from employee where desg='SDE1';

Select pid,pname from person ;

--String pattern

Select pid,pname from person where age<25 AND pname like 's%';

Select pid,pname from person where  pname like '%m';

Select pid,pname from person where  pname like 'r___';

--Order by

select * from employee order by desg desc;
select * from employee order by salary desc;

-- IN Cluse

Select pname from person where addrs in ('nbh','cor');

--Group by cluse
select count(*),desg
from employee group by desg;

--Inner Join, Alias name 
select eid,pname,salary
from person as p inner join employee as e on p.pid=e.pid
where e.salary>40000 AND e.salary<60000;

--Outer left join 
select eid,pname,salary
from person as p left outer join employee as e on p.pid=e.pid;

--Outer right join 
select eid,pname,salary
from person as p left outer join employee as e on p.pid=e.pid;

--UNION
select * from person where pname like'k%'
union
select * from person where addrs='nbh';

-- Distinct

select distinct addrs from person;

-- Predefine function

select upper(pname) from person;
select lower(pname) from person;

SELECT SUBSTR(pname, 1, 3) from person;

select count(*) as salary from employee where salary>40000;

select max(salary) from employee
union
select min(salary) from employee;

select sum(salary) from employee;

