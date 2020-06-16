insert into alien
values (1, 'jack', 'java');
insert into alien
values (2, 'franklin', 'c++');
insert into alien
values (3, 'Lincoln', 'html');
insert into alien
values (4, 'rita', 'css');
insert into alien
values (5, 'tom', 'js');
insert into alien
values (6, 'jerry', 'go1');
insert into topic
values (1, 'spring', 'spring topic');
insert into topic
values (2, 'java', 'java topic');
insert into topic
values (3, 'c++', 'c++ topic');
insert into topic
values (4, 'json', 'json topic');
insert into course
values ('1', 'java-', 'stream course', (select id from topic where id = '1'));
insert into course
values ('2', 'python-', 'python course', (select id from topic where id = '2'));
insert into course
values ('3', 'c++-', 'c++ course', (select id from topic where id = '3'));
insert into course
values ('4', 'json-', 'json course', (select id from topic where id = '4'));