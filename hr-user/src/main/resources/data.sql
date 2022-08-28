INSERT INTO user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$TyIKxK9MJ8plscery0sh0.OkAwk61WSJHl4gW1SHG92GXfztmZTMK');
INSERT INTO user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$TyIKxK9MJ8plscery0sh0.OkAwk61WSJHl4gW1SHG92GXfztmZTMK');

INSERT INTO role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);
