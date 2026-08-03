package day020_260803_JAVA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JAVA_exam2 {

    public static void main(String[] args) {
        

        /*
        
            JAVA 배열 : *동일한타입*의 여러 자료들을 순서(인덱스)대로 저장하는 *타입*

            선언 :
                - 타입[ ] 변수명 = new 타입명[ 총개수 ];            let 변수명 = [ ]
                - 타입[ ] 변수명 = { 초기값 , 초기값 , 초기값 };     let 변수명 = [ 초기값, 초기값, 초기값 ]
            
            특징 : 
                1) 동일한 타입끼리만 가능
                2) 고정(정적)길이
                3) 요소의 초기값 (자동으로)존재  ,  정수 : 0  ,  실수 : 0.0  ,  논리 : false  ,  객체 : null

            인덱스 : 요소(자료)들이 저장되는 순서 번호 , 0번 시작

        */

        // [1] 배열의 선언
        
        // int 형 3개를 저장할 수 있는 배열 선언(생성)
        int[ ] arry1 = new int[3];  
        System.out.println(arry1);  // I@372f7a8d 배열(객체)의 메모리 주소값 - 배열은 주소(값) 1개 , 배열의 요소값 확인 불가능
        System.out.println( Arrays.toString(arry1) );   // [0, 0, 0]  ,  배열 안에 요소들의 자동 초기화
        
        String[ ] arry2 = { "김길리" , "람보르길리" , "길리슈트" };     // String 형 3개 초기화한 배열 선언

        System.out.println( arry1[0] );
        System.out.println( arry2[0] );

        System.out.println( arry1.length );
        System.out.println( arry2.length );

        // 선언 이후에 길이(요소) 추가(push) or 삭제(splice) 안 됨
        // 오류 : arry2[3] = "가나디";
        // 오류 : arry2.push("가나디");
        
        // 변경은 가능
        System.out.println( Arrays.toString(arry1) );
        arry1[0] = 2;
        System.out.println( Arrays.toString(arry1) );

        
        /*
            배열 메모리 : 메모리는 1byte 단위로 저장
                자바 int 1개 선언           ->  4byte   ->   [ ] [ ] [ ] [ ] 4개의 메모리가 컴퓨터에 할당
                자바 new int[ 3 ] 선언      ->  4bye*3  ->   [ ] [ ] [ ] [ ] , [ ] [ ] [ ] [ ] , [ ] [ ] [ ] [ ]  12개 할당
                byte 단위별 주소값 정해진다.
                [ 101 ] [ 102 ] [ 103 ] [ 104 ] , [ 201 ] [ 202 ] [ 203 ] [ 204 ] , [ 301 ] [ 302 ] [ 303 ] [ 304 ] 
                즉, 배열은 요소내 모든 인덱스 주소값 참조하지 않고 *가장 앞*에 있는 주소값 1개 [101] 만 참조한다.

                배열명[ 0 ] = 101
                배열명[ 1 ] = 타입크기만큼 이동 = 201

            
        */















    }
}
