--DROP TABLE users IF EXISTS;

CREATE TABLE IF NOT EXISTS person (
  person_id		INTEGER PRIMARY KEY,
  first_name 	VARCHAR(30),
  last_name 	VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS contact (
  contact_id	INTEGER PRIMARY KEY,
  person_id		INTEGER,
  phone_no 		VARCHAR(30)
);

ALTER TABLE contact
ADD FOREIGN KEY (person_id) REFERENCES person (person_id); 
