-- Write your code here:
SELECT description
FROM parts
ORDER BY required DESC, identifier DESC, description DESC
LIMIT 12 OFFSET 23;