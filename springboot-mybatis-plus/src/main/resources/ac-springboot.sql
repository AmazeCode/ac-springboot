DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY (id)
);

DELETE FROM user;

INSERT INTO user (id, name, age, email) VALUES
(1, 'neo', 18, 'smile1@ityouknow.com'),
(2, 'keep', 36, 'smile@ityouknow.com'),
(3, 'pure', 28, 'smile@ityouknow.com'),
(4, 'smile', 21, 'smile@ityouknow.com'),
(5, 'it', 24, 'smile@ityouknow.com');