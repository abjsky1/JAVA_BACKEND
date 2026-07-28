package day016_260728_JAVA;     // 클래스가 속한 폴더명/패키지

public class JAVA_exam2 {       // 클래스 시작

    public static void main(String[] args) {    // 메인함수 시작
     
        // [2] 리터럴 : 상수 , 미리 상수로 구성한 자료들
        // 3 , 'a' , true
        System.out.println(3);
        System.out.println(3.14);
        System.out.println('a');    // '작은따옴표' : 문자(한글자)
        System.out.println("xyz");  // "큰따옴표"   : 문자열(여러글자)
        System.out.println(true);

        // [3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
        // * 효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
        // PYTHON/JS  : 동적(자동으로)타입
        //  C/JAVA    : 정적(직접)타입
        
        // 정수
        // 1) boolean : true or false 저장하는 타입  ,  1byte 사용 (1bit -> 8bit -> 1btye)
        boolean bool1 = true;  // let/const --> boolean
        System.out.println(bool1);

        // 2) char : '' 작은따옴표로 감싼 문자 1개 저장하는 타입 , 유니코드(코드<-->자연어)
        char ch1 = 'A';  // 영문 = 2byte 사용
        char ch2 = '안'; // 한글 = 3byte 사용
        System.out.println(ch1);
        System.out.println(ch2);

        // 3) String : "" 큰따옴표로 감싼 문자 N개 저장하는 타입 , N * 2 byte , 객체(문자열)
        String str1 = "ABC";
        String str2 = "HIHELLO";
        System.out.println(str1);
        System.out.println(str2); 

        // 4) byte : -128 ~ 0 ~ 127 까지 저장하는 타입  ,  1byte
        byte b1 = 100;
        System.out.println(b1);

        // 5) short : +-3만정도  ,  2byte
        short sh1 = 30000;
        System.out.println(sh1);

        // 6) int : +-21억정도  ,  4byte  ,  **** (정수) 리터럴 타입 ****
        int i1 = 2147483647;
        System.out.println(i1);

        // 7) long : +=21억이상  ,  8byte
        long l1 = 9223372036854775807L;
        System.out.println(l1);

        // 실수 : 부동소수점 이용한 소수점 표현은 오차가 있으므로 정교한 소수점/계산 라이브러리 이용
        // 8) float : 소수점 8자리 표현 가능  ,  4byte  ,  *키보드로 입력한 실수는 double 이므로 F/f 마지막에 입력*
        float f1 = 0.12345678901234567890F;
        float f2 = 0.99999999999999999999F;
        System.out.println(f1);
        System.out.println(f2);

        // 9) double : 소수점 17자리까지 표현 가능 ,  8byte  ,  *(실수)리터럴 타입*
        double d1 = 0.12345678901234567890F;
        double d2 = 0.99999999999999999999F;
        System.out.println(d1);
        System.out.println(d2);


        // 8가지 타입 ( 기본타입 , 리터럴 저장 )
        // 그 외 타입 ( 참조타입 , 객체/배열/인터페이스 등 ) = String





    }   // 메인함수 끝

}   // 클래스 끝
