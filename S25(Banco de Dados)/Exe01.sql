create database db_generation_game_online;

create table tb_classes(
id bigint auto_increment,
tipos varchar(255) not null,
dadoVida varchar(255) not null,

primary key(id)
);

create table tb_personagens(
id bigint auto_increment,
classes_id bigint,
nome varchar(255) not null,
raca varchar(255) not null,
idade int,
poderAtaque decimal not null,

primary key(id)
);

alter table tb_personagens add constraint fk_personagens_classes
foreign key (classes_id) references tb_classes(id);

insert into tb_classes (tipos,dadoVida) values ("Bardo","d8");
insert into tb_classes (tipos,dadoVida) values ("Feiticeiro","d6");
insert into tb_classes (tipos,dadoVida) values ("Guerreiro","d10");
insert into tb_classes (tipos,dadoVida) values ("Clerigo","d8");

select * from tb_classes;

insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Ariadne","Anão",511,2300,3);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Bennet","Elfo",657,900,4);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Cancuro","Humano",36,1400,1);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Dorororo","Hobbit",67,750,1);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Eron","Draconato",854,2800,2);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Flor","Elfo",117,2400,3);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Garfield","Tiefling",67,1900,2);
insert into tb_personagens (nome,raca,idade,poderAtaque,classes_id) values ("Hermit","Humano",23,800,4);

select nome,raca,idade,poderAtaque from tb_personagens;

select * from tb_personagens where poderAtaque>2000;
select * from tb_personagens where poderAtaque>1000 and poderAtaque<2000;
select nome,raca,idade,poderAtaque from tb_personagens where nome like "%c%";

select nome,raca,idade,poderAtaque,tipos,dadoVida from tb_personagens
inner join tb_classes on tb_classes.id = tb_personagens.classes_id;

select nome,raca,idade,poderAtaque,tipos,dadoVida from tb_personagens
inner join tb_classes on tb_classes.id = tb_personagens.classes_id where tipos in ("Feiticeiro");