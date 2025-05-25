-- Write your code here:
use test;
drop table if exists cars;

CREATE TABLE cars
(
    `id`          int          not null auto_increment primary key,
    `brand`       varchar(255) not null,
    `model`       varchar(255) not null,
    `year`        int          not null,
    'engine'      varchar(255) not null,
    `consumption` double       not null
);


insert into cars (brand, model, year, engine, consumption)
values ('Lexus', 'IS', 2017, 'petrol', 7.5),
       ('Volvo', 'XC90', 2019, 'diesel', 8.5),
       ('Volkswagen', 'Golf', 2020, 'petrol', 8),
       ('Toyota', 'Corolla', 2015, 'petrol', 10),
       ('BMW', '5', 2005, 'petrol', 15.5),
       ('Ford', 'Transit', 2010, 'diesel', 9);