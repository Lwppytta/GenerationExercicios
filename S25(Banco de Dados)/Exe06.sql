create database db_curso_da_minha_vida;

use db_curso_da_minha_vida;

create table tb_categoria (
id bigint auto_increment,
linguagem varchar(255) not null,
notaInstituicao int,

primary key(id)
);

create table  tb_cursos (
id bigint auto_increment,
categoria_id bigint,
instituicao varchar(255) not null,
preco decimal(6,2) not null,
tempo varchar(255) not null,
diploma varchar(255) not null,

primary key(id)
);

alter table tb_cursos add constraint fk_cursos_categoria
foreign key (categoria_id) references tb_categoria(id);

-- Nota minima por escola......
insert into tb_categoria (linguagem,notaInstituicao) values ("Java","8");
insert into tb_categoria (linguagem,notaInstituicao) values ("C#","8");
insert into tb_categoria (linguagem,notaInstituicao) values ("PHP","7");
insert into tb_categoria (linguagem,notaInstituicao) values ("HTML","6");
insert into tb_categoria (linguagem,notaInstituicao) values ("CSS","9");

-- select * from tb_categoria;

insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Generation",0,"3 Meses","Sim",1);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Alura",900,"6 Meses","Sim",2);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Leon",465,"3 Meses","Não",3);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Etec",0,"12 Meses","Sim",4);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Javart",850,"6 Meses","Sim",5);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("BloodC",550,"12 Meses","Não",1);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("Maskoto",178,"6 Meses","Não",2);
insert into tb_cursos (instituicao,preco,tempo,diploma,categoria_id) values ("BMM",390,"3 Meses","Sim",3);

-- select instituicao,preco,tempo,diploma from tb_cursos;

select instituicao,preco,tempo,diploma from tb_cursos where preco > 500;
select instituicao,preco,tempo,diploma from tb_cursos where preco >= 600 and preco <= 1000;
select instituicao,preco,tempo,diploma from tb_cursos where instituicao like "%j%";

select instituicao,preco,tempo,diploma,linguagem,notaInstituicao from tb_cursos
inner join tb_categoria on tb_categoria.id = tb_cursos.categoria_id;

select instituicao,preco,tempo,diploma,linguagem,notaInstituicao from tb_cursos
inner join tb_categoria on tb_categoria.id = tb_cursos.categoria_id where linguagem = "Java";