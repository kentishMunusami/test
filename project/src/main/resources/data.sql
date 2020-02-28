INSERT INTO abonne (prenom, nom) VALUES
  ('kentish', 'munusami'),
  ('serge', 'blanco'),
  ('captain', 'america');
  
INSERT INTO adresse (active, pays, rue, codepostal, ville, id_abonne) VALUES
(false, 'france', '5 rue voltaire', '70008', 'paris', 1),
(true, 'pologne', '10 rue zerrt', '', 'varsovie', 1),
(false, 'france', '12 rue de la paix', '70009', 'paris', 2);
  
INSERT INTO contrat (canal, condition, id_adresse, id_abonne) VALUES
('FACE', 'avec date effet', 1, 1),
('EC', 'avec date effet', 2, 1),
('FACE', 'avec date effet', 3, 1);

INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'kentish.munusami@capfi.fr', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'), '0030Q00000gdNRXQA2');
INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (6, 'alice', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'alice', 'alice', 'alice.prest@planete-urgence.org', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'), '0030Q00000cBrx9QAC');
INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (5, 'lucie', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'lucie', 'lucie', 'lucie.camurat@planete-urgence.org', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'), '0030Q00000ICrR0QAL');
INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (4, 'morgane', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'morgane', 'morgane', 'morgane.vairaa@planete-urgence.org', 1, PARSEDATETIME('01-01-2016', 'dd-MM-yyyy'), '0030Q00000ICrYuQAL');
INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, PARSEDATETIME('01-01-2016','dd-MM-yyyy'), null);
INSERT INTO user (usr_id, usr_username, usr_password, usr_firstname, usr_lastname, usr_email, usr_enabled, usr_last_password_reset_date, id_salesforce) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, PARSEDATETIME('01-01-2016','dd-MM-yyyy'), null);

INSERT INTO authority (auth_id, auth_name) VALUES (1, 'ROLE_USER');
INSERT INTO authority (auth_id, auth_name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_authority (usr_id, auth_id) VALUES (1, 1);