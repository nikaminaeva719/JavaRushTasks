-- Write your code here:
create table users
(
    user_id    int          not null auto_increment primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    date       date default current_date(),
    weight     float(10)    null
);