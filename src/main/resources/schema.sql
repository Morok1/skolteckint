drop table if exists STATEMENT;
create table STATEMENT(
    id int not null primary key,
    date_value date not null,
    dater int not null,
    value int not null
);

insert into STATEMENT (id, date_value, dater, value) values (1,'2019-10-10', 1,1);
insert into STATEMENT (id, date_value, dater, value) values (2,'2019-11-10', 1,1);
insert into STATEMENT (id, date_value, dater, value) values (3,'2019-12-10', 1,1);
