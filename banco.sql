create database sistemaGerencial;

use sistemaGerencial;

create table cliente(
	id_cliente int auto_increment not null,
    nome varchar(100),
    endereco text,
    cpf varchar(11),
    email varchar(100),
    primary key(id_cliente)
);

create table tipo_fornecedor(
	id_tipo_fornecedor int auto_increment not null,
    descricao varchar(50),
    primary key(id_tipo_fornecedor)
);
create table fornecedor(
	id_fornecedor int auto_increment not null,
    nome varchar(100),
    endereco text,
    email varchar(100),
    cnpj varchar(14),
    login varchar(200),
    senha varchar(200),
    FK_id_tipo_fornecedor int,
    foreign key(FK_id_tipo_fornecedor) references tipo_fornecedor(id_tipo_fornecedor),
    primary key(id_fornecedor,cnpj)
);

create table produto(
	id_produto int auto_increment not null,
    cod_produto varchar(200),
    nome varchar(100),
    descricao text,
    valor_compra float,
    valor_venda float,
    FK_id_fornecedor int,
    quantidade_estoque int,
	foreign key(FK_id_fornecedor) references fornecedor(id_fornecedor),
	primary key(id_produto)
);


create table funcao(
	id_funcao int auto_increment not null,
    nome varchar(100),
    primary key(id_funcao)
);

create table funcionario(
	id_funcionario int auto_increment not null,
    FK_id_funcao int,
    nome varchar(100),
    endereco text,
    cpf varchar(11),
    email varchar(100),
    login varchar(100),
    senha varchar(100),
    foreign key(FK_id_funcao) references funcao(id_funcao),
    primary key(id_funcionario)
);

create table tipo_pagamento(
	id_tipo_pagamento int auto_increment not null,
    descricao varchar(20),
    primary key(id_tipo_pagamento)
);


create table venda_registro(
	id_venda_registro int auto_increment not null,
    FK_id_cliente int,
    FK_id_funcionario int,
    FK_id_tipo_pagamento int,
    data_venda date,
    hora_venda time,
    total_venda double(11,2),
    foreign key(FK_id_funcionario) references funcionario(id_funcionario),
    foreign key(FK_id_tipo_pagamento) references tipo_pagamento(id_tipo_pagamento),
    primary key(id_venda_registro)
);

create table venda_detalhe(
	id_venda_detalhe int auto_increment not null,
    FK_id_venda_registro int,
    FK_id_produto int,
    quantidade int,
    sub_total double(11,2),
    foreign key(FK_id_venda_registro) references venda_registro(id_venda_registro),
    foreign key(FK_id_produto) references produto(id_produto),
    primary key(id_venda_detalhe)
);


create table pagamento(
	id_pagamento int auto_increment not null,
    FK_id_venda_registro int,
    FK_id_tipo_pagamento int,
    data_pagamento date,
    hora_pagamento time,
    valor_pagamento double(11,2),
    foreign key(FK_id_venda_registro) references venda_registro(id_venda_registro),
    foreign key(FK_id_tipo_pagamento) references tipo_pagamento(id_tipo_pagamento),
    primary key(id_pagamento)
);

create table pedido_registro(
	id_pedido_registro int auto_increment not null,
    data_pedido date,
    valor_pedido double(11,2),
    primary key(id_pedido_registro)
);

create table pedido_detalhe(
	id_pedido_detalhe int auto_increment not null,
    FK_id_pedido_registro int,
    FK_id_produto int,
    descricao text,
    quantidade int,
	valor_compra int,
    foreign key(FK_id_pedido_registro) references pedido_registro(id_pedido_registro),
    primary key(id_pedido_detalhe)
);


create table entrada_produto_registro(
	id_entrada_produto_registro int auto_increment not null,
    data_entrada date,
    valor_entrada double(11,2),
    primary key(id_entrada_produto_registro)
);

create table entrada_produto_detalhe(
	id_entrada_produto_detalhe int auto_increment not null,
    FK_id_entrada_produto_registro int,
    FK_id_produto int,
    descricao text,
    quantidade int,
	valor_compra int,
    foreign key(FK_id_entrada_produto_registro) references entrada_produto_registro(id_entrada_produto_registro),
    primary key(id_entrada_produto_detalhe)
);