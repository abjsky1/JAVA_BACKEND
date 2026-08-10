package day025_260810_JAVA.종합실습.view;

import java.util.ArrayList;
import java.util.Scanner;

import day025_260810_JAVA.종합실습.controller.WaitingController;
import day025_260810_JAVA.종합실습.model.dto.WaitingDto;

public class WaitingView {

    // VIEW 싱글톤 만들기
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){return instance;}

    // VIEW 에서 CONTROLLER 호출
    // MVC패턴 흐름의 CONTROLLER 싱글톤 호출
    private WaitingController wc = WaitingController.getInstance();

    private Scanner scan = new Scanner(System.in);  // 모든 메소드에서 사용 가능한 입력객체

    int no = 1;

    public void save(){
        // 입력받기
        System.out.println("이름 입력 : ");
        String name = scan.next();

        System.out.println("인원수 입력 : ");
        int pon = scan.nextInt();

        // 객체화
        WaitingDto waitingDto = new WaitingDto(no, name, pon);

        // 컨트롤러에게 요청하고 응답받기
        boolean result = wc.save(waitingDto);

        // 처리한다
        if(result){
            System.out.println("대기명단 등록 성공");
            // 대기번호 수 증가
            no++;
        }
        else{ System.out.println("대기명단 등록 실패");}

    }


    // 대기명단 전체 출력
    public void findAll(){

        // Controller 에게 모든 대기명단을 요청하고 받는다
        ArrayList<WaitingDto> result = wc.findAll();
        
        // Controller 에게 받은 모든 대기명단을 출력한다
        for(WaitingDto waiting : result ){
            System.out.println("대기번호 : " + waiting.getNo() + ", 이름 : " + waiting.getName() + ", 인원수 : " + waiting.getPon() + "명" );
        }
    
    }


    // 대기명단 개별 수정
    public void findModify(){
        // 입력받기
        System.out.println("대기번호 입력 : ");
        int no = scan.nextInt();

        System.out.println("이름 입력 : ");
        String name = scan.next();

        System.out.println("수정할 인원수 입력 : ");
        int pon = scan.nextInt();

        // 객체화
        WaitingDto waitingDto = new WaitingDto(no, name, pon);

        // 컨트롤러에게 요청하고 응답받기
        boolean result = wc.findModify(waitingDto);

        // 처리한다
        if(result){
            System.out.println("대기명단 수정 성공");
        }
        else{ System.out.println("대기명단 수정 실패");}

    }



    // 대기명단 개별 삭제
    public void findDelete(){
        // 입력받기
        System.out.println("대기번호 입력 : ");
        int no = scan.nextInt();

        System.out.println("이름 입력 : ");
        String name = scan.next();


        // 컨트롤러에게 요청하고 응답받기
        boolean result = wc.findDelete(no, name);

        // 처리한다
        if(result){
            System.out.println("대기명단 삭제 성공");
        }
        else{ System.out.println("대기명단 삭제 실패");}

    }



    // 메인 입출력
    public void run(){
        while(true){
            System.out.println("===================== ○○○ 매장에 오신 것을 환영합니다. =====================");
            System.out.println("1. 매장 대기하기    2. 대기 조회하기    3. 대기 수정하기    4. 대기 삭제하기");
            System.out.println("============================================================================");
            System.out.print("선택 >>  ");

            int ch = scan.nextInt();

            if (ch == 1) { save(); }
            else if (ch == 2) { findAll(); }
            else if (ch == 3) { findModify(); }
            else if (ch == 4) { findDelete(); }
            else { System.out.println("잘못된 입력입니다."); }
                
        }
    }



}
