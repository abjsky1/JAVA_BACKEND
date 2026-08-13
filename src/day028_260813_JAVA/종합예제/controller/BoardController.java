package day028_260813_JAVA.종합예제.controller;

import java.util.ArrayList;

import day028_260813_JAVA.종합예제.model.dao.BoardDao;
import day028_260813_JAVA.종합예제.model.dto.BoardDto;

public class BoardController {

    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){ return instance; }

    //[*] MVC패턴 흐름의 dao 싱글톤 호출
    private BoardDao bd = BoardDao.getInstance();

    public boolean save( BoardDto boardDto ){
        boolean result = bd.save(boardDto);  // VIEW 에게 전달받은 매개변수를 DAO 에게 전달
        return result;  // DAO 에게 받은 결과 VIEW 에게 반환

    }

    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }

    public boolean update( BoardDto boardDto ){

        // 유효성 검사 
        // ArrayList<BoardDto> list = bd.findAll();

        boolean result = bd.update(boardDto);
        return result;
    }

    public boolean delete( int no ){

        // 유효성 검사 
        // ArrayList<BoardDto> list = bd.findAll();

        boolean result = bd.delete(no);
        return result;
    }
    
}
