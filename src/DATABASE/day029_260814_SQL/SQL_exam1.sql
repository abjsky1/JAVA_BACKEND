/*

    자료 유효성 검사 위치  :  JS/FLUTTER() , contrller , DAO , DB  (실무에서는 안정화가 중요)

    자료 가공 위치  :  자바(정렬/IF) vs DB(정렬/IF)    < 데이터 처리는 성능(시간)에 따라가기 때문에 정답이 없다. >

    테스트 포폴 ( 리팩토링 ) : 기존에 있던 사업을 이어가는 것.  ==>  다른 사람의 코드 보면서 이해하고 연습하기.

*/

-- 1. SELECT 필드명 FROM 테이블명 GROUP BY 필드명

-- 2. SELECT 필드명 FROM 테이블명 GROUP BY 필드명 HAVING 그룹조건

-- 3. SELECT 필드명 FROM 테이블명 ORDER BY 필드명 ASC/DESC

-- 4. SELECT 필드명 FROM 테이블명 LIMIT 시작번호, 개수

-- *. 같이 쓸 때 순서. vv
--    SELECT 필드명 FROM 테이블명 
--    WHERE 일반조건 
--    GROUP BY 필드명 
--    HAVING 그룹조건 
--    ORDER BY 필드명 
--    LIMIT 시작번호, 개수


-- [집계함수]

-- 1. SUM(필드명)
-- 2. AVG(필드명)
-- 3. MAX(필드명)
-- 4. MIN(필드명)
-- 5. COUNT(필드명)


# 1. 데이터베이스 생성 
drop database if exists mydb260814; -- 만약에 'mydb260814' 데이터베이스 존재하면 삭제
create database mydb260814;   -- 'mydb260814' 데이터베이스 생성 
use mydb260814;      -- 'mydb260814' 데이터베이스 사용 , 워크벤치 재실행후에도
# 2. 테이블 생성 
create table table1(     -- 'table1' 테이블 생성 
 num_pk int ,      -- 'num_pk' 속성/컬럼/필드 을 int 타입 선언 
    constraint primary key( num_pk ) -- 선언된 'num_pk' 속성을 pk(식별키) 설정 
);
# 2. 테이블 생성 
create table table2(
 no_pk int , 
    constraint primary key( no_pk ) ,
    num_fk int ,        -- 'num_fk' 속성 을 int 타입 선언  
    constraint foreign key( num_fk ) references table1( num_pk )   -- 선언된 'num_fk'' 속성을 fk(참조키) 설정 'table1' 테이블의 'num_pk' 를 참조 
    on update cascade  on delete cascade  -- 만약에 table1 의 'num_pk' 값이 수정/삭제 되면 'num_fk' 값도 같이 수정/삭제 
); 
# 3. 서로 다른 테이블 합치기 = JOIN , # PK레코드와 FK레코드를 하나의 테이블로 조회  
# 샘플 데이터 
insert into table1 values( 1 ) , (2) , (3) , (4) , (5);
insert into table2 values( 1 , 1 ) , ( 2 , 2 ) , ( 3 , 1 ) , (4 , 1 ) , (5, 2);
# 레코드 조회 
select * from table1;  -- 1 2 3 4 5
select * from table2;  -- 1 1 , 3 1 , 4 1 , 2 2 , 5 2


-- [1] 교집합

-- 주의할 점 : 두 개 이상의 테이블 간에 데카르트 곱으로 표현
SELECT * FROM table1 , table2;   -- table1(5개) * table2(5개) => 25개  ,  2개 이상 테이블 조회

-- 1. WHERE 절 이용
SELECT * FROM table1 , table2 WHERE table1.num_pk = table2.num_fk;  -- 5개
SELECT * FROM table1 t1 , table2 t2 WHERE t1.num_pk = t2.num_fk;  -- 별칭 이용

-- 2. 테이블A inner join 테이블B on 조인조건 
SELECT * FROM table1 t1 INNER JOIN table2 t2 ON t1.num_pk = t2.num_fk;

-- 3. 테이블A join 테이블B on 조인조건
SELECT * FROM table1 t1 JOIN table2 t2 ON t1.num_pk = t2.num_fk;

-- 4. 테이블A NATURAL JOIN 테이블B    // 전제조건 : PK 와 FK 의 필드명이 같은 경우
SELECT * FROM table1 t1 NATURAL JOIN table2 t2;

-- 5. 테이블A Join 테이블B USING( 필드명 )   // 전제조건 : PK 와 FK 의 필드명이 같은 경우
-- SELECT * FROM table1 t1 JOIN table2 t2 USING( num )

-- 6. 3개 이상 xpdlqmf 조인
-- SELECT * FROM table1 t1 INNER JOIN table2 t2 ON 조인조건 INNER JOIN table3 t3 ON 조인조건


-- [ OUTER JOIN ]

-- 1. 테이블A LEFT OUTER JOIN 테이블B ON 조인조건    // 왼쪽 테이블의 모든 레코드와 오른쪽 테이블은 교집합 되는 레코드만 조회
SELECT * FROM table1 t1 LEFT OUTER JOIN table2 t2 ON t1.num_pk = t2.num_fk;
SELECT * FROM table1 t1 LEFT JOIN table2 t2 ON t1.num_pk = t2.num_fk;  -- OUTER 생략 가능

-- 2. 테이블A RIGHT OUTER JOIN 테이블B ON 조인조건    // 오른쪽 테이블의 모든 레코드와 왼쪽 테이블의 교집합 되는 레코드만 조회
SELECT * FROM table1 t1 RIGHT OUTER JOIN table2 t2 ON t1.num_pk = t2.num_fk;
SELECT * FROM table1 t1 RIGHT JOIN table2 t2 ON t1.num_pk = t2.num_fk;  -- OUTER 생략 가능


-- [2] 합집합
-- 1. 테이블A UNION 테이블B : 중복 제외한 2개이상 테이블 합치기 , ORACLE : FULL OUTER JOIN
SELECT * FROM table1 t1 LEFT JOIN table2 t2 ON t1.num_pk = t2.num_fk UNION
SELECT * FROM table1 t1 RIGHT JOIN table2 t2 ON t1.num_pk = t2.num_fk;


-- [3] 차집합

-- 1. 테이블A LEFT JOIN 테이블B ON 조인조건 WHERE 테이블B.FK IS NULL;
SELECT * FROM table1 t1 LEFT JOIN table2 t2 ON t1.num_pk = t2.num_fk WHERE num_fk IS NULL;
SELECT num_pk FROM table1 t1 LEFT JOIN table2 t2 ON t1.num_pk = t2.num_fk WHERE num_fk IS NULL;

-- 2. 테이블A RIGHT JOIN 테이블B ON 조인조건 WHERE 테이블A.PK IS NULL;
SELECT * FROM table1 t1 RIGHT JOIN table2 t2 ON t1.num_pk = t2.num_fk WHERE num_pk IS NULL;
SELECT num_pk FROM table1 t1 RIGHT JOIN table2 t2 ON t1.num_pk = t2.num_fk WHERE num_pk IS NULL;