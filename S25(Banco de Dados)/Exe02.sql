create database db_pizzaria_legal;

create table tb_categorias (
id bigint auto_increment,
tipos varchar(255) not null,
mussarela varchar(255) not null,

primary key(id)
);

create table tb_pizzas (
id bigint auto_increment,
tipos_id bigint,
nome varchar(255) not null,
igrediente1 varchar(255) not null,
preco decimal(6,2) not null,
borda varchar(255) not null,

primary key(id)
);

alter table tb_pizzas add constraint fk_pizzas_categorias
foreign key (tipos_id) references tb_categorias(id);

insert into tb_categorias (tipos,mussarela) values ("Salgada","Sim");
insert into tb_categorias (tipos,mussarela) values ("Doce","Não");
insert into tb_categorias (tipos,mussarela) values ("Legumes/Verduras","Depende");
insert into tb_categorias (tipos,mussarela) values ("Especiais","Depende");
insert into tb_categorias (tipos,mussarela) values ("Broto","Depende");

select * from tb_categorias;

insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Atumpiry","Atum e Catupiry","Recheada",60.0,1);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Brigadeiro","Chocolate e granulado","Não recheada",65.0,2);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Vegetariana","Escarola,Milho,Palmito e Ervilha","Não recheada",55.0,3);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Hot-Dog","Salsicha, Milho, Batata palha, Catupiry","Recheada",75.0,4);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("4 Queijos","Mussarela, Provolone, Catupiry e Parmessão","Não Recheada",40.0,5);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Portuguesa","Presunto, Mussarela, Palmito, Ovos e Cebola","Recheada",60.0,1);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Paçoca","Chocolate, Amendoim e Paçoca","Recheada",45.0,2);
insert into tb_pizzas (nome,igrediente1,borda,preco,tipos_id) values ("Camarão","Camarão, Mussarela e Catupiry","Recheada",105.0,4);

select nome,igrediente1,borda,preco from tb_pizzas;

select nome,igrediente1,borda,preco from tb_pizzas where preco > 45;
select nome,igrediente1,borda,preco from tb_pizzas where preco > 50 and preco < 100;
select nome,igrediente1,borda,preco from tb_pizzas where nome like "%m%";

select nome,igrediente1,borda,preco,tipos,mussarela from tb_pizzas
inner join tb_categorias on tb_categorias.id = tb_pizzas.tipos_id;

select nome,igrediente1,borda,preco,tipos,mussarela from tb_pizzas
inner join tb_categorias on tb_categorias.id = tb_pizzas.tipos_id where tipos = "Doce";