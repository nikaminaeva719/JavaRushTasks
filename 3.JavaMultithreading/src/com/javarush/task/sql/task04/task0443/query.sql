-- Write your code here:
select city
from cities
order by char_length(city) desc
limit 3;