package day025_260810_JAVA.종합예제.model.dao;

import java.util.ArrayList;

import day025_260810_JAVA.종합예제.model.dto.BoardDto;

public class BoardDao {

    private BoardDao(){}

    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance(){ return instance; }

    // 추후에 MySQL 서버와 연동할 것

    // 데이터베이스 대신 ArrayList 사용

    private ArrayList< BoardDto > boardList = new ArrayList<>(); 
    

    // 게시물 작성 로직
    
    // controller 로 부터 저장할 정보 객체 받는다          * 추후에 insert 이용한 db 에 저장
    public Boolean save( BoardDto boardDto){

        // 리스트에 저장
        boardList.add(boardDto);

        // 성공 반환
        return true;
    }


    // 게시물 전체 조회 로직     추후에 select 이용한 db 조회
    public ArrayList<BoardDto> findAll() {
        
        // 리스트 전체 반환
        return boardList;
    }



}
