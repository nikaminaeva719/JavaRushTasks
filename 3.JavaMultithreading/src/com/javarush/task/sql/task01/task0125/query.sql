-- Write your code here:
SELECT brand, model, booked_quantity
FROM car
where model NOT LIKE '%ea%';