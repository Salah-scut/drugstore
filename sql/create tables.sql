drop table employees;
create table employees
(
	employee_id varchar(9),
	employee_name varchar(20) not null,
	job_id int default 3 not null ,
	email varchar(30) null,
	department_id int null,
	password varchar(30) default '123' not null,
	constraint table_emp_id_pk
		primary key (employee_id)
);

drop table departments;
create table departments
(
    department_id int not null,
    department_name varchar(30) not null,
    address varchar(50) not null,
    manager_id varchar(9) not null,
    constraint table_dept_id_pk
        primary key (department_id),
    constraint table_dept_id_fk
        foreign key (manager_id) references employees(employee_id)
);

drop table drugs;
create table drugs
(
    drug_id varchar(30) not null ,
    drug_name varchar(30) not null ,
    manufacturer varchar(50) not null ,
    price float not null ,
    constraint table_drug_id_pk
        primary key (drug_id)
);