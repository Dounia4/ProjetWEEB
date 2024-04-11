create table admin
(
    login TEXT not null,
    password TEXT not null
);

create table player
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

CREATE TABLE answer
(
    id SERIAL PRIMARY KEY,
    answer VARCHAR(50),
    question_id INTEGER NOT NULL,
    FOREIGN KEY (question_id) REFERENCES Questions(id)
);

CREATE TABLE quiz
(
    number_quiz INT PRIMARY KEY,
    image bytea  NOT NULL
);

CREATE TABLE quiz_question
(
    number_quiz SMALLINT,
    question_id SMALLINT,
    PRIMARY KEY(question_id, number_quiz),
    FOREIGN KEY(question_id) REFERENCES Questions(id),
    FOREIGN KEY(number_quiz) REFERENCES Quiz(number_quiz)
);
