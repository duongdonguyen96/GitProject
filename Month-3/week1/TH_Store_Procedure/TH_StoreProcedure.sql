DELIMITER //
CREATE PROCEDURE findAllCustomers()
BEGIN
SELECT * FROM customers;
END //
DELIMITER ;

CALL findAllCustomers;

DROP PROCEDURE  findAllCustomers
