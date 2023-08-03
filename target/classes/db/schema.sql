CREATE TABLE `department` (
  `department_id` INT(11) NOT NULL AUTO_INCREMENT,
  `depatrtment_name` VARCHAR(50) NULL DEFAULT NULL,
  `department_preority` int(3) NULL DEFAULT 0,
  PRIMARY KEY (`department_id`)
);

CREATE TABLE `employee` (

`employee_id` varchar(50) NOT NULL,
`employee_first_name` varchar(50) NULL DEFAULT NULL,
`employee_last_name` varchar(50) NULL DEFAULT NULL,
`employee_age` INT (3) NULL DEFAULT 0,
`employee_department_id` INT NOT NULL,
PRIMARY KEY (`employee_id`),
FOREIGN KEY (`employee_department_id`) REFERENCES department(`department_id`)
);
