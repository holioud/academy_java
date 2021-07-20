show tables;

create table customer(no int(4) auto_increment primary key,
						name varchar(20),
						email varchar(20),
						tel varchar(20));

alter table customer add (address varchar(50));

alter table customer add(reg_date timestamp);

desc customer;


select * from board;
select * from board order by desc limit 0,5;
create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
    passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp );