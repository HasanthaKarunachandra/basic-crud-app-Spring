DROP DATABASE IF EXISTS simple_crud;
CREATE DATABASE IF NOT EXISTS simple_crud;
USE simple_crud;

CREATE TABLE IF NOT EXISTS customer(
    id MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45),
    salary DOUBLE
);
INSERT INTO customer(name,salary) VALUES ('Kamal',25000);
INSERT INTO customer(name,salary) VALUES ('Kasun',250000);
INSERT INTO customer(name,salary) VALUES ('Ravidu',35000);
INSERT INTO customer(name,salary) VALUES ('Namal',50000);
INSERT INTO customer(name,salary) VALUES ('LayaKamal',25000);
SELECT * FROM customer;