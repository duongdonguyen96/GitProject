-- Index
SHOW INDEXES FROM products;
CREATE INDEX indexProductCode on products(productCode);
DROP INDEX indexProductPrice on products;

-- view 
USE `demo`;
CREATE VIEW view_product
AS
SELECT productCode, productName, productPrice, productStatus FROM demo.products;
 SELECT * FROM demo.products;
 DROP VIEW view_product




