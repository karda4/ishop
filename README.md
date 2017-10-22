###Postgres DB:
```
# set timezone = 'UTC' in postgresq.conf
sudo vi /etc/postgresql/9.5/main/postgresql.conf

timezone = 'UTC'

#Create Database and User
sudo -u postgres psql;

CREATE DATABASE ishop_db;
CREATE USER ishop WITH password 'jF04nw3qwi';
GRANT ALL ON DATABASE ishop_db TO ishop;
\q

#Enter to the database 'ishop_db' as a new user 'ishop'
psql -h localhost ishop_db ishop

```