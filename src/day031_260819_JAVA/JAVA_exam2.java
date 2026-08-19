package day031_260819_JAVA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
//      [1] 래퍼 클래스 : 기본타입 --> 참조타입 표현 , 참조타입 상태/기능 갖는다.

//          - 즉, 기본타입은 기능이 없으니 참조타입으로 변환해서 기능을 사용할 수 있다.

            int value1 = 100;        // System.out.println(value1.toString());
            Integer value2 = 100;       System.out.println(value2.toString());

//      1. 언박싱과 오토박싱

            int value3 = value2;        //   Integer(참조)  -->     int(기본) 변환     < 언박싱 >
            Integer value4 = value1;    //     int(기본)    -->   Integer(참조) 변환   < 오토박싱 >

//          DTO : 포장(래퍼), 정보 많기때문

//      2. 타입변환(csv, excel, api, python, json, xml 등)

//          문자열 ==> 기본타입 반환

//          - XXXX.parseXXX("문자열")

//          - 목적 : 외부 자료들을 자바 언어로 바꾸기

            int value5 = Integer.parseInt("100");  // "100" ==> 100 , 스프링에서는 자동

            double value6 = Double.parseDouble("3.14");  // "3.14" ==> 3.14

            boolean value7 = Boolean.parseBoolean("true");  // "true" ==> true

//          기본타입 ==> 문자열 반환
            
//          - 목적 : 자바 언어를 외부 자료들로 사용할 때

            String s1 = 100+"";  // 100 ==> "100"
            String s2 = String.valueOf(100);  // 100 ==> "100"

//      [2] 날짜/시간 클래스

//          1. 현재 날짜 가져오기

            LocalDate localDate = LocalDate.now();  // new 안 쓰는 이유 = now() 가 static 함수이기 때문
            System.out.println(localDate);

//          2. 현재 시간 가져오기

            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);

//          3. 현재 날짜/시간 가져오기

            LocalDateTime localDateTime1 = LocalDateTime.now();
            System.out.println(localDateTime1);

//          4. 정해진 날짜/시간 객체 생성

//              - LocalDateTime.of(연, 월, 일, 시, 분, 초) : 오버로딩(매개변수에 따라 메소드 여러개)

            LocalDateTime localDateTime2 = LocalDateTime.of(1999, 12, 31, 01, 01, 01);
            System.out.println(localDateTime2);

//          5. 정해진 형식으로 날짜/시간 표현 , DateTimeFormatter.ofPattern()

//              - 패턴 : y = 연도 , M = 월 , d = 일 , H/h = 시 , m = 분 , s = 초
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y년M월d일 h시mm분ss초");
            System.out.println(localDateTime2.format(formatter));

//          6. 날짜 계산 , 날짜/시각객체.plusXXX()

            LocalDateTime result1 = localDateTime2.plusDays(20);
            System.out.println(result1);
            LocalDateTime result2 = localDateTime2.minusDays(20);
            System.out.println(result2);

//          7. 특정한 날짜/시간 추출 , .getXXX()

            System.out.println(localDateTime2.getYear());
            System.out.println(localDateTime2.getMonth());      // DECEMBER
            System.out.println(localDateTime2.getMonthValue()); // 12
            System.out.println(localDateTime2.getDayOfMonth()); // 31
            System.out.println(localDateTime2.getDayOfYear());  // 365
            System.out.println(localDateTime2.getHour());
            System.out.println(localDateTime2.getMinute());
            System.out.println(localDateTime2.getSecond());

//  
//  
//  
//  
//  
//  
//          
//  
//  
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
