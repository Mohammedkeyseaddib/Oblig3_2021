DROP TABLE IF EXISTS KINOBILLETT;
CREATE TABLE KINOBILLETT (
     id INTEGER AUTO_INCREMENT NOT NULL,
     film VARCHAR (225) NOT NULL,
     antall VARCHAR (5) NOT NULL,
     fornavn VARCHAR (225) NOT NULL,
     etternavn VARCHAR (225) NOT NULL,
     telefon VARCHAR (225) NOT NULL,
     epost VARCHAR (225) NOT NULL,
     PRIMARY KEY (id)
)