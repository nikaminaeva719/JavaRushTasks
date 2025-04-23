DROP TABLE IF EXISTS logic;

CREATE TABLE logic
(
    `a` int not null,
    `b` int not null
);

insert into `logic` (a, b)
values (0, 0),
       (0, 1),
       (1, 0),
       (1, 1),
       (0, 0),
       (0, 1),
       (1, 0),
       (1, 1),
       (0, 0),
       (0, 1),
       (1, 0),
       (1, 1),
       (0, 0);
;