-- Write your code here:
select distinct book.title
from book
         join author
              on book.author_id = author.id
where author.full_name = 'Edgar Allan Poe';