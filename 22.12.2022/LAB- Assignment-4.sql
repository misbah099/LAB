USE misbahdb;
create table CustomerLab(
Cust_id varchar(5) primary key,
Fname varchar(10)not null,
Lname varchar(10)not null,
Area varchar(5)not null,
Phone bigint);

insert into CustomerLab values
('A01','Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU',5560379),
('A03','Pramada','Jauguste','DA',4560389),
('A04','Basu','Navindi','BA',6125401),
('A05','Ravi','Shridhar','NA',null),
('A06','Rukmini','Aiyer','GH',5125274);
create table Movie(
Mv_no int primary key,
Cust_id varchar(4),foreign key(Cust_id) references CustomerLab(Cust_id),
Title varchar(20)not null,
Star varchar(5)not null,
Price bigint );
select * from CustomerLab;
insert into Movie values
(1,'A01','Bloody','JC',181),
(2 ,'A04','The Firm','TC',200),
(3,'A01','Pretty Woman','RG',151),
(4,'A06','Home Alone','MC',150),
(5,'A05','The Fugitive','MF',200),
(6,'A03','Coma','MD',100),
(7,'A02','Dracula','GO',150),
(8,'A06','Quick Change','BM',100),
(9,'A03','Gone with the Wind','CB',200),
(10,'A05','Carry on Doctor','LP',100);
select * from Movie;
#2. Prove that entity integrity constraint is ensured by both the tables. (2 conditions to be checked).

#3. Prove that referential integrity constraint is ensured by both the tables.

#4. Prove that domain integrity constraint is ensured by the Movie table.

#5. Display the movie titles, whose price is greater than 100 but less than 200
select Title from Movie where price>100 and price<200;
#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id from Movie where star='JC'  OR star='TC' OR star='MC';
#7. Display the details of those customers who have an A in their area name.
select * from CUSTOMERLAB where area like 'A%' or area like'%A%' or area like '%A';
# 8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select * from Movie where Price<=180 and length(Title)=6;
# 9. Display the movie name, their original prices and the prices after 10% increment. Give alias name to the incremented price column.
select title,price,price+10/100*price as 'Increment price' from Movie;
# 10.Display all the customer details in the following way: ‘Ivan Ross stays in SA and his phone number is 6125467.’
select* from Customerlab where Fname='Ivan' and  Lname='Ross' and area='SA' and phone=6125467;
# 11.Add a not null constraint to the Lname field in Customer.
alter table customerlab modify Lname varchar(15) not null;
#12 12.Display the customer’s name whose phone number is not recorded
select Fname,Lname Customerlab where phone= null;
# 13.Add the phone number according to your own wish for the person mentioned in problem no 12.
update customerlab set phone=123445 where cust_id='A05';
#14.Display the unique customer ids from movie table.
select cust_id from movie ;
# 15.Remove the not null constraint from Star column in movie table.
alter table movie drop column star;
# 16.Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from Customerlab where cust_id='A05'; #cannot delete or update a parent key
#17.Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from Movie where price=200;
#18.Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customerlab; #cannot drop referenced by a foreign key
#19.Drop the Movie table. If you cannot drop, then note the error message displayed
drop table Movie; 
#20.Drop the foreign key from Movie table.
alter table movie drop column cust_id;