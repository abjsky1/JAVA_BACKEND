package day025_260810_JAVA;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
        // 싱글톤패턴  :  프로그램 안에 단 하나의 인스턴스(객체) 갖는 설계 구조
        // 목적  :  
        //  1. 여러 개발자들이 협업간의 여러개 인스턴스 생성을 방지 시킴
        //      - (프로그램 안에 인스턴스 여러개 필요 없는 경우)
        //  2. 하나의 인스턴스 사용하여 메모리 공유
        View 인스턴스1 = new View();    System.out.println(인스턴스1);  // View@2f92e0f4
        View 인스턴스2 = new View();    System.out.println(인스턴스2);  // View@28a418fc

        // 클래스명.getInstance
        Controller 인스턴스3 = Controller.getInstance();    System.out.println(인스턴스3);  // Controller@1f32e575
        Controller 인스턴스4 = Controller.getInstance();    System.out.println(인스턴스4);  // Controller@1f32e575

    }
}

// 일반 객체 클래스
class View{ }

// 싱글톤 클래스
class Controller{ 
    // 1. 생성자를 private 한다  ( 다른 클래스에서 생성자 사용금지 )
    private Controller(){};

    // 2. 클래스 내부에 단 하나의 인스턴스를 생성한다
    private static final Controller instance = new Controller();

    // 3. 클래스 내부에 인스턴스를 간접 사용(공유) 하도록 getter 만든다
    public static Controller getInstance(){ return instance; }
}


/*
    [ MVC 패턴 ]
        
        1. 정의 :

            - 소프트웨어 개발에서 사용되는 디자인 패턴으로 세가지 주요 역할 분리하여 코드의 모듈화(조각) 한다.
        
        2. 목적 :

            - 프로젝트 협업 간에 코드와 파일들을 MVC 패턴에 따라 구성하여 효율성을 높인다.

        3. 장점 :

            - 유지보수 , 모듈화 , 단일책임기능( SRP : 단일 책임 원칙 - 객체지향 5대 원칙(SOLID) ) 등
        
        4. 단점 : 

            - 분리함에 따라 관리 복잡도가 높다.

        5. 예시 :

            - 1인 식당 사장님이 혼자서 서빙하고 요리하고 재료를 준비한다.

            - 식당이 커졌을 때, 서빙 직원 & 요리하는 직원 & 재료 준비하는 직원 이 생김.
            
            - 직원이 있으면 단일 책임 원칙 이 생김.

        6. 사용처 :

            - 웹/앱 백엔드 사용한다.

        7. 레이어/계층

            - VIEW          : 입출력 담당  ,  HTML CSS JSS REACT FLUTTER
            
            - CONTROLLER    : model 과 view 사이의 제어/로직/유효성검사/전달 담당  ,  JAVA PYTHON NODE.JS

            - MODEL         : 데이터관리 담당  ,  JAVA PYTHON NODE.JS

        8. 이동객체

            - DTO           : 서로 다른 레이어/계층 간에 데이터 객체  ,  setter and getter 지원  ,  읽고 쓰기 지원
            
            - VO            : 서로 다른 레이어/계층 간에 데이터 객체  ,  getter 지원             ,  읽기 지원

        9. 흐름

            - 게시물 작성  :  view  --[DTO/VO]--> controller  --[DTO/VO]-->  DAO/REPOSITORY  <-->  데이터베이스(SQL)
            
            - 게시물 조회  :  view  <--[DTO/VO]-- controller  <--[DTO/VO]--  DAO/REPOSITORY  <-->  데이터베이스(SQL)

        10. 패키지 구성

            - 프로젝트 폴더

                - controller 폴더

                - view 폴더

                - model 폴더

                    - dao 폴더

                    - dto 폴더
                
                - AppStart 클래스 (프로젝트 최상위에 존재)

*/