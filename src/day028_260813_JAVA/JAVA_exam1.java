package day028_260813_JAVA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*
            예외처리
                
                - 에러를 고치는 게 아니고, 흐름 제어 하는 것

                - try{예외발생코드}catch( 예외클래스명 변수명 ){ 처리할코드 }

            [1] 일반예외 : 빨간줄 O

                실행(컴파일)하기 전에 예외가 발생할 수 있는 코드에 대해 미리 예외

            [2] 실행예외 : 빨간줄 X
            
                실행( 컴파일 ) 후 예외 발생 *경험 중요* 예측하거나 유지보수
            
            [3] 다중 catch : try 에서 다양한 예외들을 다양하게 흐름 제어, catch 는 1번만 진행

            [4] finally : 예외 발생 여부와 상관 없이 무조건 실행 구역 , 외부 프로그램과 연동 종료

        */

        // 동적으로 존재하는 클래스 로드(읽어오기)
        // Class.forName("찾을 클래스");
        
    //  Class.forName("String");            error
    //  Class.forName("java.lang.String");    O

    //  (1-1) ClassNotFoundException : 클래스를 찾을 수 없다.  

        try{
            Class.forName("String");
        }catch(ClassNotFoundException e){
            System.out.println("존재하지 않는 클래스입니다." + e);
        }

        
    //  Thread.sleep(1000);

    //  (1-2) InterruptedException : 스레드에 문제가 발생하면
        try{
            Thread.sleep(1000);  // 밀리초만큼 일시정지.  스레드란? 컴파일(번역)
        }catch( InterruptedException e ){ // 예외 발생하면 처리되는 코드,  e : 변수이면서 예외정보 담는 객체
            System.out.println("인터럽트 문제 발생" + e);
        }
        
    
    //  (2-1) 

    //  NullPointerException : 참조가 없는데 참조하는 경우

    //  String str1 = null;  // null 이란   참조 값이 없다. 
    //  System.out.println(str1.length());  // 빨간 줄 안 뜨는데 실행하면 오류 뜸.

        try{
            String str1 = null;
            System.out.println(str1.length());
        }catch( NullPointerException 변수 ){
            System.out.println( 변수 );
        }


    //  (2-2)
    
    //  NumberFormatException : 정수타입으로 변환이 불가능한 경우

    //  String str2 = "100";    Integer.parseInt(str2);
    //  String str3 = "100a";   Integer.parseInt(str3);

        try{
            String str2 = "100";    Integer.parseInt(str2);
            String str3 = "100a";   Integer.parseInt(str3);
        }catch( NumberFormatException 변수 ){
            System.out.println( 변수 );
        }


        System.out.println("안녕하세요");


    //  (2-3)

    //  int[] 배열 = {10 , 25};
    //  System.out.println( 배열[5] );  // 존재하지 않는 인덱스 호출하면 error

    //  ArrayIndexOutOfBoundsException : 배열 안에 인덱스 범위를 벗어나는 경우
        
        try{
            int[] 배열 = {10 , 25};
            System.out.println( 배열[5] );
        }catch( ArrayIndexOutOfBoundsException 변수 ){
            System.out.println( 변수 );
        }
        

    //  모든 걸 포함할 수 있는 것이 Exception (상위)클래스

    //  catch( Exception 변수 )



    //  다중 캐치 가능

    //  - 주의 : catch 는 한 번만 진행 !

        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("정수 입력");
            int ch = scan.nextInt();
            Integer.parseInt("ABC");
        }catch(InputMismatchException e ){
            System.out.println("정수만 입력하세요" + e);
        }catch( NumberFormatException e ){
            System.out.println("타입 변환 오류" + e);
        }catch( Exception e ){
            // 다중 catch 에서 마지막에 (상위)클래스 Exception 사용하여 그외 처리한다.
            System.out.println("알 수 없는 오류 발생" + e);
        }

        
    //  finally : 예외 발생 여부와 상관 없이 무조건 실행 구역

    }
}
