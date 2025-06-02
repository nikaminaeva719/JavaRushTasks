-- Write your code here:
# create index position_index on employee (position);
#
# create index salary_index on employee (salary);

alter table employee
    add index position_index (position),
    add index salary_index (salary);