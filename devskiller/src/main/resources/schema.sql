
DROP TABLE IF EXISTS TBL_ITEM;

CREATE TABLE TBL_ITEM (
    ID_ITEM INT AUTO_INCREMENT  PRIMARY KEY,
    TITLE VARCHAR(250) NOT NULL,
    DESCRIPTION VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS TBL_USER;

CREATE TABLE TBL_USER (
    ID_USER INT AUTO_INCREMENT  PRIMARY KEY,
    NOMBRES VARCHAR(250) NOT NULL,
    APELLIDOS VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS TBL_REVIEW;

CREATE TABLE TBL_REVIEW (
    ID INT AUTO_INCREMENT  PRIMARY KEY,
    RATING INT NULL,
    COMMENT VARCHAR(250) NOT NULL,
    ID_ITEM INT,
    ID_USER INT,
    FOREIGN KEY (ID_ITEM) REFERENCES TBL_ITEM(ID_ITEM),
    FOREIGN KEY (ID_USER) REFERENCES TBL_USER(ID_USER)
);