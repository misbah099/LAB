use misbahdb;
create table College (
reg_no integer primary key auto_increment,
reg_holder varchar(20) not null,
department varchar(10),
shift_type varchar(10),
fees numeric(12,2),
pin numeric(4) unique not null
);