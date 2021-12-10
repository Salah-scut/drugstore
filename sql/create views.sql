use drugstore;
drop view department_manager;
create view department_manager
as
(select departments.department_id department_id,
        departments.department_name department_name,
        departments.address address,
        departments.manager_id manager_id,
        employees.employee_name manager_name
from departments, employees
where departments.manager_id=employees.employee_id);
