INSERT INTO role_rights (rules) VALUES ('delete, update, create, block');
INSERT INTO role_rights (rules) VALUES ('create');
INSERT INTO role_rights (rules) VALUES ('view');

INSERT INTO role (role, rules_id) VALUES ('admin', 1);
INSERT INTO role (role, rules_id) VALUES ('user', 2);
INSERT INTO role (role, rules_id) VALUES ('guest', 3);

INSERT  INTO category_request (category) VALUES ('current');
INSERT  INTO category_request (category) VALUES ('urgent');
INSERT  INTO category_request (category) VALUES ('extraordinary');

INSERT INTO condition_request (condition) VALUES ('new');
INSERT INTO condition_request (condition) VALUES ('completed');
INSERT INTO condition_request (condition) VALUES ('during');

INSERT INTO users (login, password, create_date, role_id) VALUES ('user1', '123', '2017-03-21', 1);
INSERT INTO users (login, password, create_date, role_id) VALUES ('user2', '123', '2017-01-11', 2);
INSERT INTO users (login, password, create_date, role_id) VALUES ('user3', '123', '2017-03-20', 2);

INSERT INTO request (name_request, descripton, create_data, author_id, category_id,  condition_id) VALUES
  ('request for user1', 'description', '2017-03-21', 1, 2, 1);
INSERT INTO request (name_request, descripton, create_data, author_id, category_id,  condition_id) VALUES
  ('request for user2', 'description', '2017-03-20', 2, 1, 1);
INSERT INTO request (name_request, descripton, create_data, author_id, category_id,  condition_id) VALUES
  ('request for user3', 'description', '2017-03-20', 3, 3, 3);