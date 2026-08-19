package day031_260819_JAVA;

import java.util.Arrays;

public class JAVA_exam3 {

    public static void main(String[] args) {
        
//      [1] String 클래스

//      1. 문자열은 배열이다.

            char str1 = '김';  // char 타입( ' ' )은 1글자만 가능 !
        
            char[ ] str2 = { '김' , '길' , '리' };  // char 타입의 배열

            String str3 = "김길리"; // String 클래스는 배열의 멤버변수 가짐

//      2. 문자 변환 , 아스키코드( 일부특수문자 + 영문 ) + 유니코드( 여러개 언어 지원 )

            char str4 = 65;
            System.out.println(str4); // A

            char[] str5 = { 74 , 65 , 86 , 65 }; 
            System.out.println(str5); // JAVA

            char str6 = '김';
            System.out.println(str6);       // 김
            System.out.println((int)str6);  // 44608

//          정수  ==[ char(규칙) ]==>  문자  ==[ 배열 ]==>  문자열

//      3. 문자열 비교

            System.out.println("김길리" == "김길리");  // true
            System.out.println( new String("김길리") == "김길리" );  // false
            System.out.println( new String("김길리").equals("김길리"));  // true

//      4. 문자열A.concat(문자열B) , 문자열 연결 , 연결된 새로운 문자열 반환 => 주소값이 새로 생김.

            String str7 = "자바";
            String str8 = "프로그래밍";
            System.out.println(str7.concat(str8));  // 자바프로그래밍
            System.out.println(str7 + str8);  // 자바프로그래밍

//      5. StringBuilder , append() , 문자열(리터럴/상수)은 불변(수정금지) , 빌더 주소값 1개 지정하여 새로운 문자열 연결

            StringBuilder builder = new StringBuilder();
            builder.append(str7);
            builder.append(str8);
            System.out.println( builder );  // 자바프로그래밍

//      6. .chatAt( 인덱스 )

            String str9 = "자바프로그래밍";
            System.out.println(str9.charAt(2));  // 자-0 , 바-1 , 프-2 , 로-3 , 그-4 , 래-5 , 밍-6

//      7. .length() : 문자열 안에 문자 개수 반환
        
            System.out.println(str9.length());

//      8. .replace( 기존문자 , 새로운문자 ) : 만약 기존 문자가 존재하면 새로운 문자로 치환하여 반환

            System.out.println( str9.replace("자바", "JAVA"));

//      9. .substring( 시작인덱스 , [끝인덱스] ) , 시작인덱스 부터 끝인덱스 전까지 문자열 추출

            String str10 = "000101-1234567";
            System.out.println(str10.substring(7));  // 7 ~ 끝까지 추출
            System.out.println(str10.substring(0,6));  // 0 ~ 5 (= 6-1) 인덱스 추출

//      10. .split( 기준 문자 ) , 기준 문자 기준으로 문자열 문해하여 배열 반환

            System.out.println(str10.split("-"));  // [Ljava.lang.String;@4f023edb
            String[] strAry1 = str10.split("-");  // [0] 000101 , [1] 1234567
            System.out.println(strAry1[0]);
            System.out.println(strAry1[1]);

//      11. .indexOf( 찾을 문자 ) , 만약 찾을 문자가 존재하면 인덱스 반환, 없으면 -1 반환
//          .contains( 찾을 문자 ) , 만약 찾을 문자가 존재하면 true 반환, 없으면 false 반환

            System.out.println("자바 프로그래밍 언어".indexOf("프로"));  // 3 
            System.out.println("자바 프로그래밍 언어".contains("프로"));  // true

//      12. .getBytes() , 문자열 안에 문자들을 바이트 배열로 반환 , *파일처리/네트워크*

            byte[] strAry2 = "ABC".getBytes();
            System.out.println(Arrays.toString(strAry2));  // "ABC" --> [65 , 66 , 67]
            System.out.println(new String(strAry2));

//      
// 
// 
// 
// 
// 
// 
// 
//         
    }

}
