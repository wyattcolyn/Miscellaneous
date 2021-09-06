/*Lesson 18. Using Views
In this lesson, you�ll learn exactly what views are, how they work, and when
they should be used. You�ll also see how views can be used to simplify some of
the SQL operations performed in earlier lessons.*/

SELECT cust_name, cust_contact
FROM Customers, Orders, OrderItems
WHERE Customers.cust_id = Orders.cust_id
AND OrderItems.order_num = Orders.order_num
AND prod_id = 'RGAN01'; --from lesson 12

CREATE VIEW ProductCustomers AS
SELECT cust_name, cust_contact, prod_id
FROM Customers, Orders, OrderItems
WHERE Customers.cust_id = Orders.cust_id
AND OrderItems.order_num = Orders.order_num;

SELECT cust_name, cust_contact
FROM ProductCustomers
WHERE prod_id = 'RGAN01'; --ProductCustomers is a view
--retrieve a list of customers who ordered product RGAN01

SELECT * FROM ProductCustomers;  --every customer who ordered anything

/*Views contain no data themselves, so the data they return is retrieved
from other tables. When data is added or changed in those tables, the views will
return that changed data. */

/*Renaming Views
To remove a view, you use the DROP statement. The syntax is simply DROP
VIEW viewname;.
To overwrite (or update) a view, you must first DROP it and then re-create it.*/

SELECT RTRIM(vend_name) + ' (' + RTRIM(vend_country) + ')'
AS vend_title
FROM Vendors
ORDER BY vend_name;  --lesson 7
quantity,
item_price,
quantity*item_price AS expanded_price
FROM OrderItems
WHERE order_num = 20008;  --lesson 7
/* CREATE VIEW CustomersWithOrders1 AS
SELECT Customers.cust_id,
       Customers.cust_name,
       Customers.cust_address,
       Customers.cust_city,
       Customers.cust_state,
       Customers.cust_zip,
       Customers.cust_country,
       Customers.cust_contact,
       Customers.cust_email
FROM Customers
JOIN Orders ON Customers.cust_id = Orders.cust_id;

SELECT * FROM CustomersWithOrders; */
SELECT order_num,
       prod_id,
       quantity,
       item_price,
       quantity*item_price AS expanded_price
FROM OrderItems
ORDER BY order_num;  --challenge 2

