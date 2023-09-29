create database loja;

use loja;

create table produtos(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int,
preco decimal(6,2) not null,
clasIdade varchar(255) not null,
quantPecas int,

primary key(id)
);

insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Mario",301,259.89,"6+",3300);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Yoshi",401,125.69,"14+",1822);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Bowser",434,161.49,"14+",1539);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Peach",353,146.78,"14+",1484);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Victreebel",674,20.59,"14+",330);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Cubone",589,20.59,"9+",370);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Gyarados",501,19.11,"9+",330);
insert into produtos (nome,quantidade,preco,clasIdade,quantPecas) values ("Butterfree",623,19.11,"9+",350);

select * from produtos;
select * from produtos where quantidade>500;
select * from produtos where quantidade<500;

update produtos set quantidade = 498 where id=6;