package day016_260728_JAVA;

import java.util.Scanner;

public class JAVA_exam3 {

    public static void main(String[] args) {
        
        // [1] 출력함수
        // System(=class , 컴퓨터).out(출력객체).print(출력함수)
        // 1. System.out.println(); 출력 후 자동 줄바꿈
        System.out.println("HI JAVA1");
        // 2. System.out.print(); 출력 
        System.out.print("HI JAVA2");

        // [2] 이스케이프/제어 문자 : \백슬래시 이용한 특수기능
        // \n줄바꿈 , \t들여쓰기 , \' , \" , \\
        System.out.println("\nHI JAVA3 \tHI JAVA4 \' \" \\ ");

        // [3] System.out.printf( "형식" , "자료" );
        // %c : 문자가 들어갈 자리
        // %s : 문자열이 들어갈 자리
        // %d : 정수가 들어갈 자리
        // %f : 실수가 들어갈 자리
        // %자릿수d : 자릿수만큼 자리 차지하고 , 비어있으면 공백 , 오른쪽 정렬
        // %자릿수d : 자릿수만큼 자리 차지하고 , 비어있으면 공백 , 왼쪽 정렬
        // %0자릿수d : 자릿수만큼 자리 차지하고 , 비어있으면 0으로 채움
        // %전체자릿수.소수자릿수f : 

        System.out.printf("저는 %s 이고 나이는 %d 입니다." , "홍길동", 21);
        System.out.printf("\n저는 %s 이고 나이는 %6d 입니다.\n" , "홍길동", 21);
        System.out.printf("\n저는 %s 이고 나이는 %-6d 입니다.\n" , "홍길동", 21);
        System.out.printf("\n저는 %6s 이고 나이는 %06d 입니다.\n" , "홍길동", 21);
        System.out.printf("\n저는 %-6s 이고 나이는 %1.2f 입니다.\n", "홍길동", 21.12345);

        
        // [3] 입력객체/함수

        // [입력객체]
        // 1. Scanner : SC + 엔터/탭  ,  * 코드파일 상단에 import java.util.Scanner; 자동추가 확인* (해당 폴더에서 클래스 가져온다.)
        // 2. scanner : 관례적으로 변수명은 클래스명의 소문자 (클래스명은 대문자로 시작)
        // 3. = 대입
        // 4. new : 인스턴스화 , 해당 클래스로 객체 만든다는 뜻
        // 5. Scanner( System.in ) : 생성자(클래스명동일)안에 시스템입력(System.in) 객체
        // * 클래스/생성자/인스턴스 수업 전까지는 해당 하는 한줄의 코드 복붙하기

        Scanner scanner  = new Scanner( System.in );

        // [입력함수]
        // 6. scanner.next();       터미널(콘솔)에서 입력받은 자료를 '문자열' 로 반환   
        System.out.println("\n 문자열 입력");
        String str = scanner.next();  // 터미널(콘솔) 창에서 아무거나 입력후 엔터 기준으로 입력 마침
        // *** 문자열타입 변수명 = 문자열반환 , 과일상자 == 과일반환 , 과자상자 == 과자반환
        System.out.printf("\n 입력하신 자료: %s", str);

        // 7. scanner.nextInt();    터미널(콘솔)에서 입력받은 자료를 '정수' 로 반환
        System.out.println("\n 정수 입력");
        int i = scanner.nextInt();   // 터미널(콘솔) 창에서 아무거나 입력후 엔터 기준으로 입력 마침
        System.out.printf("\n 입력받은 자료: %d", i);
    
    
    
    
    
    
    
    
    
    
    }
}
