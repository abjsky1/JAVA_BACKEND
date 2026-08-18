package day030_260818_JAVA.종합예제_연습.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import day030_260818_JAVA.종합예제_연습.model.dto.Adto;

public class Adao extends BaseDao{

    private Adao(){}
    private static final Adao instance = new Adao();
    public static Adao getInstance(){return instance;}

   // [1] 등록 DAO
    public boolean save(Adto adto){

        try{
            // 1-1. SQL 작성  ,  값에 와일드카드(?) 이용한 매개변수 대입
            String sql = "insert into board( content , writer ) values( ? , ? )";

            // 1-2. 연동된  데이터베이스에 SQL 기재
            // conn 멤버변수는 BaseDao 에게 물려받음
            PreparedStatement ps = conn.prepareStatement(sql);

            // 1-3. 기재된 SQL 문법 안에 ?(와일드카드) 매개변수 값 대입  ==>>  ps.set타입( ?번호 , 값 )
    //      ps.setString(1, adto.getContent());  // 1(첫번째 ?)에 Dto content 대입
    //      ps.setString(2, adto.getWriter());   // 2(두번째 ?)에 Dto writer 대입

            // 1-4. 기재된 SQL 실행 ,   .executeUpdate()  insert/update/delete  에서 사용
            int result = ps.executeUpdate();  // 실행 후 처리된 레코드 수 반환

            // 1-5. SQL 결과
            if(result == 1){ return true;}

        }catch( SQLException e){ System.out.println(e);}
        
        // 1.5 SQL 결과
        return false; // 실패 의미 갖는 false 반환

    } // [1] END

    

}
