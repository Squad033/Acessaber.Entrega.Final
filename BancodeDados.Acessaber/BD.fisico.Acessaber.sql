CREATE DATABASE acessaber;

use acessaber;

-- TABELA RELACIONADA AO ALUNO

CREATE TABLE Aluno (
    Cpf VARCHAR(11) not null,
    Nome VARCHAR(50) not null,
    Email VARCHAR(50) not null,
    Telefone VARCHAR(11) not null,
    PRIMARY KEY (idaluno)
);

-- TABELA RELACIONADA AO PEDIDO

CREATE TABLE Pedido (
    Id_pedido INTEGER PRIMARY KEY auto_increment,
    data_pedido DATE not null,
    data_devolução DATE not null,
    status VARCHAR(50) not null
);

-- TABELA RELACIONADA A EQUIPAMENTO

CREATE TABLE Equimamento (
 id INTEGER PRIMARY KEY auto_increment,
    descrição INTEGER not null,
    Disponibilidade INTEGER not null,
	PRIMARY KEY (Id)
);

-- TABELAS RELACIONADA A PASSAGEM

CREATE TABLE Passagem (
    Id INTEGER auto_increment,TECLA
    Valor DOUBLE not null,
        PRIMARY KEY (Id)
);



