package day025_260810_JAVA.종합예제.controller;

import java.util.ArrayList;

import day025_260810_JAVA.종합예제.model.dao.BoardDao;
import day025_260810_JAVA.종합예제.model.dto.BoardDto;

public class BoardController {

    private BoardController(){}

    private static final BoardController instance = new BoardController();

    public static BoardController getInstance(){ return instance; }

    private BoardDao bd = BoardDao.getInstance();

    // Controller 에서 view 호출 금지

    // 게시물 작성 컨트롤러 ( 유효성 검사 , 가공 등 )

    // view 로 부터 저장할 정보를 객체로 받음
    public boolean save( BoardDto boardDto ){

        // DAO 에게 요청하고 응답받기
        boolean result = bd.save(boardDto);

        // DAO 에게 받은 결과를 VIEW 에게 응답하기

        return result;
    }


    // 게시물 전체 조회 컨트롤러

    // view 에게 매개변수 받는다.  현재는 없음.  (유효성검사 데이터관리 등 진행)
    public ArrayList<BoardDto> findAll(){
        
        // DAO 에게 요청하고 응답을 받음
        ArrayList<BoardDto> result = bd.findAll();

        return result;
    }


}
