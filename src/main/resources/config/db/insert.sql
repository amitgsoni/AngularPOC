DELETE FROM CONTACT;

DELETE FROM PERSON;

INSERT INTO PERSON VALUES (1, 'Joe', 'Park');
INSERT INTO PERSON VALUES (2, 'Joe', 'Cook');
INSERT INTO PERSON VALUES (3, 'Tom', 'Miko');
INSERT INTO PERSON VALUES (4, 'Petrica', 'Castalo');
INSERT INTO PERSON VALUES (5, 'Rahul', 'Sharma');

INSERT INTO contact VALUES (1, 1, '111-111-1111');
INSERT INTO contact VALUES (2, 1, '111-222-1111');

INSERT INTO contact VALUES (3, 2, '111-111-3111');
INSERT INTO contact VALUES (4, 2, '111-111-4111');
INSERT INTO contact VALUES (5, 2, '111-111-5111');

INSERT INTO contact VALUES (6, 3, '111-111-1116');
INSERT INTO contact VALUES (7, 3, '111-111-1117');

INSERT INTO contact VALUES (8, 4, '111-111-1188');

COMMIT;

SELECT * FROM person p left outer join contact c on p.person_id = c.person_id where first_name like '%Joe%' or last_name like '%Joe%' 
