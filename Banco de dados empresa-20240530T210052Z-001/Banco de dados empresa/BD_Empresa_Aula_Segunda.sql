CREATE DATABASE empresa;
USE empresa;

CREATE TABLE usuarios (
usuario varchar(50)primary key,
senha varchar(50) not null,
cargo varchar(50) not null
);

CREATE TABLE departamento(
id varchar(5) primary key,
nome varchar(70) not null,
telefone varchar(15),
cidade varchar(40),
departamento varchar(50)
);

CREATE TABLE funcionarios(
id varchar(5) primary key,
nome varchar(50) not null,
cargo varchar(50),
telefone varchar(15)
);

select * from departamento
select * from usuarios

