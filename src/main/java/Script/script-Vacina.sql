SET SQL_SAFE_UPDATES = 0;
drop database if exists dbvacina;

create database dbvacina;
use dbvacina;

create table pessoa (
	idPessoa int not null primary key auto_increment
    , nome varchar(100) not null
    , dataNascimento date not null
    , sexo char (1) null
    , cpf char(11) unique not null
    , tipo varchar (255) not null
 
);

create table pais (
	idPais int not null primary key auto_increment
	, nomePais varchar (100) not null
	, sigla varchar (2) not null

);

create table vacina (
	idVacina int not null primary key auto_increment
    , paisOrigem varchar (255) not null
    , nomeVacina varchar (255) not null
    , dataInicioPesquisa datetime not null
    , estagio int not null
    , idPesquisador int, foreign key (idPesquisador) references pesssoa(idPessoa)
);

create table aplicacaoVacina (
	idAplicacaoVacina int not null primary key auto_increment
    , dataVacina datetime not null
    , avaliacao int not null
    , idPessoa int, foreign key (idPessoa) references pessoa (idPessoa)
    , idVacina int, foreign key (idVacina) references vacina (idVacina)

);

insert into pessoa (nome, dataNascimento, sexo, cpf) values ('william', 2020-07-23 , 'M' , 67876578908);

insert into vacina (paisOrigem, nomeVacina, dataInicio, estagio, idPesquisador) values ('Brasil','stress', '2023-06-01', 2, 1);
insert into vacina (paisOrigem, nomeVacina, dataInicio, estagio, idPesquisador) values ('Argentina','sputnik', '2024-10-05', 1, 4);
insert into vacina (paisOrigem, nomeVacina, dataInicio, estagio, idPesquisador) values ('colombia','corola', '2024-11-30', 3, 2);

insert into aplicacaoVacina (dataVacina, avalicao, idPessoa, idVacina) values ('2024-12-11', 3, 1, 2);
insert into aplicacaoVacina (dataVacina, avalicao, idPessoa, idVacina) values ('2024-11-03', 1, 3, 1);
insert into aplicacaoVacina (dataVacina, avalicao, idPessoa, idVacina) values ('2024-10-26', 2, 2, 3);

