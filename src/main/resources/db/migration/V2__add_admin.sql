INSERT INTO users (id, email, name, password, role)
VALUES (1, 'mail@mail.ru', 'admin', '$2a$10$K.5WAXvu2Ja4aNdfSqDlSun6lRXRJ1WPD9MDwKvnvO1d1y9IGp6/2', 'ADMIN');

ALTER SEQUENCE user_seq RESTART WITH 2;