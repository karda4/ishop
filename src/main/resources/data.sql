INSERT INTO product_category (id, name) VALUES (1, 'Ноутбуки');
INSERT INTO product_category (id, name) VALUES (2, 'Телефони');
INSERT INTO product_category (id, name) VALUES (3, 'Побутова техніка');
INSERT INTO product_category (id, name) VALUES (4, 'Одяг');
INSERT INTO product_category (id, name) VALUES (5, 'Взуття');


INSERT INTO customer (id, login, password) VALUES
					(1, 'yura', '123'),
					(2, 'petro', '123');

INSERT INTO product (name, price, description, product_category_id) VALUES ('Ноутбук Asus EeeBook E502SA', 7777, 'Екран 15.6" (1366x768) HD, матовий / Intel Pentium N3710 (1.6 - 2.56 ГГц) / RAM 4 ГБ / HDD 500 ГБ / Intel HD Graphics 405 / без ОД / LAN / Wi-Fi / Bluetooth / веб-камера / DOS / 1.86 кг / білий Подробнее: https://rozetka.com.ua/ua/notebooks/c80004/filter/producer=asus/', 1);
INSERT INTO product (name, price, description, product_category_id) VALUES ('Samsung', 4999, 'Екран 10" (1366x768) HD, матовий / Intel Pentium N3710 (1.6 - 2.56 ГГц) / RAM 4 ГБ / HDD 500 ГБ', 2);
