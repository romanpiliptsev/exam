CREATE TABLE IF NOT EXISTS phones
(
    id INT NOT NULL PRIMARY KEY auto_increment,
    number VARCHAR(200) NOT NULL UNIQUE
);
