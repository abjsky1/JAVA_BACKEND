package day031_260819_JAVA;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day025_260810_JAVA.종합예제.model.dto.BoardDto;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*
            기본타입 : byte , short , int , long , float , double , char , boolean
                
                - 리터럴 = 상수

            참조타입 : 클래스(String, Class, ~Dto 등) , 인터페이스(Connection 등) , 배열[] 

                - 참조 = 주소   , 기본타입 여러개를 하나로 만들 때 사용

        */    
//          라이브러리 : 다른 사람들이 만든 클래스/메소드 집합

//          [1] Object 클래스 : 자바의 최상위 클래스 *다형성*
            
            Object o1 = 3; Object o2 = 3.14; Object o3 = "김길리"; Object o4 = true; Object o5 = new int[3];

//          모든 자료들은 Object 타입 변수에 대입 가능

//          1. toString() : 객체의 주소값 반환 함수 , 즉 생략가능

//              - 활용처 : 오버라이딩 이용한 멤버변수 확인

            System.out.println(o1);
            System.out.println(o1.toString());
            System.out.println(o2);
            System.out.println(o2.toString());
            System.out.println(o3);
            System.out.println(o3.toString());
            System.out.println(o4);
            System.out.println(o4.toString());
            System.out.println(o5);
            System.out.println(o5.toString());

//          toString 에 오버라이딩 했을 때            
            Object o6 = new BoardDto();
            System.out.println(o6);
            System.out.println(o6.toString());

//          2. equals() : 객체가 참조하는(주소) 값 비교 함수

//              - 활용처 : 객체비교 , 문자열비교

            Object o7 = new BoardDto();
            System.out.println( o6 == o7 );
            System.out.println(o6.equals(o7));

//          리터럴로 정의한 문자열과 new String 으로 정의한 문자열은 다르다.

            String str1 = "김길리"; 
            String str2 = new String("김길리");

            System.out.println( str1 == "김길리");   // true    리터럴문자열 == 리터럴문자열
            System.out.println( str2 == "김길리");   // false   객체(리터럴문자열) != 리터럴문자열
            System.out.println( str1 == str2 );     // false
            System.out.println(str1.equals(str2));  // true

//          * String - equals :  

//          public boolean equals(Object anObject) {
//              if (this == anObject) {
//                  return true;
//              }
//              return (anObject instanceof String aString)
//                      && (!COMPACT_STRINGS || this.coder == aString.coder)
//                      && StringLatin1.equals(value, aString.value);
//          }

//          3. hashCode() : 객체를 식별하는 값을 정수로 반환 *주소값은 16진수(0~9abcdef) *사람은 10진수(0~9)

//              - 활용처 : 객체 탐지하는 경우에 주소값이 아닌 정수로 된 값(키) 비교하여 속도 향상

            System.out.println(o6.hashCode());      // 531885035
            System.out.println(o7.hashCode());      // 1418481495
            System.out.println(str1.hashCode());    // 44298420
            System.out.println(str2.hashCode());    // 44298420
            System.out.println("김길리".hashCode()); // 44298420


//          [2] Class : 클래스의 정보(멤버변수/메소드/생성자)를 담는 클래스

//          1. getClass() :

//              - 패키지명과 클래스명 확인

            String obj1 = new String();
            Class c1 = obj1.getClass();
            System.out.println( c1 );    // class java.lang.String   

//          2. Class.forName("패키지명.클래스명") , *일반예외 필수*

//              - 리플렉션 : 최초실행(컴파일)할 때, 해당 클래스의 객체 로드/생성하지 않고 실행 도중에 객체 로드/생성한다.

//              - 활용처 : JDBC(프로그램 시작이 아닌 DB 연동시 MySQL 관련 클래스 로드), 스프링 프레임워크( IOC )
            try{ Class.forName( "java.lang.String" ); }
            catch( ClassNotFoundException e ){ System.out.println( e ); }

//          3. getFields() : 클래스 안에 멤버변수 정보 반환

            Field[] fields = c1.getFields();

            for(Field field : fields){System.out.println(field);}

//          4. getConstructors() : 클래스 안에 생성자 정보를 반환

            Constructor[] constructors = c1.getConstructors();
            
            for(Constructor constructor : constructors){System.out.println(constructor);}

//          5. getMethods() : 클래스 안에 메소드 정보 반환

            Method[] methods = c1.getMethods();
            for(Method method : methods){System.out.println(method);}

//
//
//



    }


}
