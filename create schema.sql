-- SQL schema creation script

CREATE TABLE stocks (
  id INT PRIMARY KEY,
  symbol VARCHAR(10) NOT NULL,
  price DECIMAL(10, 2) NOT NULL,
  volume INT NOT NULL,
  timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
