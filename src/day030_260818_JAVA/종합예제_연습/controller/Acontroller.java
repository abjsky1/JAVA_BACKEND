package day030_260818_JAVA.종합예제_연습.controller;

import java.util.ArrayList;

import day030_260818_JAVA.종합예제_연습.model.dao.Adao;
import day030_260818_JAVA.종합예제_연습.model.dao.IBaseDao;

public class Acontroller {

    // 생성자를 private 로 만들기 
    //  (다른 클래스에서 객체생성 불가)
    private Acontroller(){}

    // 클래스 내부에 객체 만들기 
    //  (외부에서 직접 접근 불가능)
    //  (객체가 클래스에 소속되어 존재)
    //  (다른 객체를 다시 넣을 수 없음)
    //  (객체 실제로 생성해서 Acontroller 타입인 instance 라는 변수에 대입)
    private static final Acontroller instance = new Acontroller();

    // 만들어 놓은 객체를 밖에서 가져갈 수 있게 해줌
    //  (instance 를 반환하는 함수 생성)
    //  (다른 클래스에서 사용 가능)
    public static Acontroller getInstance(){return instance;}

    // Controller 와 DAO 의 연결 
    private IBaseDao ad = Adao.getInstance();

    

    

}
