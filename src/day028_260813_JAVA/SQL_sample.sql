-- day028_260813_JAVA 폴더 안에 JAVA_exam2.java 와 연동

DROP DATABASE IF EXISTS mydb260813;

CREATE DATABASE mydb260813;

USE mydb260813;

CREATE TABLE board(
    no INT AUTO_INCREMENT,
    content VARCHAR(255),
    writer VARCHAR(30),
    CONSTRAINT PRIMARY KEY(no)
);

-- 샘플 데이터 2개 생성
INSERT INTO board( content , writer) VALUES ("안녕하세요" , "김길리"),("반갑습니다" , "람보르길리");

CREATE TABLE test( 
    no int AUTO_INCREMENT PRIMARY KEY,  -- CONSTRAINT PRIMARY KEY(no)
    name VARCHAR(30)
)