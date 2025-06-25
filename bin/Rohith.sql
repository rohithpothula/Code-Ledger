select * from contacts order by FIRST_NAME,LAST_NAME;
update contacts set first_name='adam' where contact_id=282;
select * from orders;
select count(*) from order_items;
select count(distinct product_id) from order_items;
select state from locations order by state NULLS first;

--where clause is used for filtering the rows 
-- = equality 
-- != , <> not equality 
-- > greater than
-- < less than
-- >= greater than or equal to 
-- <= less than or equal to 
-- IN in the list of values 

--exists return  true if subquery returns atleast one row 
select * from products;
select list_price from products where list_price>1000 and list_price<2000 order by LIST_PRICE desc;
select list_price from products where list_price between 1000 and 3000 order by list_price;

select product_name, description, category_id
from products 
where CATEGORY_ID in (select category_id from products where category_id between 2 and 4);

select * from products where PRODUCT_NAME like 'MSI%';

select first_name as forename , last_name as surname from EMPLOYEES;

select * from products;

select product_id , product_name , list_price - standard_cost as gross_price , LIST_PRICE , standard_cost from products;

select * from employees;

select * from employees where employee_id = manager_id;


select a.first_name first_name_employee , b.first_name first_name_manager 
from employees a inner join employees b 
 ON b.employee_id = a.manager_id;

select * from products order by product_id;
select * from products order by product_id fetch first 10 rows only;
select * from products order by product_id offset 3 rows fetch next 10 rows only;

select product_name,quantity from inventories inner join products using(product_id) order by quantity desc;

select * from orders;
select * from orders where status ='Pending' and SALESMAN_ID='55' and EXTRACT(month from order_date) = 2;

select * from customers where customer_id IN(select customer_id from orders);
select * from orders inner join order_items on orders.ORDER_ID = order_items.ORDER_ID order by orders.ORDER_DATE desc;

select * from orders;
select * from order_items;
select * from products;
select SUBSTR(product_name,1,4) from products;
select unit_price from order_items order by unit_price desc;
select unit_price from order_items order by unit_price desc offset 4 ROWS fetch first 1 rows only;
select min(salesman_id) from orders group by SALESMAN_ID;
select status from orders group by status;
select avg(quantity),product_id from order_items group by product_id;

select product_id , count(item_id) from order_items group by product_id;


--number of shipped orders for every customer 
select name,count(order_id) from orders inner join customers using(customer_id) where status = 'Shipped' group by name order by name;
select name , count(order_id) from orders a inner join customers b on a.CUSTOMER_ID=b.CUSTOMER_ID and a.STATUS='Shipped' group by name order by name; 
--having clause is used for group of rows where as WHERE clause is used for rows
select * from order_items;
--select order_id , sum(unit_price*quantity) from order_items where unit_price*quantity > 1000000 group by order_id order by order_id desc; 
select order_id , sum(unit_price*quantity) as order_value from order_items group by order_id having sum(unit_price*quantity) > 1000000 order by order_value desc;
--union

select first_name , last_name , email , 'contact' from contacts union select first_name , last_name , email , 'employee' from employees;


select first_name || ' ' || last_name as name from contacts; 
select first_name || ' ' || last_name as name , email , 'contact' from contacts union select first_name || ' ' || last_name as name , email , 'employee' from employees;

select product_name , length(product_name) from products;

select * from order_items;
select quantity from order_items order by quantity desc;
--find the second highest salary count i.e the number of times it is repeated 
select count(quantity) from order_items where quantity = (select max(quantity) from order_items where quantity < (select max(quantity) from order_items));

select quantity from order_items group by quantity order by quantity desc offset 4 rows fetch next 1 rows only;

-- if we want to find the nth higest salary the below is the query

--select quantity from order_items order by quantity desc offset n-1 rows fetch next 1 rows only;

select distinct(quantity) from order_items order by quantity desc offset 5 rows fetch next 1 rows only;
--without using fetch clause 
select quantity from order_items e1 where 2 = (select count(distinct(e2.quantity)) from order_items e2 where e2.quantity > e1.quantity);


select quantity from order_items o1 where 2 = (select count(distinct(quantity)) from order_items o2 where o2.quantity > o1.QUANTITY);