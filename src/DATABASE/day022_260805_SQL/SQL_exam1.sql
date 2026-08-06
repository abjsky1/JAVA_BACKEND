/*
    [데이터베이스]  :  여러 사람이나 여러 프로그램이 공유하여 사용할 수 있도록 데이터 집합
        - 데이터베이스 서버 : MYSQL , 요청에 따라 데이터 처리하고 응답하는 프로그램
        - 특징 : 실시간 접근, 동시 공유, 데이터 참조, 지속적인 변화 등
        - 종류 :
            1) 관계형 데이터베이스(SQL)  ex. 표
            2) NOSQL 

    [SQL]  :  관계형 데이터베이스에서 데이터를 조작/제어 하기 위한 표준 언어
        메타 데이터 언어 : show ~  ,  use ~
        종류 :
            1) DDL  :  데이터 정의 언어  :  데이터베이스(테이블) 정의하고 변경할 때 사용   ex) create ~  ,  drop ~  ,
            2) DML  :  데이터 조작 언어  :  테이블 안에 데이터들을 조작
            3) DCL  :  데이터 제어 언어  :  데이터베이스 접근권한 or 계정관리
            4) TCL  :  트랜잭션 제어 어  :  DML 실행 결과를 취소 or 적용                ex) COMMIT

*/

# [1] 데이터베이스 삭제
DROP DATABASE if EXISTS mydb260805;

# [2] 데이터베이스 생성
CREATE DATABASE mydb260805;

# [3] 데이터베이스 목록 확인
SHOW DATABASES;

# [4] 사용할 데이터베이스 선택
USE mydb260805;

--------------------------------------------------------------------------------

# DDL  :  데이터베이스 / 테이블 생성 / 삭제 / 수정 질의어 (트랜잭션 불가능 / 오토커밋)
# 1) 테이블 생성 :
    -- 테이블 생성할 데이터베이스 활성화
    -- CREATE Table 테이블명( 속성명 타입 , 속성명 타입 );
CREATE Table test1( 필드명1 int , 필드명2 DOUBLE , 필드명3 TEXT );

# 2) 테이블 목록 조회
SHOW TABLES;

# 3) 특정 테이블 속성 확인
    -- DESCRIBE 테이블명
DESCRIBE test1;

# 4) 특정 테이블 삭제
DROP TABLE test1;

# 5) 테이블 수정
    -- 필드 및 속성 추가
ALTER Table test1 add 필드명4 float;

    -- 필드 및 속성 수정
ALTER Table test1 MODIFY 필드명3 longtext;

    -- 필드 및 속성명 , 타입 수정
ALTER Table test1 CHANGE 필드명1 필드명5 BIGINT;

# 6) 테이블 이름 변경
RENAME TABLE test1 to new_test1;

# 7) 테이블 안에 모든 레코드(행/데이터) 삭제
    -- TRUNCATE 와 DELETE 의 차이  :  한번에 삭제 , 하나씩 삭제
TRUNCATE Table new_test1;


--------------------------------------------------------------------------------

# 테이블의 속성 및 필드 타입 *DBMS 회사마다 차이*

# 테이블을 만들 데이터베이스 선택
USE mydb260805;

CREATE Table test2( 
    정수필드1   TINYINT,       -- byte           +-128    1byte
    정수필드2   SMALLINT,      -- short                   2byte
    정수필드3   MEDIUMINT,     --                         3byte   
    정수필드4   int,           -- int                     4byte
    정수필드5   BIGINT,        -- long                    8byte
    정수필드6   int UNSIGNED,  -- 부호 없이 사용   0~255    5byte
    
    실수필드1   FLOAT,         --                         4byte
    실수필드2   DOUBLE,        --                         8byte
    실수필드3   DECIMAL,       -- 문자 타입 소수점 오차 없음                         
    
    날짜필드    DATE,          --
    시간필드    TIME,          --
    날짜시간    DATETIME,     

    문자필드1   CHAR(3),       --   CHAR  ( 문자 고정길이 )         
    문자필드2   VARCHAR(3),    -- VARCHAR ( 문자 가변길이 )
    -- ex) "수박"  =>  CHAR( [수][박][X] )  ,  VARCHAR( [수][박] )
    문자필드3   TEXT,          -- 6만자
    문자필드4   LONGTEXT,      -- 사진 포함된 게시물 내용 저장시 4GB 까지 가능한 LONGTEXT 권장

    논리필드    BOOLEAN        -- BOOLEAN 은 TINYINT(1)
    -- 마지막 필드타입 뒤로 , 넣지 말기
);


CREATE Table test3(
    필드명1 TINYINT NOT NULL,           -- 해당 필드/속성 에는 null 을 저장할 수 없도록 설정. 값이 null 이면 오류 발생
    필드명2 SMALLINT UNIQUE,            -- 해당 필드/속성 에는 중복값을 저장할 수 없도록 설정. 값이 다른 레코드와 같다면 오류 발생
    필드명3 INT DEFAULT 10,            -- 해당 필드/속성 에 레코드(행) 추가시 기본값이 10 대입됨.
    필드명4 DATETIME DEFAULT now(),     -- 예) 레코드 삽입시 (DB시점으로)현재 날짜/시간/now() 자동 대입됨.BIGINT
    필드명5 BIGINT AUTO_INCREMENT,      -- AUTO_INCREMENT : 해당 필드/속성 에 레코드(행) 추가시 자동으로 순서 번호가 할당됨. 1, 2, 3, 4, 5, ...
    CONSTRAINT PRIMARY KEY( 필드명5 )   -- 특정 필드/속성 을 PK 로 설정함.
    -- PRIMARY KEY (PK)  :  기본/식별 키 , 식별가능한 고유한 값 갖는 필드 (not null + unique 내장됨)
);

-- foreign key (FK)  :  참조/외래 키 ( PK 가 다른 테이블에 위치한 경우 ) , 다른 테이블의 기본키를 참조하는 키

-- 참조 옵션  :  PK 가 삭제 or 수정된 경우 FK 는 어떻게 할 것인가
    -- on delete/update CASCADE   :  PK 가 삭제/수정 되면 FK 도 같이 삭제/수정
    -- on delete/update set null  :  PK 가 삭제/수정 되면 FK 는 null 로 수정
    -- on delete/update restrict  :  (생략시 기본값) PK 가 FK 로부터 참조 중이면 삭제/수정 불가능

CREATE Table test4( 
    필드명1 BIGINT, 
    CONSTRAINT FOREIGN KEY ( 필드명1 ) REFERENCES test3( 필드명5 ) ON DELETE CASCADE
    );

DESCRIBE test3;

-- MySQL workbench 또는 VScode 에서 데이터베이스서버 연동 가능
-- MySQL workbench (ERD 다이어그램 자동생성)

-- 활용예제 --  회원제 게시판 서비스

# 1) 데이터베이스 존재하면 삭제
DROP DATABASE IF EXISTS boardService260805; 

# 2) 데이터베이스 생성
CREATE DATABASE boardService260805;

# 3) 사용할 데이터베이스 설정
USE boardService260805;


# 4) 회원테이블 생성
CREATE TABLE member(
    memberNo INT AUTO_INCREMENT,           -- 자동 회원번호
    CONSTRAINT PRIMARY KEY( memberNo ),   -- 회원번호 PK 로 설정
    memberID VARCHAR(30) NOT NULL UNIQUE, -- 회원 아이디 이면서 최대 30글자, 공백 불가능, 중복 불가능 설정
    memberPW VARCHAR(20) NOT NULL,        -- 회원 비밀번호 이면서 최대 20글자, 공백 불가능, 중복 가능 설정
    memberName VARCHAR(10) NOT NULL,      -- 회원 닉네임
    memberDate DATETIME DEFAULT now()     -- 회원가입 날짜/시간 을 현재 날짜/시간 자동으로 기본값 설정  *관례적 필수*
    -- 레코드 (들어오고 나갈 때)삽입 수정 날짜/시간 모두 기록하여 유지보수 때 사용 
);

CREATE Table board(
    bno int AUTO_INCREMENT,
    CONSTRAINT PRIMARY KEY( bno ),      -- 게시물 번호 PK 설정  *테이블당 PK 1개 이상 권장*
    btitle VARCHAR(255),                -- 게시물 제목
    bcontent LONGTEXT,                  -- 게시물 내용 , 대용량(사진)포함한 최대 4G 까지
    bdate DATETIME DEFAULT now(),       -- 게시물 작성일
    bview int DEFAULT 0,                -- 조회수
    memberNo int,                       -- 작성자 ( memberID 회원아이디 아니고 memberNo 회원번호 ) 
    CONSTRAINT FOREIGN KEY ( memberNo ) REFERENCES member( memberNo ) on DELETE CASCADE
    -- on delete/update CASCADE   :  PK 가 삭제/수정 되면 FK 도 같이 삭제/수정
);

