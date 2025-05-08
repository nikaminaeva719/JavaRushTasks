-- Write your code here:
select concat(city, '-', char_length(city))
from cities
order by char_length(city) asc
limit 3;