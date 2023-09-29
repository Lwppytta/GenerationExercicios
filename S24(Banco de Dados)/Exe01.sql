create database RH;

use RH;

create table colaboradores(
id bigint auto_increment,
nome varchar(255) not null,
telefone int,
localidade varchar(255) not null,
salario decimal not null,
cargo varchar(255) not null,

primary key(id)
);

insert into colaboradores(nome,telefone,localidade,salario,cargo) values ("Mayara",966565996,"SP",4800.00,"Senior");
insert into colaboradores(nome,telefone,localidade,salario,cargo) values ("Amanda",964528977,"SP",1800.00,"Junior");
insert into colaboradores(nome,telefone,localidade,salario,cargo) values ("Larissa",933556688,"SP",7500.00,"Instrutor");
insert into colaboradores(nome,telefone,localidade,salario,cargo) values ("Gabriel",912567894,"RJ",7500.00,"Instrutor");
insert into colaboradores(nome,telefone,localidade,salario,cargo) values ("Katia",955889944,"RJ",1800.00,"Junior");

select * from colaboradores;
select * from colaboradores where salario > 2000;
select * from colaboradores where salario < 2000;

update colaboradores set localidade = "SP" where id=4; 