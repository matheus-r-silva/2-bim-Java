create database contas;
use contas;

create table ItemVenda(
 codVenda int,
 codProduto int,
 catProduto varchar(50),
 qtdVendida double,
 vrUnit double,
 primary key (codVenda, codProduto)
);

select * from ItemVenda;

-- Inserir diferentes valores na tabela ItemVenda
insert into ItemVenda(codVenda, codProduto, catProduto, qtdVendida, vrUnit) values(5, 2, "Informatica", 8, 20.99);

-- Consultas
select sum(qtdVendida), catProduto from ItemVenda group by catProduto;
select codProduto, qtdVendida, vrUnit, (qtdVendida * vrUnit) as subTotal from ItemVenda; 
select sum(qtdVendida * vrUnit) as subTotal from ItemVenda where codVenda = 2;
select codVenda, sum(qtdVendida) as subTotal from ItemVenda where codVenda = 1;
select max(vrUnit) as Maiorvalor from ItemVenda;
select min(vrUnit) as MenorValor from ItemVenda;
select count(*) from ItemVenda where codProduto = 2;
select avg(vrUnit) from ItemVenda;
select catProduto, avg(vrUnit) from ItemVenda group by catProduto;

-- ------------ 
 select catProduto, sum(qtdVendida * vrUnit) as Total from ItemVenda where catProduto = "informatica";
 
 -- exibir todos os produtos cujo o subtotal seja maior que R$300,00
 select codVenda, codProduto, sum(qtdVendida * vrUnit) as subTotal from ItemVenda group by codProduto, codVenda having subTotal > 300;
