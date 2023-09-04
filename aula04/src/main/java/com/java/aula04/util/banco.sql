use aula;

create table categoria
(
    id int primary key auto_increment,
    nome varchar(50) not null
);

insert into categoria values (1, 'Limpeza');
insert into categoria values (2, 'Cereais');

create table produto
(
    id int primary key auto_increment,
    nome varchar(50) not null,
    id_categoria int
);

insert into produto values (1, 'Arroz', 2);
insert into produto values (2, 'Sabao', 1);
insert into produto values (3, 'Linguica', null);


select p.nome as nomeProduto,c.nome as nomeCategoria from produto p
left join categoria c
on p.id_categoria = c.id;
