-- Write your code here:
# update employee
#     join task
#     on employee.id = task.id
# set salary = salary + 1000
# where exp_date > '2022-10-01';

update employee
set salary = salary + 1000
where employee.id in
      (select task.employee_id from task where exp_date > '2022-10-01');
