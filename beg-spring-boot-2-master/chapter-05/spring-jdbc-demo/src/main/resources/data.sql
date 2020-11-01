
DROP TABLE IF EXISTS USERS;

CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  email varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

insert into users(id, name, email) values(4,'11Siva','siva@gmail.com');
insert into users(id, name, email) values(5,'11Prasad','prasad@gmail.com');
insert into users(id, name, email) values(6,'11Reddy','reddy@gmail.com');
