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
('alexander villaman', '2523', 'francisco.villaman@gmail.com');

insert into TeacherLearningUnit (teacherId,  learningUnitId) values (3,2);

INSERT INTO Administrator (username, password, email) VALUES
('admin1', 'password123', 'admin1@example.com'),
('admin2', 'password456', 'admin2@example.com'),
('admin3', 'password789', 'admin3@example.com'),
('admin4', 'password101', 'admin4@example.com'),
('admin5', 'password102', 'admin5@example.com');

INSERT INTO Teacher (firstName, lastName, rfc, username, password) VALUES
('Juan', 'Pérez', 'PEPJ800101XXX', 'juanperez', 'pass1234'),
('Ana', 'Gómez', 'GOMA920505XXX', 'anagomez', 'pass5678'),
('Carlos', 'Mendoza', 'MENC750302XXX', 'carlosmendoza', 'pass9101'),
('Laura', 'Sánchez', 'SALA870808XXX', 'laurasanchez', 'pass1122'),
('Roberto', 'Hernández', 'HERB930616XXX', 'robertohernandez', 'pass3344');

INSERT INTO LearningUnit (name, class_hours, workshop_hours, laboratory_hours) VALUES ('Matemáticas', 40, 20, 10);
INSERT INTO LearningUnit (name, class_hours, workshop_hours, laboratory_hours) VALUES ('Física', 30, 15, 5);


INSERT INTO LearningUnit (name, class_hours, workshop_hours, laboratory_hours) VALUES ('Matemáticas', 40, 20, 10);
INSERT INTO LearningUnit (name, class_hours, workshop_hours, laboratory_hours) VALUES ('Física', 30, 15, 5);

SELECT * FROM desarrollo.teacher;
SELECT * FROM desarrollo.administrator;
select * FROM desarrollo.learningunit;

SELECT 
    t.id AS teacherId,
    t.firstName,
    t.lastName,
    lu.id AS learningUnitId,
    lu.name AS learningUnitName
FROM 
    TeacherLearningUnit tlu
JOIN 
    Teacher t ON tlu.teacherId = t.id
JOIN 
    LearningUnit lu ON tlu.learningUnitId = lu.id;
    Select * FROM desarrollo.teacherlearningunit
    
    SELECT * FROM desarrollo.teacher;
    
DELIMITER $$
