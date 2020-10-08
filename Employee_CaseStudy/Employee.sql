CREATE DATABASE db_employee;

USE db_employee;

SHOW TABLES;

CREATE TABLE tb_employee (employeeId integer AUTO_INCREMENT,
			employeeName varchar(10) ,
			employeeAddress varchar(20),
			dateOfJoining date,
			experience integer,
			dateOfBirth date,
			PRIMARY KEY(employeeId));


insert into tb_employee(employeeName, employeeAddress, dateOfJoining, experience, dateOfBirth) values 
( 'poornima','Bengaluru','2019-07-04','1','1997-12-22');


SELECT * FROM tb_employee;