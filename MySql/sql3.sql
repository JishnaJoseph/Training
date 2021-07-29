insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(1,'1991-1-1','aa','bb','M','2015-1-11')
 insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(2,'1992-2-2','cc','dd','F','2015-2-12')
 insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
values(3,'1993-3-3','ee','ff','M','2015-2-13')
insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(4,'1994-4-4','gg','hh','F','2015-3-14')
insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(5,'1995-5-5','ii','jj','M','2015-5-14')
 insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(6,'1996-6-6','kk','ll','F','2015-6-15')
 insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(7,'1997-7-7','mm','nn','M','2015-7-16')
 insert into employees (emp_no,birth_date,first_name,last_name,gender,hire_date)
 values(8,'1998-8-8','oo','pp','F','2015-8-18')
 
 select * from employees
 
 insert into departments(dept_no,dept_name)
 values('a','IT')
  insert into departments(dept_no,dept_name)
 values('b','EEE')
  insert into departments(dept_no,dept_name)
 values('c','EC')
  insert into departments(dept_no,dept_name)
 values('d','CS')
  
 
 select * from departments
 
 DELETE FROM departments WHERE dept_no='h';
 
 insert into dept_emp(emp_no,dept_no,from_date,to_date)
 insert into dept_emp values(1,'a','2015-1-11','2020-1-11')
insert into dept_emp values(2,'b','2015-2-12','2020-1-11')
insert into dept_emp values(3,'c','2015-3-13','2020-1-11')
insert into dept_emp values(4,'d','2015-4-14','2020-1-11')
insert into dept_emp values(5,'c','2015-5-14','2020-1-11')
insert into dept_emp values(6,'a','2015-6-15','2020-1-11')
insert into dept_emp values(7,'b','2015-7-16','2020-1-11')
insert into dept_emp values(8,'c','2015-8-18','2020-1-11')
 select * from dept_emp
 
 UPDATE dept_emp
SET from_date = '2015-7-16'
WHERE emp_no=7;

 
insert into dept_manager values('a',10,'2010-1-11','2021-7-22')
insert into dept_manager values('b',11,'2010-2-12','2021-7-22')
insert into dept_manager values('c',12,'2010-3-13','2021-7-22')
insert into dept_manager values('d',13,'2010-4-14','2021-7-22')
insert into dept_manager values('e',14,'2010-5-15','2021-7-22')
insert into dept_manager values('f',15,'2010-6-16','2021-7-22')
insert into dept_manager values('g',16,'2010-7-17','2021-7-22')
insert into dept_manager values('h',17,'2010-8-18','2021-7-22')
 select * from dept_manager
  DELETE FROM dept_manager WHERE dept_no='h';
 
insert into titles values(1,'HO','2015-1-11','2015-1-13')
insert into titles values(2,'HR','2015-2-12','2020-1-11')
insert into titles values(3,'manager','2015-3-13','2020-1-11')
insert into titles values(4, 'manager','2015-4-14','2020-1-11')
insert into titles values(5, 'Asst.manager','2015-5-14','2020-1-11')




insert into salaries values(1,120000,'2021-01-20','2021-07-21');
insert into salaries values(2,40000,'2021-03-21','2021-07-19');
insert into salaries values(3,12356,'2021-07-21','2021-07-20');
insert into salaries values(4,35600,'2020-03-21','2021-07-18');
insert into salaries values(5,23000,'2019-03-21','2021-07-17');
