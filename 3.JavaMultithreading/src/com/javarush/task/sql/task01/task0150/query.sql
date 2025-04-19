-- Write your code here:
SELECT *
FROM parts
WHERE id BETWEEN 7 and 23
  AND identifier IS NULL
LIMIT 2;