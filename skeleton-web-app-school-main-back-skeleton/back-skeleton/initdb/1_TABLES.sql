create table admin
(
    login TEXT not null,
    password TEXT not null
);

create table students
(
    pseudo TEXT PRIMARY KEY,
    best_score int DEFAULT '0'
);

create table questions
(
    id SERIAL PRIMARY KEY,
    question TEXT not null,
    UNIQUE (question)
);

CREATE TABLE Answer
(
    id SERIAL PRIMARY KEY,
    answer VARCHAR(50),
    question_id INTEGER NOT NULL,
    FOREIGN KEY (question_id) REFERENCES Questions(id)
);

CREATE TABLE Quiz
(
    Number_quiz INT PRIMARY KEY
);

CREATE TABLE Quiz_question
(
    question_id SMALLINT,
    Number_quiz SMALLINT,
    PRIMARY KEY(question_id, Number_quiz),
    FOREIGN KEY(question_id) REFERENCES Questions(id),
    FOREIGN KEY(Number_quiz) REFERENCES Quiz(Number_quiz)
);
