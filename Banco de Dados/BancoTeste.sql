drop database if exists bancoTeste;
create database bancoTeste;
use bancoTeste;
show tables;


-- drop table if exists Professores;
create table Professores(
idprofessor int primary key auto_increment,
nome_prof varchar(50)
);

-- drop table if exists Disciplinas;
create table Disciplinas(
iddisc int  primary key auto_increment,
nome varchar(70) not null
);

-- Pode ser adicionado chave primaria composta (idprofessor, iddisc)
-- drop table if exists ProfDisc;
create table ProfDisc(
idprofessor int,
iddisc int,
primary key(idprofessor, iddisc),
foreign key(idprofessor) references Professores(idprofessor),
foreign key(iddisc) references Disciplinas(iddisc)
);

-- Inserir dados em Professores
select * from professores;

insert into Professores(nome_prof) values("Jose");
insert into Professores(nome_prof) values("Aline"), ("Alice");
insert into Professores(nome_prof, dtNascimento) values("Alessandra Maria", "1975-10-03");
insert into Professores(nome_prof, nascimento, email) values("Jose Santos", "1999-06-12", "josesantos@gmail.com"), ("Dio Brando", "1900-02-12", "diobrando@gmail.com"), ("Giuseppe Cadura", "1985-03-16", "cadura@gmail.com"),
("Aline Sousa", "1995-12-22", "sousaaline@gmail.com"), ("Clarice", "1950-05-12", "lispector@gmail.com"), ("Jorge Amado", "1933-03-26", "amado@gmail.com"), ("Stephen KLing", "1967-03-11", "kingo@gmail.com"), ("Jahlim Rabei", "1900-08-22", "rabei@gmail.com");


-- Alterar tabela Professores
alter table professores add column dtNascimento date;
alter table professores add column email varchar(150);
alter table professores change dtNascimento nascimento date;



-- Deletar dados de Professores
delete from professores where idprofessor = 2;

-- Atualizar dados de Professores
update professores set dtNascimento = "1988-06-21" where idprofessor = 1;
update professores set dtNascimento = "1982-07-10" where idprofessor = 2;
update professores set dtNascimento = "1995-02-15" where idprofessor = 3;
update professores set email = "alicema@gmail.com" where idprofessor = 3;
update professores set email = "josefulano@mail.com" where idprofessor = 1;
update professores set email = "aline@gmail.com" where idprofessor = 2;
update professores set email = "alessandra@gmail.com" where idprofessor = 4;



-- Inserir dados em Disciplinas
insert into Disciplinas(nome) values("Banco de dados"), ("Programação");
select * from disciplinas;


-- Alterar tabela Disciplinas



-- Inserir dados em ProfDisc
insert into ProfDisc(idprofessor, iddisc) values(1, 2);
insert into ProfDisc(idprofessor, iddisc) values(1,1);
select * from ProfDisc;

-- Consultas
select * from professores;
select * from professores where idprofessor = 12 or idprofessor = 5;
select nome_prof from professores where nome_prof = "Alice";
select nome_prof from professores where nome_prof like "a%";
select * from professores where idprofessor in(4,5,6);
select * from professores where nascimento between "1989-12-31" and "1999-12-31";
select * from professores where idprofessor between 1 and 11;
select * from professores limit 3;
select * from professores order by nome_prof desc limit 4 ;
select idprofessor as idprof, nome_prof as professor, nascimento, email from professores where email  like "a%";
