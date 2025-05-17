-- Write your code here:
select book.publication_year,
       book.isbn,
       book.title,
       author.full_name as author,
       publisher.name   as publisher
from book
         join author
              on book.author_id = author.id
         join publisher
              on book.publisher_id = publisher.id;