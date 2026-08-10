package day025_260810_JAVA.종합예제.view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.border.Border;

import day025_260810_JAVA.종합예제.controller.BoardController;
import day025_260810_JAVA.종합예제.model.dto.BoardDto;

public class BoardView {

    private BoardView(){}

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance(){ return instance; }

    private BoardController bc = BoardController.getInstance();

    // 모든 메소드에서 사용 가능한 입력객체
    private Scanner scan = new Scanner(System.in);


    // [1] 메인 입출력
    public void run(){
        while (true) { // 무한루프
            System.out.println("1. 등록    2. 전체조회");
            int ch = scan.nextInt();
            if (ch == 1){ save(); }
            else if (ch == 2) { findAll(); }
        }
    }


    


    // 게시물 작성 입출력

    public void save(){

        // 입력 받기
        System.out.println("내용 : ");
        scan.nextLine();
        String 내용 = scan.nextLine();

        System.out.println("작성자 : ");
        String 작성자 = scan.nextLine();

        // 객체화
        BoardDto boardDto = new BoardDto( 내용 , 작성자 );

        // 컨트롤러에 요청하고 응답받기
        boolean result = bc.save( boardDto );

        // 처리하기
        if(result){System.out.println("등록 성공");}
        else{System.out.println("등록 실패");}

    }


    // 게시물 전체 출력

    
    public void findAll(){

        // 컨트롤러로부터 모든 게시물을 요청하고 받음
        ArrayList< BoardDto > result = bc.findAll();

        // 컨트롤러로부터 받은 모든 게시물을 출력
        for( BoardDto board : result){
            System.out.println(board.getWritter() + " : " + board.getContent());
        }

    }



}






