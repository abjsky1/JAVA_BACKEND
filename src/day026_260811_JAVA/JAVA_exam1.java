package day026_260811_JAVA;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        동물 animal1 = new 동물();      // 동물생성자만 실행
        animal1.name = "강아지";        // 멤버변수 접근
        animal1.show();                // 메소드 실행

        
        조류 bird1 = new 조류();        // 조류 생성자 실행 + 동물 생성자 실행
        bird1.name = "비둘기";          // 동물 멤버변수 접근 가능
        bird1.show();                  // 동물 메소드 실행 가능

        // 즉, 하위/자식 클래스의 객체는 상위/부모 클래스의 멤버(변수/메소드) 사용 가능

        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";
        sparrow1.show();

        닭 chicken1 = new 닭();         // 닭 생성자 실행, 조류 생성자 실행, 동물 생성자 실행
        chicken1.name = "닭";           
        chicken1.show();

        // 즉, 상위 클래스의 객체가 먼저 생성되고 하위 클래스의 객체가 생성된다.

        // 장점  :  재사용, 유지보수, 계층적 표현, 다형성 구현

        
        // [ ******** ] 다형성 [ ******** ]
        
        // 하나의 자료가 다양한 형(형식/모양/형태/구분) 성질

        // 참새 타입에서 조류 타입으로 변환 가능
        // 이유 : 상속관계, 참새인스턴스가 생성될 때 조류 인스턴스와 동물 인스턴스까지 생성되기때문
        조류 bird2 = sparrow1;

        // 참새 타입에서 동물 타입으로 변환 가능
        동물 animal2 = sparrow1;

        // 주의 : 동물타입에서 참새 타입으로 변경 불가능
        참새 sparrow2 = (참새)animal2;  // 강제 타입 변환  ,  다운캐스팅(내려가기)

        // 동물 타입에서 참새타입으로 할 때 주의할 점
        // 변환할 자료가 변환할 타입을 포함하는지
        참새 sparrow3 = (참새)animal1;  // 오류 생김













    }
}


// 동물이라는 부모 class 만듦
class 동물{

    // 멤버변수
    String name;  

    // 생성자
    동물(){System.out.println("동물 탄생");}       

    // 메소드
    void show(){
        System.out.println("동물입니다.");
    }

}

// class 하위클래스명 extends 상위클래스명{ }
class 조류 extends 동물{ }

// class 하위클래스명 extends 상위클래스명{ }
class 참새 extends 조류{ }

// class 하위클래스명 extends 상위클래스명{ }
class 닭 extends 조류{ }


/*
           가계부
             |
            동물
             |
            조류
           /    \
          닭    참새


*/