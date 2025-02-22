create database student_management;
USE student_management;

CREATE TABLE students (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  age int NOT NULL,
  course varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  password varchar(50) NOT NULL,
  role enum('admin','user') NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY username (username)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO users(username, password, role) VALUES ('admin', 'admin123', 'admin');
INSERT INTO users(username, password, role) VALUES ('user', 'user123', 'user');