create database escola;

use escola;

create table alunos(
id bigint auto_increment,
nome varchar(255) not null,
idade int,
notas decimal(6,2) not null,
endereco varchar(255) not null,
telefone int,

primary key(id)
);

insert into alunos (nome,idade,notas,endereco,telefone) values ("A",16,7.5,"Rua A",999999999);
insert into alunos (nome,idade,notas,endereco,telefone) values ("B",14,3.1,"Rua B",988888888);
insert into alunos (nome,idade,notas,endereco,telefone) values ("C",17,9.5,"Rua C",977777777);
insert into alunos (nome,idade,notas,endereco,telefone) values ("D",17,10.0,"Rua D",966666666);
insert into alunos (nome,idade,notas,endereco,telefone) values ("E",15,5.0,"Rua E",955555555);
insert into alunos (nome,idade,notas,endereco,telefone) values ("F",16,8.0,"Rua F",944444444);
insert into alunos (nome,idade,notas,endereco,telefone) values ("G",14,9.0,"Rua G",933333333);
insert into alunos (nome,idade,notas,endereco,telefone) values ("H",15,6.9,"Rua H",922222222);

select * from alunos;
select * from alunos where notas>=7;
select * from alunos where notas<7;

update alunos set notas = 7.0 where id=8;