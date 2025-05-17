-- Write your code here:
select full_name,
       count(*) as books
from book
         join author
              on author.id = book.author_id
group by book.author_id
having count(*) > 1;
