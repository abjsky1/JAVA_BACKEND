package day027_260812_JAVA;

/*
    기본타입(리터럴) : (8) byte short int long float double char boolean
    참조타입(객체) : []배열 클래스(String Dto Scanner 등) 인터페이스
*/

// 1. 인터페이스 만들기 , interface 인터페이스명
// 2. 인터페이스 주요멤버 : 상수, 추상메소드
// 3. 추상메소드 구현할 클래스 필요 <구현객체>


interface ExamInterFace{ 
    int a = 10;     // 상수 , 인터페이스에서는 public static final 생략해도 상수이다.
    public static final int b = 20;     // 상수
    // 생성자 없음. 즉, new 없음. --> 인스턴스 불가능. 목적 : 여러 인스턴스 호환/관리
    // 추상메소드 : 선언부만 존재하고 { } 구현부가 없는 메소드 
    void method1(int x);
    public abstract int method2(int x , int y);
}

// 해당 클래스가 지정한 인터페이스 구현
class ExamClass implements ExamInterFace{
    // 상속은 오버라이딩 선택
    // 구현은 오버라이딩 필수
    @override public void method1(int x){}
    @override public int method2(int x, int y){return x+y;}

}


public class JAVA_exam1 {

    public static void main(String[] args) {
        
        // [1] 인터페이스
        // ExamInterFace ei = new ExamInterFace();  // 생성자 없어서 오류

        // [2] implements 구현한 객체
        ExamClass ec = new ExamClass();
        ec.method1(10);         // 가능
        ec.method2(10, 20);  // 가능

        // [3] 다형성 : 업캐스팅
        ExamInterFace ei = new ExamClass();
        // 인터페이스 타입 이지만 메소드는 오버라이딩이 우선
        ei.method1(10);         // 가능
        ei.method2(10, 20);  // 가능












    }

}
