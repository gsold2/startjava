CREATE DATABASE startjava;

--connection with database
\c startjava;

CREATE TABLE Jaegers (
	id	SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark	TEXT,
	height	REAL,
	weight	REAL,
	status	BOOLEAN,
	origin	TEXT,
	launch	DATE,
	kaijuKill	INTEGER
);
