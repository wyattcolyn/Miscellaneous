/*Lesson 15. Inserting Data
In this lesson, you will learn how to insert data into tables using the SQL
INSERT statement.*/
INSERT INTO Customers(cust_id,
			cust_contact,
			cust_email,
			cust_name,
			cust_address,
			cust_city,
			cust_state,
			cust_zip)
VALUES(1000000006,
		NULL,
		NULL,
		'Toy Land',
		'123 Any Street',
		'New York',
		'NY',
		'11111');

INSERT INTO Customers(cust_id,
			cust_name,
			cust_address,
			cust_city,
			cust_state,
			cust_zip,
			cust_country)
VALUES(1000000006,
		'Toy Land',
		'123 Any Street',
		'New York',
		'NY',
		'11111',
		'USA');
You may omit columns from an INSERT operation if the table definition so
allows. One of the following conditions must exist:
The column is defined as allowing NULL values (no value at all).
A default value is specified in the table definition. This means the
default value will be used if no value is specified.*/
-------------------------
CREATE TABLE CustNew
(
  cust_id      char(10)  NOT NULL ,
  cust_name    char(50)  NOT NULL ,
  cust_address char(50)  NULL ,
  cust_city    char(50)  NULL ,
  cust_state   char(5)   NULL ,
  cust_zip     char(10)  NULL ,
  cust_country char(50)  NULL ,
  cust_contact char(50)  NULL ,
  cust_email   char(255) NULL 
);
---------------------------
INSERT INTO CustNew(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country, cust_contact, cust_email)
VALUES('991', 'joe bleep', '888 bizz Lane', 'Detroit', 'juhy', '44444', 'USA', 'John Smith', 'sales@villagetoys.com');
INSERT INTO CustNew(cust_id, cust_name, cust_address, cust_city, cust_state, cust_zip, cust_country, cust_contact)
VALUES('992', 'john blorp', '333 South smegma Drive', 'Columbus', 'OH', '43333', 'USA', 'Michelle Green');
			cust_contact,
			cust_email,
			cust_name,
			cust_address,
			cust_city,
			cust_state,
			cust_zip,
			cust_country)
SELECT cust_id,
		cust_contact,
		cust_email,
		cust_name,
		cust_address,
		cust_city,
		cust_state,
		cust_zip,
		cust_country
FROM CustNew;
Any SELECT options and clauses may be used, including WHERE and GROUP BY.
Joins may be used to insert data from multiple tables.
Data may only be inserted into a single table regardless of how many tables
the data was retrieved from.*/