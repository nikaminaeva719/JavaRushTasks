-- Write your code here:
select *
from event
where month(date_time) = month(curdate())
  and year(date_time) = year(curdate());