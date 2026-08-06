package day022_260805_JAVA;

import java.net.Socket;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        // 클래스 생성시 주의
        // 동일한 패키지(폴더)내 동일한 클래스명은 중복 불가능
        // src(개발자코드.java)   ==>   bin(컴파일/번역코드 .class)
        // 첫글자는 대문자 시작
        // 클래스 1개당 .java 파일 1개 관리 권장 (*디자인패턴*)

        /*
            생성자  :  인스턴스(객체) 생성할 때 사용되는 키워드

            선언하는 방법
                1) 클래스 내부
                2) 클래스명과 동일
                3) 오버로딩 지원 : 동일한 이름으로 여러개 선언 , 조건 

            목적
                1) 빠른 초기화
                2) 객체생성 규칙/유효성검사
                
            종류
                1) 기본생성자 (매개변수 없는 생성자)
                2) 정의생성자 (매개변수 있는 생성자)

        */

        /*
            선언되는 변수 위치에 따라 이름이 다르다
            지역변수 : if / for / func(함수) { } 안에서 선언된 변수
            멤버변수 : 클래스/설계도 { } 안에서 선언되고 객체(인스턴스)내 변수
                    - this : 해당 생성자/메소드 호출한 객체(인스턴스) 가리킴
            매개변수 : 생성자(메소드) 호출하면서 인수값들을 저장하는 변수
        */

        // [1] 기본 생성자로 객체 생성 , new 생성자명()
        Phone p1 = new Phone();
        p1.model = "갤럭시";

        Phone p2 = new Phone( "아이폰", "파랑");

        Phone p3 = new Phone("갤럭시탭", "블랙" , 30000);








    }
}

class Phone{
    // 클래스 가족(멤버들)
    
    // 1. 멤버변수
    String model;
    String color;
    int price;

    // 2. 생성자
    // * 생성자가 1개 없으면 자동으로 기본생성자 생성
    // * 생성자명은 중복이 안 됨
    // * - 오버로딩(매개변수 개수/타입/순서 다르면) 중복 가능
    // * this : 멤버변수 식별용
    // * - 매개변수명과 멤버변수명 같을 경우 멤버변수명 앞에 this 작성
    // * 매개변수와 인자값의 타입/개수 일치 !
    // * 메소드와 다르게 생성자는 반환이 없다. (생성된 객체주소값)
    // * - 함수처럼 생겼지만 return 안 함

    // 자동코딩 : 클래스 내 빈공간 우클릭  =>  소스 액션  =>  constructor  =>  멤버변수 체크  =>  확인

    // 1) 기본생성자 : 매개변수가 없는 생성자
    Phone(){}
    
    // 2) 정의생성자 : 매개변수가 있는 생성자
    Phone( String model , String color // 여기가 매개변수
    ){
    //  this.멤버변수명 = 매개변수명
        this.model = model;  // this.model 에서 model 은 멤버변수
        this.color = color;
    }

    Phone( String model , String color , int 가격 ){
        this.model = model;
        this.color = color;
        price = 가격;
    }

    // 3. 메소드/함수

}





