DROP DATABASE if EXISTS db260806;

CREATE DATABASE db260806;

USE db260806;

CREATE Table 신청서( fcode int , CONSTRAINT PRIMARY KEY( fcode ),  fname TEXT , fnumbers TEXT , ffamily int , fexp boolean , freason TEXT , acode boolean , pcode int , dcode int , scode int , CONSTRAINT FOREIGN KEY ( dcode ) REFERENCES 동( dcode ) , CONSTRAINT FOREIGN KEY (scode) REFERENCES 시(scode) );

DESCRIBE 신청서;

CREATE TABLE 보호소( shcode int , CONSTRAINT PRIMARY KEY( shcode ), shname text );

CREATE TABLE 동물종류( tcode int , CONSTRAINT PRIMARY KEY( tcode ), tname text );

CREATE TABLE 시( scode int , sname text , CONSTRAINT PRIMARY KEY (scode));

CREATE TABLE 동( dcode int , dname text , CONSTRAINT PRIMARY KEY (dcode));







