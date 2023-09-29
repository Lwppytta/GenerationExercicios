create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria (
id bigint auto_increment,
tipos varchar(255) not null,
corredor varchar(255) not null,

primary key(id)
);

create table  tb_produto (
id bigint auto_increment,
categoria_id bigint,
nome varchar(255) not null,
preco decimal(6,2) not null,
variacao varchar(255) not null,
gramas int,

primary key(id)
);

alter table tb_produto add constraint fk_produtos_categoria
foreign key (categoria_id) references tb_categoria(id);

insert into tb_categoria (tipos,corredor) values ("Caro","Principal");
insert into tb_categoria (tipos,corredor) values ("Elevado","Esquerda Superior");
insert into tb_categoria (tipos,corredor) values ("Padrão","Esquerda Inferior");
insert into tb_categoria (tipos,corredor) values ("Barato","Direita Superior");
insert into tb_categoria (tipos,corredor) values ("Promoção","Direita Superior");

select * from tb_categoria;

insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Rabada",105,"Não",3000,1);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Coxa",36,"Sim",3000,4);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Capa File",111,"Não",3000,1);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Figado",51,"Sim",3000,4);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Musculo",60,"Sim",3000,5);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Lombo",66,"Não",3000,3);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Pernil",78,"Não",3000,3);
insert into tb_produto (nome,preco,variacao,gramas,categoria_id) values ("Bisteca",102,"Não",3000,3);

select nome,preco,variacao,gramas from tb_produto;

select nome,preco,gramas,variacao from tb_produto where preco > 50;
select nome,preco,gramas,variacao from tb_produto where preco >= 50 and preco <= 150;
select nome,preco,gramas,variacao from tb_produto where nome like "%c%";

select nome,preco,gramas,variacao,tipos,corredor from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select nome,preco,gramas,variacao,tipos,corredor from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tipos = "Promocão";