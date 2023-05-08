create database blog_post;
use blog_post;

CREATE TABLE topic (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  PRIMARY KEY (id)
);

CREATE TABLE post (
  id INT NOT NULL AUTO_INCREMENT,
  topic_id INT NOT NULL,
  image MEDIUMBLOB,
  text TEXT,
  published BIT(1),
  PRIMARY KEY (id),
  FOREIGN KEY (topic_id) REFERENCES topic(id)
);

INSERT INTO topic (name, description,image) VALUES ('Bash', 'This is the description for topic Bash.','https://via.placeholder.com/300x200.png?text=Bash+Image');
INSERT INTO topic (name, description,image) VALUES ('CPP', 'This is the description for topic CPP.','https://via.placeholder.com/300x200.png?text=CPP+Image');
INSERT INTO topic (name, description,image) VALUES ('Python', 'This is the description for topic Python.','https://via.placeholder.com/300x200.png?text=Python+Image');
INSERT INTO topic (name, description,image) VALUES ('Dotnet', 'This is the description for topic Dotnet.','https://via.placeholder.com/300x200.png?text=Dotnet+Image');
INSERT INTO topic (name, description,image) VALUES ('Coding', 'This is the description for topic Coding.','https://via.placeholder.com/300x200.png?text=Coding+Image');


INSERT INTO post (topic_id, image, text) VALUES (1, 'This is a test image 1.', 'This is the text for post 1 in topic Bash.',0);
INSERT INTO post (topic_id, image, text) VALUES (1, 'This is a test image 2.', 'This is the text for post 2 in topic Bash.',0);
INSERT INTO post (topic_id, image, text) VALUES (2, 'This is a test image 3.', 'This is the text for post 1 in topic CPP.',0);
INSERT INTO post (topic_id, image, text) VALUES (2, 'This is a test image 4.', 'This is the text for post 2 in topic CPP.',0);
INSERT INTO post (topic_id, image, text) VALUES (3, 'This is a test image 5.', 'This is the text for post 1 in topic Python.',0);

INSERT INTO post (topic_id, image, text) VALUES (1, 'This is a test image 1.', 'This is the text for post 3 in topic Bash.',0);
INSERT INTO post (topic_id, image, text) VALUES (1, 'This is a test image 2.', 'This is the text for post 4 in topic Bash.',0);
INSERT INTO post (topic_id, image, text) VALUES (4, 'This is a test image 3.', 'This is the text for post 1 in topic Dotnet.',0);
INSERT INTO post (topic_id, image, text) VALUES (4, 'This is a test image 4.', 'This is the text for post 2 in topic Dotnet.',0);
INSERT INTO post (topic_id, image, text) VALUES (5, 'This is a test image 5.', 'This is the text for post 1 in topic Coding.',0);