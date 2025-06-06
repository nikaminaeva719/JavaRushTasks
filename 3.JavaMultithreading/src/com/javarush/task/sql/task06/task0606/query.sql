-- Write your code here:
create table team
(
    id        int auto_increment primary key,
    position  varchar(50)  not null,
    full_name varchar(100) not null,
    number    int          not null
);

insert into team (position, full_name, number)
values ('Goalkeeper', 'Lev Yashin', 1),
       ('Right-back', 'Cafu', 2),
       ('Centre-back', 'Franz Beckenbauer', 3),
       ('Centre-back', 'Bobby Moore', 4),
       ('Left-back', 'Paolo Maldini', 5),
       ('Midfield', 'Johan Cruyff', 6),
       ('Midfield', 'Zinedine Zidane', 7),
       ('Midfield', 'Andrea Pirlo', 8),
       ('Midfield', 'Lothar Matthaus', 9),
       ('Striker', 'Pele', 10),
       ('Forward', 'Marco van Basten', 11);