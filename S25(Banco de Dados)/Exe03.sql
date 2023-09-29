create database db_farmacia_bem_estar;

use db_farmacia_bem_estar;

create table tb_categoria (
id bigint auto_increment,
tipos varchar(255) not null,
corredor varchar(255) not null,

primary key(id)
);

create table  tb_produtos (
id bigint auto_increment,
categoria_id bigint,
nome varchar(255) not null,
preco decimal not null,
pesoGramas int,
variacao varchar(255) not null,

primary key(id)
);

alter table tb_produtos add constraint fk_produtos_categoria
foreign key (categoria_id) references tb_categoria(id);

insert into tb_categoria (tipos,corredor) values ("Remedio","Principal/Balcão");
insert into tb_categoria (tipos,corredor) values ("Beleza","Esquerdo Inferior");
insert into tb_categoria (tipos,corredor) values ("Tratamento","Direito");
insert into tb_categoria (tipos,corredor) values ("Bebe","Esquerdo Superior");
insert into tb_categoria (tipos,corredor) values ("Alimentos","Proximo ao caixa");

select * from tb_categoria;

insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Alenia",104.89,400,"Não",1);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Dorflex",21.56,300,"Sim",1);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Noex",75.27,50,"Não",1);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Batom",19.99,10,"Sim",2);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Esmalte",5.50,20,"Sim",2);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Creme",54.89,40,"Sim",3);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Fralda",110.19,100,"Sim",4);
insert into tb_produtos (nome,preco,pesoGramas,variacao,categoria_id) values ("Chocolate",4.79,90,"Sim",5);

select nome,preco,pesoGramas,variacao from tb_produtos;

select nome,preco,pesoGramas,variacao from tb_produtos where preco > 50;
select nome,preco,pesoGramas,variacao from tb_produtos where preco >= 5 and preco <= 60;
select nome,preco,pesoGramas,variacao from tb_produtos where nome like "%c%";

select nome,preco,pesoGramas,variacao,tipos,corredor from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select nome,preco,pesoGramas,variacao,tipos,corredor from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tipos = "Remedio";