package day025_260810_JAVA.종합실습.model.dao;

import java.util.ArrayList;

import day025_260810_JAVA.종합실습.model.dto.WaitingDto;

public class WaitingDao {

    // DAO 싱글톤 만들기
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){return instance;}

    // 데이터베이스 대신에 ArrayList 사용하여 데이터베이스 표/데이터 역할
    // 추후에 My SQL 서버와 연동
    private ArrayList <WaitingDto> waitingList = new ArrayList<>();

    // 대기명단 등록 로직

    // [1] Controller 로 부터 저장할 정보 객체를 받음  ( 추후에 insert 이용한 db에 저장 )
    public boolean save(WaitingDto waitingDto){

        // [2] 리스트에 저장
        waitingList.add(waitingDto);

        // [3] 성공 반환
        return true;

    }


    // 대기명단 전체 조회 로직

    // [1] Controller 에게 매개변수 받는다.   현재는 없음    추후에 select 를 이용해 db 조회
    public ArrayList<WaitingDto> findAll(){

        // 리스트 전체 반환
        return waitingList;

    }


    // 대기명단 개별 수정 로직

    // [1] Controller 로 부터 수정할 정보 객체를 받음  ( 추후에 insert 이용한 db에 저장 )
    public boolean findModify(int a , WaitingDto waitingDto){

        // [2] 리스트에 저장
        waitingList.set(a, waitingDto);

        // [3] 성공 반환
        return true;

    }



    // 대기명단 개별 삭제 로직

    // [1] Controller 로 부터 수정할 정보 객체를 받음  ( 추후에 insert 이용한 db에 저장 )
    public boolean findDelete(int a){

        // [2] 리스트에 저장
        waitingList.remove(a);

        // [3] 성공 반환
        return true;

    }

}
