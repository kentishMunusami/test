drop table if exists abonne;  
drop table if exists adresse;
drop table if exists contrat;  
drop table if exists mouvement;    
  
CREATE TABLE abonne (
  id_abonne INT AUTO_INCREMENT  PRIMARY KEY,
  prenom VARCHAR(250) NOT NULL,
  nom VARCHAR(250) NOT NULL
);

CREATE TABLE adresse (
  id_adresse INT AUTO_INCREMENT  PRIMARY KEY,
  active BOOLEAN NOT NULL,
  pays VARCHAR(250) NOT NULL,
  rue VARCHAR(250) NOT NULL,
  codePostal VARCHAR(250) NOT NULL,
  ville VARCHAR(250) NOT NULL,
  id_abonne INT,
  FOREIGN KEY (id_abonne) references abonne(id_abonne)
);

CREATE TABLE contrat (
  id_contrat INT AUTO_INCREMENT  PRIMARY KEY,
  canal VARCHAR(250) NOT NULL,
  condition VARCHAR(250) NOT NULL,
  id_adresse INT,
  id_abonne INT,
  FOREIGN KEY (id_adresse) references adresse(id_adresse),
  FOREIGN KEY (id_abonne) references abonne(id_abonne)
);

CREATE TABLE mouvement (
  id_mouvement INT AUTO_INCREMENT  PRIMARY KEY,
  typeModification VARCHAR(250) NOT NULL,
  dateModification date NOT NULL,
  id_adresse INT,
  FOREIGN KEY (id_adresse) references adresse(id_adresse)
);