CREATE TABLE PRODUTOS
(
NOME VARCHAR(200) NOT NULL,
DESCRICAO VARCHAR(200) NOT NULL,
AVALIACAO INTEGER,
SKU INTEGER NOT NULL,
PRECO DECIMAL 10,2 NOT NULL,
PRIMARY KEY (SKU)
);

INSERT INTO PRODUTOS(NOME, DESCRICAO, AVALIACAO, SKU, PRECO)
VALUES (
"MXIII Android Google TV Player w/ 2GB RAM, 8GB ROM, Wi-Fi - Black",
"Form Color: Black Built-in Memory / RAM: 2GB Storage: 8GB Power Adapter: EU Plug Model: MXIII Quantity: 1 piece Material: Plastic Shade Of Color: Black Operating",
)
