drop table employees cascade;
create table employees
(
	employee_id varchar(9),
	employee_name int not null,
	job_id int default 3 not null ,
	email varchar(30) null,
	department_id int null,
	password varchar(30) default '123' not null,
	constraint table_name_pk
		primary key (employee_id)
);

drop table stores cascade;
create table stores
(
    
);