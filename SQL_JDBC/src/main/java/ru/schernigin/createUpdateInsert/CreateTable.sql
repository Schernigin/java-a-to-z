CREATE TABLE category_request (
  id SERIAL PRIMARY KEY,
  category CHARACTER VARYING (2000)
);

CREATE TABLE condition_request (
  id SERIAL PRIMARY KEY,
  condition CHARACTER VARYING (2000)
);

CREATE TABLE attached_files (
  id SERIAL PRIMARY KEY,
  link CHARACTER VARYING (2000)
);

CREATE TABLE role_rights (
  id SERIAL PRIMARY KEY,
  rules CHARACTER VARYING (2000)
);

CREATE TABLE role (
  id SERIAL PRIMARY KEY,
  role CHARACTER VARYING (2000),
  rules_id INTEGER REFERENCES role_rights (id)
);

CREATE TABLE users (
  id SERIAL PRIMARY KEY ,
  login CHARACTER VARYING (2000),
  password CHARACTER VARYING (2000),
  create_date DATE,
  role_id INTEGER REFERENCES role (id)
);

CREATE TABLE comments_request (
  id SERIAL PRIMARY KEY,
  comment TEXT,
  attach_file_id INTEGER REFERENCES attached_files (id),
  author_id INTEGER REFERENCES users (id),
  create_data DATE
);

CREATE TABLE request (
  id SERIAL PRIMARY KEY,
  name_request CHARACTER VARYING (2000),
  descripton TEXT,
  create_data DATE,
  author_id INTEGER REFERENCES users(id),
  category_id INTEGER REFERENCES category_request(id),
  comment_id INTEGER REFERENCES comments_request(id),
  condition_id INTEGER REFERENCES condition_request(id)
);

