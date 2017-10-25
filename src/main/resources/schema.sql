DROP TABLE IF EXISTS customer CASCADE;
DROP TABLE IF EXISTS image CASCADE;
DROP TABLE IF EXISTS orders CASCADE;
DROP TABLE IF EXISTS product CASCADE;
DROP TABLE IF EXISTS product_images CASCADE;
DROP TABLE IF EXISTS order_item CASCADE;
DROP TABLE IF EXISTS order_order_items CASCADE;
DROP TABLE IF EXISTS product_category CASCADE;

DROP SEQUENCE IF EXISTS customer_id_seq CASCADE;
DROP SEQUENCE IF EXISTS image_id_seq CASCADE;
DROP SEQUENCE IF EXISTS orders_id_seq CASCADE;
DROP SEQUENCE IF EXISTS product_id_seq CASCADE;
DROP SEQUENCE IF EXISTS order_item_id_seq CASCADE;
DROP SEQUENCE IF EXISTS product_category_id_seq CASCADE;

CREATE TABLE customer(
	id				SERIAL PRIMARY KEY,
	login			VARCHAR(255) 	NOT NULL,
	password		VARCHAR(255) 	NOT NULL,
	first_name		VARCHAR(255),
	last_name		VARCHAR(255),
	middle_name		VARCHAR(255),
	phone			VARCHAR(255),
	email			VARCHAR(255),
	registered		SMALLINT 		DEFAULT 0
);

CREATE TABLE image(
	id				SERIAL PRIMARY KEY,
	file_name		VARCHAR(255)
);

CREATE TABLE orders(
	id				SERIAL PRIMARY KEY,
	customer_id		BIGINT UNIQUE REFERENCES customer(id)
);

CREATE TABLE product_category(
	id				SERIAL PRIMARY KEY,
	name			VARCHAR(255)
);

CREATE TABLE product(
	id				SERIAL PRIMARY KEY,
	name			VARCHAR(255) 		NOT NULL,
	price			NUMERIC				NOT NULL,
	description		VARCHAR(2000),
	product_category_id	BIGINT REFERENCES product_category(id),
	alive			SMALLINT 			DEFAULT 1
);

CREATE TABLE product_images(
	product_id	BIGINT REFERENCES product(id),
	images_id	BIGINT REFERENCES image(id)
);
CREATE TABLE order_item(
	id				SERIAL PRIMARY KEY,
	order_id		BIGINT UNIQUE REFERENCES orders(id),
	product_id		BIGINT UNIQUE REFERENCES product(id),
	amount			INT,
	total_price		INT
);

CREATE TABLE order_order_items(
	order_id		BIGINT REFERENCES orders(id),
	order_items_id	BIGINT UNIQUE REFERENCES order_item(id)
);
