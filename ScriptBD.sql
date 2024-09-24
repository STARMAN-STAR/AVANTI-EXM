CREATE DATABASE IF NOT EXISTS desarrollo;

CREATE TABLE IF NOT EXISTS Teacher (
	id int AUTO_INCREMENT NOT NULL UNIQUE,
	firstName varchar(255) NOT NULL,
	lastName varchar(255) NOT NULL,
	rfc varchar(255) NOT NULL,
	username varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS LearningUnit (
	id int AUTO_INCREMENT NOT NULL UNIQUE,
	name varchar(255) NOT NULL,
	class_hours int NOT NULL,
	workshop_hours int NOT NULL,
	laboratory_hours int NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS TeacherLearningUnit (
	id int AUTO_INCREMENT NOT NULL UNIQUE,
	teacherId int NOT NULL,
	learningUnitId int NOT NULL,
    PRIMARY KEY (id),
    foreign key (teacherId) references teacher (id),
    foreign key (learningUnitId) references learningUnit (id),
    unique(teacherId, learningUnitId)
);

CREATE TABLE IF NOT EXISTS Administrator (
	id int AUTO_INCREMENT NOT NULL UNIQUE,
	username varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO Administrator (username, password, email) VALUES
('alexander villaman', '1234', 'francisco.villaman@gmail.com');

