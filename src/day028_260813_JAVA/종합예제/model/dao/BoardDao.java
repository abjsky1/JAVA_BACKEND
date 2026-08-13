package day028_260813_JAVA.종합예제.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import day028_260813_JAVA.종합예제.model.dto.BoardDto;

public class BoardDao extends BaseDao { // BaseDao 상속 

    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){ return instance; }

    // [1] 등록 DAO
    public boolean save(BoardDto boardDto){

        try{
            // 1-1. SQL 작성  ,  값에 와일드카드(?) 이용한 매개변수 대입
            String sql = "insert into board( content , writer ) values( ? , ? )";

            // 1-2. 연동된  데이터베이스에 SQL 기재
            // conn 멤버변수는 BaseDao 에게 물려받음
            PreparedStatement ps = conn.prepareStatement(sql);

            // 1-3. 기재된 SQL 문법 안에 ?(와일드카드) 매개변수 값 대입  ==>>  ps.set타입( ?번호 , 값 )
            ps.setString(1, boardDto.getContent());  // 1(첫번째 ?)에 Dto content 대입
            ps.setString(2, boardDto.getWriter());   // 2(두번째 ?)에 Dto writer 대입

            // 1-4. 기재된 SQL 실행 ,   .executeUpdate()  insert/update/delete  에서 사용
            int result = ps.executeUpdate();  // 실행 후 처리된 레코드 수 반환

            // 1-5. SQL 결과
            if(result == 1){ return true;}

        }catch( SQLException e){ System.out.println(e);}
        
        // 1.5 SQL 결과
        return false; // 실패 의미 갖는 false 반환

    } // [1] END



    // [2] 전체 조회 DAO
    public ArrayList<BoardDto> findAll(){

        ArrayList<BoardDto> list = new ArrayList<>();  // 레코드 정보들을 담을 리스트 생성

        try{
            // 2-1. SQL 작성한다.
            String sql = "select * from board";  

            // 2-2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);  // *예외 발생

            // 2-3. ?매개변수 대입한다. <생략>

            // 2-4. 기재된 SQL 실행  ,  executeQuery() 는 select(조회) 문에서 사용
            ResultSet rs = ps.executeQuery();  // 

            // 2-5. SQL 결과( select 조회 결과는 항상 테이블로 반환한다. ) 즉, 레코드 하나씩 타입변환
            // rs.next() : 다음 레코드(행) 이동 , 마지막 레코드까지 하나씩 이동 반복
            while (rs.next()) { 
                
                // 2-6. 현재 레코드 필드(속성/정보)들을 --> DTO 변환
                BoardDto boardDto = new BoardDto();
                boardDto.setNo(rs.getInt("no"));  // rs.get타입("가져올 속성명")
                boardDto.setContent(rs.getString("content"));
                boardDto.setWriter(rs.getString("writer"));

                // 2-7. 변환한 DTO --> 리스트에 담기
                list.add(boardDto);
            }

        }catch( SQLException e){ System.out.println(e);}

        // 2-8. 리스트 반환
        return list;

    } // [2] END


    // [3] 특정 게시물 수정 DAO
    public boolean update(BoardDto boardDto){

        try{
        // 1-1. SQL 작성한다.
            String sql = "update board set content = ? where no = ?";

        // 1-2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);

        // 1-3. SQL 안에 ? 매개변수 대입
            ps.setString(1, boardDto.getContent());
            ps.setInt(2, boardDto.getNo());

        // 1-4. SQL 실행
            int result = ps.executeUpdate();

        // 1-5-1. 실행 결과 반환
            if(result == 1){return true;}

        }catch(SQLException e){System.out.println(e);}

        // 1-5-2. 실행 결과 반환
        return false;


    } // [3] END
    

    // [4] 특정 게시물 삭제 DAO
    public boolean delete(int no){

        try{
        // 1-1. SQL 작성한다.
            String sql = "delete from board where no = ? ";

        // 1-2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);

        // 1-3. SQL 안에 ? 매개변수 대입
            ps.setInt(1, no);

            conn.prepareStatement("delete from board where no = ? ").setInt(1, no);

        // 1-4. SQL 실행
            int result = ps.executeUpdate();

        // 1-5-1. 실행 결과 반환
            if(result == 1){return true;}

        }catch(SQLException e){System.out.println(e);}

        // 1-5-2. 실행 결과 반환
        return false;


    } // [4] END

}
