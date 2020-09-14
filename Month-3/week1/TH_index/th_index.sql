
-- show index cua customers
show indexes from customers;
-- creat indexCustomerName
CREATE INDEX indexCustomerName on customers(customerName);
-- delete indexCustomerName
DROP INDEX indexCustomerName on customers

