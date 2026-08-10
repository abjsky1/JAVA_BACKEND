package day025_260810_JAVA.종합실습.controller;

import java.util.ArrayList;

import day025_260810_JAVA.종합실습.model.dao.WaitingDao;
import day025_260810_JAVA.종합실습.model.dto.WaitingDto;

public class WaitingController {

    // CONTROLLER 싱글톤 만들기
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){return instance;}

    // CONTROLLER 에서 DAO 호출
    // MVC패턴 흐름의 CONTROLLER 싱글톤 호출
    private WaitingDao wd = WaitingDao.getInstance();

    // 대기명단 등록 컨트롤러

    // [1] VIEW 로 부터 저장할 정보 객체로 받는다   (유효성 검사, 타입 변환 등)
    public boolean save(WaitingDto waitingDto){

        // [2] DAO 에게 요청하고 응답받기
        boolean result = wd.save(waitingDto);

        // [3] DAO 에게 응답 받은 결과를 VIEW 에게 응답하기
        return result;

    }


    // 대기명단 전체 조회 컨트롤러

    // VIEW 에게 매개변수 받는다.   현재는 없음
    public ArrayList<WaitingDto> findAll(){

        // DAO 에게 요청하고 응답 받는다
        ArrayList<WaitingDto> result = wd.findAll();

        // DAO 에게 받은 결과를 VIEW 에게 반환한다
        return result;

    }


    // 대기명단 개별 수정 컨트롤러

    // [1] VIEW 로 부터 저장할 정보 객체로 받는다   (유효성 검사, 타입 변환 등)
    public boolean findModify(WaitingDto waitingDto){

        // DAO 에 전체 리스트 요청하고 받음
        ArrayList<WaitingDto> waitingList = wd.findAll();

        boolean result = false;
        // 유효성 검사
        for(int i = 0; i <= waitingList.size()-1 ; i++){

            if(waitingDto.getNo() == waitingList.get(i).getNo() && waitingDto.getName().equals(waitingList.get(i).getName())){
                
                // [2] DAO 에게 요청하고 응답받기
                result = wd.findModify(i, waitingDto);

            }

        }

        // [3] DAO 에게 응답 받은 결과를 VIEW 에게 응답하기
        return result;

    }




    // 대기명단 개별 삭제 컨트롤러

    // [1] VIEW 로 부터 저장할 정보 객체로 받는다   (유효성 검사, 타입 변환 등)
    public boolean findDelete(int a , String b){

        // DAO 에 전체 리스트 요청하고 받음
        ArrayList<WaitingDto> waitingList = wd.findAll();

        boolean result = false;
        // 유효성 검사
        for(int i = 0; i <= waitingList.size()-1 ; i++){

            if(a == waitingList.get(i).getNo() && b.equals(waitingList.get(i).getName()) ){
                
                // [2] DAO 에게 요청하고 응답받기
                result = wd.findDelete(i);

            }
            else{ result = false; }

        }

        // [3] DAO 에게 응답 받은 결과를 VIEW 에게 응답하기
        return result;

    }



}
