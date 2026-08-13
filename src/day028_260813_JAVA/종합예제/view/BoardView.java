package day028_260813_JAVA.종합예제.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day028_260813_JAVA.종합예제.controller.BoardController;
import day028_260813_JAVA.종합예제.model.dto.BoardDto;


public class BoardView {

    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance( ){ return instance; } // 3. 

    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();

    // [*] 입력 객체
    private Scanner scan = new Scanner(System.in);

    // [*] 최초 루프/화면
    public void run(){
        while (true) {
            try{
            System.out.println("1.등록  2.전체조회  3.개별수정  4.개별삭제  5.시스템종료   선택>>> ");
            int ch = scan.nextInt();

            if(ch == 1){ save(); }
            else if(ch == 2){ findAll(); }
            else if(ch == 3){ update(); }
            else if(ch == 4){ delete(); }
            else if(ch == 5){break;}
            else{continue;}

            }catch(InputMismatchException e){
                scan = new Scanner(System.in);  // 입력 자체는 성공했지만 타입에서 에러가 발생한 것이므로 입력객체 초기화.
                System.out.println("[다시 입력]" + e);
            }
        }


    } 

    
    // [1] 등록 VIEW
    public void save(){

        // 1-1. 저장할 자료 입력받기
        System.out.println("내용 : ");  String 내용 = scan.next();
        System.out.println("작성자 : ");  String 작성자 = scan.next();

        // 1-2. 자료 객체화 하기 , no 아무거나 사용
        BoardDto boardDto = new BoardDto(0,내용,작성자);

        // 1-3. 컨트롤러에게 전달(dto) 하여 
        boolean result = bc.save(boardDto); 

        // 1.4 응답받은 결과로 출력
        if( result ){ System.out.println("등록 성공");} 
        else{ System.out.println("등록 실패"); }
    }


    // [2] 전체 조회 VIEW
    public void findAll(){

        // 1. 컨트롤러에게 모든 게시물 정보 요청하고 모든 게시물 정보들을 받는다.
        ArrayList<BoardDto> result = bc.findAll();
        for( BoardDto dto : result){
            System.out.println( dto.getNo() + " / " + dto.getWriter() + " / " + dto.getContent() );
        }


    }


    // [3] 특정 게시물 수정
    public void update(){
        
        System.out.println("수정할 번호 : "); int 수정할번호 = scan.nextInt();
        System.out.println("수정할 내용 : "); String 수정할내용 = scan.next();

        BoardDto boardDto = new BoardDto(수정할번호, 수정할내용, null);

        boolean result = bc.update(boardDto);

        if(result){System.out.println("수정 성공");}
        else{System.out.println("수정 실패");}
    }


    // [4] 특정 게시물 삭제
    public void delete(){
        
        System.out.println("삭제할 번호 : "); int 삭제할번호 = scan.nextInt();

        // 매개변수 1개이므로 DTO 없이 진행
        // BoardDto boardDto = new BoardDto(수정할번호, null, null);

        boolean result = bc.delete(삭제할번호);

        if(result){System.out.println("삭제 성공");}
        else{System.out.println("삭제 실패");}
    }
    

} // class end
