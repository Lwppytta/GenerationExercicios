create database db_construindo_vidas;

use db_construindo_vidas;

create table tb_categoria (
id bigint auto_increment,
tipos varchar(255) not null,
comodo varchar(255) not null,

primary key(id)
);

create table  tb_produto (
id bigint auto_increment,
categoria_id bigint,
nome varchar(255) not null,
variacao varchar(255) not null,
loja varchar(255) not null,
preco decimal(6,2) not null,


primary key(id)
);

alter table tb_produto add constraint fk_produtos_categoria
foreign key (categoria_id) references tb_categoria(id);

insert into tb_categoria (tipos,comodo) values ("Eletronicos","Qualquer lugar");
insert into tb_categoria (tipos,comodo) values ("Eletrodomesticos","Area/Cozinha");
insert into tb_categoria (tipos,comodo) values ("Decoração","Sala/Quarto");
insert into tb_categoria (tipos,comodo) values ("Moveis","Casa");
insert into tb_categoria (tipos,comodo) values ("Verde","Fora de Casa");

-- select * from tb_categoria;

insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Celular","Possui","Mercado Livre",210,1);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Geladeira","Não Possui","Ame",400,2);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Bonecos","Possui","Amazon",140,3);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Cadeira","Não Possui","Amazon",65,4);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Vaso","Possui","Mercado Livre",50,5);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Tablet","Possui","Ame",145,1);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Maquina de Lavar","Não Possui","Casas Bahia",450,2);
insert into tb_produto (nome,variacao,loja,preco,categoria_id) values ("Livros","Possui","Livelo",20,3);

-- select nome,variacao,loja,preco from tb_produto;

select nome,variacao,loja,preco from tb_produto where preco > 100;
select nome,variacao,loja,preco from tb_produto where preco >= 70 and preco <= 150;
select nome,variacao,loja,preco from tb_produto where nome like "%c%";

select nome,variacao,loja,preco,tipos,comodo from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select nome,variacao,loja,preco,tipos,comodo from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tipos = "Decoração";