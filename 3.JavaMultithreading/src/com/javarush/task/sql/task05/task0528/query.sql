-- Write your code here:
select distinct publisher.name
from publisher
         join book
              on publisher.id = book.publisher_id
         join author
              on book.author_id = author.id
where author.full_name = 'Mark Twain';