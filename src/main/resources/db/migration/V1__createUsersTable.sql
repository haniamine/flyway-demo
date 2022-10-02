CREATE TABLE USERS (
        id bigint(20) NOT NULL AUTO_INCREMENT,
        username varchar(100) NOT NULL,
        age  INT NOT NULL,
        PRIMARY KEY (id),
        UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;