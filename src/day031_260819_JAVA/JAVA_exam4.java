package day031_260819_JAVA;

import java.util.Random;
import java.util.UUID;

public class JAVA_exam4 {

    public static void main(String[] args) {
        
//      [1] 난수 클래스 , Random 

//          - 활용처 : 인증번호, 추첨 등

//      1. 랜덤 객체

            Random random = new Random();
        
//      2. 랜덤 생성 , .nextXXX

            int value1 = random.nextInt();
            System.out.println(value1);
            int value2 = random.nextInt(10);  // 0~9 사이 난수
            System.out.println(value2);
            int value3 = random.nextInt(10)+1;  // 1~10 사이 난수
            System.out.println(value3);
            boolean value4 = random.nextBoolean();  // true/false 난수
            System.out.println(value4);

//      [2] UUID , 범용 고유 식별자 , 절대 중복 없는 난수 생성

//          - new 안 쓰는 이유 : static 정적 메소드

//          - 활용처 : 회원번호/파일식별 등

            String uuid = UUID.randomUUID().toString();  
            System.out.println(uuid);  // b626e6f0-cf2f-436d-b32f-fead48a8f03d

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
//  
//  
//  
//          
    }
}
