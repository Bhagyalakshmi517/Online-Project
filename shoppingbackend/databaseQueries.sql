CREATE TABLE category (
	
	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,

	CONSTRAINT pk_category_id PRIMARY KEY (id)

);

INSERT INTO category (name,description,image_url,is_active) VALUES ('Television','this is some of the description for Television','CAT_1.png','true');
INSERT INTO category (name,description,image_url,is_active) VALUES ('Mobile','this is some of the description for Mobile','CAT_2.png','true');
INSERT INTO category (name,description,image_url,is_active) VALUES ('Laptop','this is some of the description for Laptop','CAT_3.png','true');


CREATE TABLE user_detail (
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id),
);

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contct_number)
VALUES ('Bhagya', 'Lakshmi', 'ADMIN', true, 'admin', 'bhagya@gmail.com', '9700990205');

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contct_number)
VALUES ('Hemadri', 'Hema', 'SUPPLIER', true, '12345', 'hemadri@gmail.com', '8686167648');

INSERT INTO user_detail
(first_name, last_name, role, enabled, password, email, contct_number)
VALUES ('bhagya', 'Banu', 'SUPPLIER', true, '12345', 'bhanu@gmail.com', '9700990206');


CREATE TABLE product (
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	brand VARCHAR(50),
	description VARCHAR(255),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES category (id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES user_detail(id),
);

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABC123DEFX', 'iphone 5s', 'apple', 'company product', 50000, 5, true, 3, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDDEF123DEFX', 'Samsung s7', 'samsung', 'best phone', 30000, 2, true, 3, 3 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDPQR123DEFX', 'Google Pixel', 'google', 'This is one of the best company',24000, 5, true, 3, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDMNO123DEFX', ' Macbook Pro', 'apple', 'This is one of the best company', 50000, 3, true, 1, 2 );

INSERT INTO product (code, name, brand, description, unit_price, quantity, is_active, category_id, supplier_id)
VALUES ('PRDABCXYZDEFX', 'Dell Latitude E6510', 'dell', 'this is one of the best phone',30000, 5, true, 1, 3 );






