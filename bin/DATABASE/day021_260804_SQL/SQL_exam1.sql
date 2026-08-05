-- 현재 자바프로젝트 폴더내 -> src -> 'database' 폴더 생성
-- 'database' 폴더내 파일명(day021_260804_SQL).sql 파일 생성

# 한줄 주석
-- 한줄 주석
/* 여러줄 주석 */


-- 데이터베이스  :  여러 데이터들을 집합(공간)
-- 데이터베이스 서버  :  여러 데이터베이스들을 저장한 PC(프로그램) ex.MySQL


-- [1] 데이터베이스 목록 보기
-- 1. SQL 문법 작성한다.
-- 2. ;세미콜론 마침
-- 3. 실행할 SQL문법에 커서 두고 CTRL + 엔터 또는 RUN
SHOW DATABASES;  -- 연결된 DB 서버 안에 모든 데이터베이스 목록 확인


-- [2] 데이터베이스 로컬 경로 확인
SHOW VARIABLES LIKE 'datadir'


-- [3] 데이터베이스 생성  ,  주의 : SQL 문법은 대소문자 구문 안 함
CREATE DATABASE mydb260804;  -- 연결된 DB 서버내 특정한 데이터베이스 생성


-- [4] 데이터베이스 삭제
DROP DATABASE mydb260804;

DROP DATABASE IF EXISTS mydb260804;


-- [5] 데이터베이스 활성화  :  연결된 DB 서버 안에 여러개 DB 중 조작할 DB 선택
USE mydb260804;


-- [활용]  :  프로젝트 데이터베이스 생성
DROP DATABASE if EXISTS testdb260804;
CREATE DATABASE testdb260804;
USE testdb260804;
