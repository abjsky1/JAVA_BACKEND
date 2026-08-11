/*

    [DML]

        1. insert into 테이블명( 필드명, 필드명 ) values( 값1 , 값2 );
            - insert into 테이블명 values ( 값1 , 값2 , 값3 );          // 모든 필드에 값 대입시 필드명 생략 가능 
            - insert into 테이블명( 필드명 ) values( 값 ), ( 값 );      // 2개 이상 레코드 등록

        2. select 필드명 from 테이블명 where 조건
            - select * form 테이블명 : 테이블 안에 모든 필드의 레코드 조회

        3. update 테이블명 set 필드명 = 수정할값 where 조건

        4. delete from 테이블명 where 조건


    [연산자]

        1. as : 별칭 , 필드명 as 별칭 , 테이블명 as 별칭      // 주의 : 생략가능
        2. distinct : 조회결과 (필드값) 중복제거
        3. 산술연산자 :  +  -  /  *   div(몫)   mod(나머지)
        4. 비교연산자 :  =  !=  >  <  >=  <=
        5. 논리연산자 :  and  or  not
            * between 시작값 and 끝값  ,  in( 값1 , 값2 , 값3 )
        6. null 연산자 :  필드명 is null  ,  필드명 is not null
        7. 문자열패턴 : 필드명 like "문자열패턴"
            % 모든문자대응      ,  김%  :  김으로 시작하는 N글자 조회
            _ 개수만큼문자대응   ,  김_  :  김으로 시작하는 2글자 조회
        

*/


# DB 생성
drop database if exists mydb268011;
create database mydb268011;
use mydb268011;

# 1. 회원 테이블 (member)
create table member(
 mid char(8) not null,   # 식별키 (최대 8자리)
    mname varchar(10) not null,  # 그룹명 (최대 10자리)
    mnumber int not null,   # 인원수
    maddr char(2) not null,   # 지역 (최대 2자리)
    mphone1 char(3),    # 지역번호
    mphone2 char(8),    # 전화번호
    mheight smallint,    # 평균키
 mdebut date,     # 데뷔일 (yyyy-mm-dd)
    constraint primary key (mid)
);

# 2. 구매 테이블 (buy)
create table buy(
 bnum int auto_increment,   # 구매번호 (자동증가)
    mid char(8),     # 구매자 (FK)
    bpname char(6) not null,  # 제품명
    bgname char(4),     # 분류명
    bprice int not null,   # 가격
    bamount smallint not null,  # 구매수량
    constraint primary key(bnum),
    constraint foreign key (mid) references member(mid)
);

# 샘플 데이터
INSERT INTO member VALUES
('TWC','트와이스',9,'서울','02','11111111',167,'2015-10-19'),('BLK','블랙핑크',4,'경남','055','22222222',163,'2016-08-08'),
('WMN','여자친구',6,'경기','031','33333333',166,'2015-01-15'),('OMY','오마이걸',7,'서울',NULL,NULL,160,'2015-04-21'),
('GRL','소녀시대',8,'서울','02','44444444',168,'2007-08-02'),('ITZ','잇지',5,'경남',NULL,NULL,167,'2019-02-12'),
('RED','레드벨벳',4,'경북','054','55555555',161,'2014-08-01'),('APN','에이핑크',6,'경기','031','77777777',164,'2011-02-10'),
('SPC','우주소녀',13,'서울','02','88888888',162,'2016-02-25'),('MMU','마마무',4,'전남','061','99999999',165,'2014-06-19');

INSERT INTO buy VALUES
(NULL,'BLK','지갑',NULL,30,2),(NULL,'BLK','맥북프로','디지털',1000,1),
(NULL,'APN','아이폰','디지털',200,1),(NULL,'MMU','아이폰','디지털',200,5),
(NULL,'BLK','청바지','패션',50,3),(NULL,'MMU','에어팟','디지털',80,10),
(NULL,'GRL','혼공SQL','서적',15,5),(NULL,'APN','혼공SQL','서적',15,2),
(NULL,'APN','청바지','패션',50,1),(NULL,'MMU','지갑',NULL,30,1),
(NULL,'APN','혼공SQL','서적',15,1),(NULL,'MMU','지갑',NULL,30,4);

# 샘플 확인
select * from member;
select * from buy;

-- [그룹절]
select * from buy;  -- 전체조회

-- select * from buy GROUP BY bpname;  -- 제품명(bpname) 기준으로 그룹하고 모든 필드 조회   ==>  error

select bpname from buy GROUP BY bpname;  -- 제품명(bpname) 기준으로 그룹하고 bpname 필드만 조회
-- 그룹당 단 하나의 대표값만 조회

-- select bpname , mid from buy GROUP BY bpname;  -- error


select sum(bamount) from buy;   -- sum(필드명) 합계

select avg(bamount) from buy;   -- avg(필드명) 평균

select min(bamount) from buy;   -- min(필드명) 최솟값

select max(bamount) from buy;   -- max(필드명) 최댓값

select count(bamount) from buy; -- count(필드명) 레코드수(null 제외)

select count(*) from buy;       -- count(필드명) 레코드수(null 포함)


-- [3] 그룹절과 집계함수  ,  그룹( ~~별  ~~끼리 )  ,  그룹필드명 집계함수
SELECT mid FROM buy GROUP BY mid;  -- mid 기준으로 그룹하여 총 구매수량(bamount)

SELECT mid , sum(bamount) 총구매수량
    FROM buy GROUP BY mid;  -- mid 기준으로 그룹하여 총 구매수량(bamount)

SELECT mid , sum(bamount * bprice) 총구매금액
    FROM buy GROUP BY mid;  -- mid 기준으로 총 구매금액(수량 * 가격)

SELECT COUNT(*) , mid FROM buy GROUP BY mid;    -- mid(회원)별 구매 횟수


-- 그룹절의 조건절 , where 그룹 전에 조건 , having 그룹 후에 조건

SELECT * from buy where bamount > 3;  -- 구매 수량이 3 초과이면

SELECT mid , sum(bamount) 총구매수량 
    FROM buy GROUP BY mid HAVING 총구매수량 > 5;

-- SELECT mid , sum(bamount) 총구매수량 FROM buy WHERE 총구매수량 > 5 GROUP BY mid ;  -- error   


-- 순서     SELECT [필드명] FROM [테이블명] WHERE [조건절] GROUP BY [그룹필드] HAVING [그룹조건]  ORDER BY [정렬필드] LIMIT [시작인덱스, 개수];


-- order by 정렬 , desc 내림차순( 3-2-1 , 다-나-가 , C-B-A , 0811-0810-0809 ) , asc 오름차순
SELECT * FROM member order by mdebut;

SELECT * FROM member order by mdebut DESC;

-- [*] 다중정렬이란 첫번째 정렬 후 첫번째 정렬필드 기준으로 중복이 존재한 경우 중복끼리 2차정렬
-- 1ㅈㅏ 정렬 지역(maddr) 먼저 정렬하고 지역필드 안에 *동일한 값 끼리* 2차 정렬(mdebut) 한다.
-- SELECT * FROM member order by maddr DESC mdebut ASC;

-- limit : 결과 레코드 제한 , *페이징처리

SELECT * from member;  -- 10개

SELECT * from member LIMIT 2;  -- 2개

SELECT * from member LIMIT 0 , 2;  -- 0번부터 2개  0 , 1

SELECT * from member LIMIT 5 , 5;  -- 5번 인덱스 부터 5개  5 , 6 , 7 , 8 , 9

-- 순서  :  SELECT [필드명] FROM [테이블명] WHERE [조건절] GROUP BY [그룹필드] HAVING [그룹조건] ORDER BY [정렬필드] LIMIT [시작인덱스, 개수];







