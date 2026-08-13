package day028_260813_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
        // JDBC  :  자바와 데이터베이스 연동 제공하는 인터페이스
        
        // 1. 프로젝트 안 lib 폴더에  'mysql-connector-j-26.7.0.jar'  파일 저장한다.
        
        // [연동] 

        
        try{
            // [1] MySQL 회사에서 제공하는 Driver 구현체 (동적) 로드  *예외처리 필수*  ..리플렉션..
            Class.forName("com.mysql.cj.jdbc.Driver");   // 구현체가 위치한 경로
            System.out.println("Driver 연동성공");
            
            // [2] 데이터베이스 서버 연동  *예외처리 필수*
            // DriverManager.getConnection("jdbc:mysql://ip번호:포트번호/데이터베이스명", "계정명" , "비밀번호");
            String url = "jdbc:mysql://127.0.0.1:3306/mydb260813";
            String user = "root";
            String password = "991231";

            //  Connection : 인터페이스     ,    SQL 구현체
            Connection conn = DriverManager.getConnection(url, user , password);
            System.out.println("데이터베이스 연동 성공");

            // [3] 연동된 데이터베이스 안에 DML(insert, select, update, delete) 조작
            // 1. insert 하기  insert into 테이블명 (필드명) values (값)
            String sql = "insert into test(name) values('김길리')";
            PreparedStatement ps1 = conn.prepareStatement(sql);  // conn(연동된 인터페이스).prepareStatement(기재할 SQL)
            // PreparedStatement(SQL 이 기재된 인터페이스)
            int result = ps1.executeUpdate();  // ps(SQL 기재된 인터페이스)
            // ps.executeUpdate() , (SQL 기재된 인터페이스에서 SQL 실행), 실행한 레코드 수 반환
            System.out.println(result);  // 1 : 성공  ,  0 : 실패
            System.out.println("레코드 등록 성공");
            // 2. select 하기   select * from test;
            String sql2 = "select * from test";
            PreparedStatement ps2 = conn.prepareStatement(sql2);  // 작성한 SQL 기재한다.
            ResultSet rs = ps2.executeQuery();  // 기재된 SQL 실행  ,  결과 rs 인터페이스에 대입
            rs.next();  // 조회 결과에서 다음 레코드로 이동
            System.out.println(rs.getInt("no"));  // rs.get타입("속성명");
            System.out.println(rs.getString("name"));  // rs.get타입("속성명");
            System.out.println("레코드 조회 성공");

        
        
        }catch( ClassNotFoundException e ){
            System.out.println("드라이버가 존재하지 않습니다." + e);
        }catch( SQLException e ){
            System.out.println("DB 서버와 연동 실패했다." + e);
        }








    }
}
