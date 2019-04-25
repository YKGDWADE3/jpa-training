CREATE TABLE employee(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    gender VARCHAR(10),
    salary INT NOT NULL
) engine=InnoDB DEFAULT CHARSET = utf8;

