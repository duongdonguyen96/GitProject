-- tao customer_views
CREATE VIEW  customer_views AS
SELECT customerNumber, customerName, phone
FROM customers;
-- chon customer_views
SELECT * FROM customer_views;

-- tao customer_views2
CREATE VIEW customer_views2 AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'Nantes';

-- xoa customer_views2
DROP VIEW customer_views2;
