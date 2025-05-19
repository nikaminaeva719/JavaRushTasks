-- Write your code here:
select author.full_name, count(book.publisher_id) as publishers
from author
         left join book
                   on book.author_id = author.id
         left join publisher
                   on book.publisher_id = publisher.id
group by author.full_name;