CREATE DATABASE fraudedecompras;
USE fraudedecompras;

CREATE TABLE transacoes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    distancia_de_casa FLOAT,
    distancia_da_ultima_transacao FLOAT,
    razao_preco_medio_compra FLOAT,
    repetiu_estabelecimento BOOLEAN,
    usou_chip BOOLEAN,
    usou_pin BOOLEAN,
    pedido_online BOOLEAN,
    fraude BOOLEAN
);

CREATE TABLE suspeitas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_transacao_original INT,
    distancia_de_casa FLOAT,
    distancia_da_ultima_transacao FLOAT,
    razao_preco_medio_compra FLOAT,
    repetiu_estabelecimento BOOLEAN,
    usou_chip BOOLEAN,
    usou_pin BOOLEAN,
    pedido_online BOOLEAN,
    suspeita_detectada BOOLEAN,
    tipo_de_fraude VARCHAR(50),
    condicao VARCHAR(50),
    modo_pagamento VARCHAR(50)
);