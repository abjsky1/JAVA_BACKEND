package day032_260820_JAVA;

import java.util.ArrayList;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*
            제네릭 타입

                정의 : 여러가지 타입에서 동작할 수 있도록 만든 타입
                목적 : 클래스 정의할 때 타입 정하지 않고 사용자(개발자)가 사용할 때 타입 정한다.

                사용법 : 

                    1. 제네리같입은 영 대문자로 한다.
                    2. 여러개 가능하다
                    3. 기본타입 불가능하므로 래퍼클래스 사용한다.
        */
        
            //  1] 클래스 안에 객체 멤버변수 동일한 타입으로 값 대입

                    Box1 box1 = new Box1();
                    box1.content = "안녕하세요";

            //  2] String 대신에 int 타입으로 값 대입 하고 싶을 때, 새로운 클래스를 만든다.

                    Box2 box2 = new Box2();
                    box2.content = 10;  // 동일한 멤버변수 간에 서로 다른 타입 불가능한가?! -> 제네릭

            //  3] 해결방안 : 제니릭 이용한 동일한 멤버변수 간에 서로 다른 타입 사용 가능.

            //      class Box3<제네릭타입>{ 제네릭타입 content; }  :::  클래스 생성

                    Box3< String > box3 = new Box3<String>();   
                    box3.content = "안녕하세요";
                    Box3< Integer > box33 = new Box3();  // 생성자 뒤에 제네릭은 생략 가능
                    box33.content = 33;

            //      제네릭 타입 대신 Object 타입 사용 시 타입변환 필요

                    ArrayList<String> list1 = new ArrayList<>();  // <제네릭> String 타입으로 배열 선언
                    String[] list2 = new String[10];

            //  4] 두개 이상의 제네릭 타입 가능

                    Box4<String, Integer> box4 = new Box4();
                    box4.value1 = "안녕하세요";
                    box4.value2 = 10;

            //  5] 중첨 가능

                    Box4< String , ArrayList<Integer> > box44 = new Box4();
                    box44.value1 = "안녕하세요";
                    box44.value2 = new ArrayList<Integer>();

            //  *] 활용처 : 컬렉션프레임워크( ArrayList )

            //  6] 메소드 제네릭 가능 ( 메소드의 매개변수와 반환 타입 또한 제네릭 가능 )

                    Box3<String> box333 = Util.boxing("사과");
                    System.out.println(box333.content);

            //  7] 상속 관계 제약 , < 타입 extends 상위타입 >

            //      Box5<String> box5 = new Box5();     // String 타입은 Number 타입의 자식이 아니라서 불가능.
                    Box5<Integer> box55 = new Box5();   // Integer 타입은 Number 타입의 자식이라서 가능. <오버라이딩>

                    

    }
}

class Box1{ String content; } // 박스1 클래스 안에 문자열 content 대입 가능.

class Box2{ int content;} // 박수2 클래스 안에 정수형 content 대입 가능.

class Box3<제네릭타입>{ 제네릭타입 content; }

class Box4< T , E >{ T value1 ; E value2 ; }

class Util{ // 반환타입도 제네릭이 됨. 매개변수도 제네릭이 됨.
    public static <T> Box3<T> boxing(T 매개변수){  // 메소드의 타입들을 제네릭 타입 가능
        Box3<T> box = new Box3();
        box.content = 매개변수;
        return box;
    }
}

class Box5< T extends Number >{ T content; }  // T(제네릭)타입에는 Number 자식타입만 가능하도록 제약 가능