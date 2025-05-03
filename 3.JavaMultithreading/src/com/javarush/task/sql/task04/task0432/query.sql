-- Write your code here:
select monthname(date),
       count(*)
from event
where status in ('ERROR', 'FAILED')
group by monthname(date)
order by count(*) desc
limit 1;