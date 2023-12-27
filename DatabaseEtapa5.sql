create database TaskManeger;
use TaskManeger;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

create table Task (
`id` int not null AUTO_INCREMENT PRIMARY KEY,
`Title` varchar(100) not null,
`Description` varchar(100) not null,
`Priority` varchar(100) not null,
`DueDate` datetime not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

select * from Task;