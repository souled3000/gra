--<ScriptOptions statementTerminator=";"/>

CREATE TABLE t_item (
	id INT NOT NULL,
	factorystaff VARCHAR(30),
	factory VARCHAR(30),
	dept VARCHAR(30),
	deptstaff VARCHAR(30),
	adm VARCHAR(30),
	room VARCHAR(30),
	signintime BIGINT,
	presignouttime BIGINT,
	signouttime BIGINT,
	status INT DEFAULT 0,
	PRIMARY KEY (id)
);

CREATE TABLE t_admin (
	id INT NOT NULL,
	name VARCHAR(30),
	pwd VARCHAR(30),
	PRIMARY KEY (id)
);

CREATE TABLE t_room (
	id INT NOT NULL,
	name VARCHAR(30),
	PRIMARY KEY (id)
);

