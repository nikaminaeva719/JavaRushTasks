-- Write your code here:
SELECT id, salary, department, name
FROM employee
WHERE department = 'dev'
  AND salary < 5000;