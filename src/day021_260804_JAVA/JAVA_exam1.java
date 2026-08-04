package day021_260804_JAVA;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*

            객체  :  상태 or 행위를 정의(추상)하는 것

                주체(행하는 대상)(개발자) vs 객체(미치는 대상)(프로그램내 모든 대상)

                상태(값/자료) , 행위(함수/메소드)


            객체지향 프로그래밍  :  개발자(주체)가 컴퓨터내 객체(대상) 만들기


            객체 정의(생성)  :  클래스(설계도) 기반으로 객체를 정의한다.


            클래스  :  객체(추상)의 상태와 행위(함수)를 코드로 정의하는 곳

                설계클래스 (main 없음)  :  객체정의용도

                메인클래스 (main 있음)  :  실행목적용도

            
            인스턴스  :  클래스로 (객체가) 정의된 기반으로 메모리 할당 (물리개념)

                new 연산자 이용


            *****  8가지 기본타입  :  boolean char byte short int long float double  *****

            *****  8가지 외 커스텀/정의 타입  :  클래스를 이용한 새로운 타입 만들기 / 참조 타입


        */

        

        /*
            객체 만들기

            클래스 생성

                1.  .java 새롭게 만들기
                2.  현재 파일 class{} 밖에서 class 클래스명 { 상태; 행위; }

            클래스 { } 안에서 상태(멤버변수)와 행위(메소드) 코드 작성

            실행문(MAIN 함수)에서 객체 생성  :  타입명 변수명 = new 생성자( 인수, 인수 );

                class 타입도 참조 타입

                class 타입은 첫글자 대문자 , 기본타입 소문자 , 변수명 소문자시작

                new 연산자  :  클래스 기반으로 (heap)메모리 할당

                Student 생성자  :  클래스명과 동일하며 메소드/함수 비슷한 역할

        */

            Student s1 = new Student( );            // 객체 생성 후 변수에 저장

            // 객체 사용(참조)  ,  .(접근/도트/이동)연산자 이동하여 멤버 접근
            System.out.println( s1 );               // 객체를 저장하고 있는 변수명 작성 , day
            System.out.println( s1.studentName );   // 객체에 저장하고 있는 변수명.멤버변수명 , null
        
            // 객체내 멤버변수 값 수정  ,  객체변수명.멤버변수명 = 새로운값
            s1.studentName = "김길리";
            s1.studentID = 10;

            System.out.println( s1.studentName );
            System.out.println( s1.studentID );


        //  *] 주의  :  new 연산자 * 1개당 * 1개의 인스턴스 생성
            Student s2 = new Student(); // 인스턴스 생성  Student@28a418fc  동일   101호
            Student s3 = new Student(); // 인스턴스 생성  Student@5305068a        102호 
            Student s4 = s2;            // 인스턴스 참조  Student@28a418fc  동일   101호

            System.out.println(s2); System.out.println(s3); System.out.println(s4);

            s2.studentName = "람보르길리";  // 101호 멤버변수 수정

            System.out.println(s2.studentName); System.out.println(s3.studentName); System.out.println(s4.studentName);

    }

}

class Student{ // '학생' 추상 개념 -> 코드화
            // 멤버변수 (상태)
            int studentID;  // 타입 변수명; 클래스 안에서 선언된 변수 -> 멤버/인스턴스 변수
            String studentName;
        }