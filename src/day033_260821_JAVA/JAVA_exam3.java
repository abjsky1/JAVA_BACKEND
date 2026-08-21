package day033_260821_JAVA;

import java.awt.*;  // java 안에 UI 제공 = awt / fx

public class JAVA_exam3 {

    public static void main(String[] args) {
    
    /*
        프로그램 : 실행 가능한 코드들의 집합

        프로세스 : 실행 중인 프로그램 

        멀티태스팅 : 두 가지 이상의 작업을 동시에 처리

        멀티프로세스 : 운영체제가 여러개 프로세스를 동시에 실행하는 구조

        멀티스레드 : 하나의 프로세스 안에 여러개 흐름 작업 실행하는 구조  *병렬처리
        
        스레드 : 하나의 프로세스 안에 최소 작업 단위 , 실행 흐름의 단위

        CPU 가 ( <--[운영체제]--> ) 프로세스 안에 스레드를 통해 코드를 순차적으로 처리함

        main 함수 : 스레드 환경 main 메소드가 제공한다.    JAVA-O , C-O , PYTHON-O , JS(html)-X  

        멀티스레드 구현 : 

            1. Runnable 익명구현체

                - new Runnable(){ run(); };

            2. Runnable 구현체  *권장*

                - class 클래스명 impliments Runnable{ run(); }

            3. Thread 상속 

                - class 클래스 extends Thread{ run(); }

        주요 메소드 :

            1. run() : 

                - 추상메소드 이면서 작업(멀티) 스레드가 처리할 코드의 시작점

            2. start() :

                - 구현된 run() 메소드 실행하는 메소드 , 주의 : Thread 클래스 제공
        
        * 활용처 :
                
            1. 톰캣(웹서버/SPRING) : 다수의 유저(클라이언트)가 1개의 서버(PC)에 요청 시 병렬처리 함
            
                - 동시 다발적으로 1개의 서버에 로그인 시도 or 채팅 요청 등 여러가지 할 때 병렬처리 함.

                - (SPRING) : 멀티스레드 기본제공 (대규모 프로젝트용)
                
                - (NODE.JS) : 싱글스레드 (간단 프로젝트)
    */    

    //  [1] 단일(싱글) 스레드(thread) : (컴파일된) 코드들을 실행 흐름 단위 1개일 때
    
    //      - main 메소드가 main 스레드 제공한다. ( 프로그램 당 1개 이상 존재 )

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            toolkit.beep();  // '띵' 소리 발생하는 함수

            for( int i = 1 ; i <= 5 ; i++ ){
                toolkit.beep();
                try{ Thread.sleep( 1000 ); /* 현재 스레드(코드 실행하는 흐름 단위) */ }
                catch( Exception e ){ System.out.println(e); }
            }

            for( int i = 1 ; i <= 5 ; i++ ){
                System.out.println("띵");
                try{ Thread.sleep( 1000 ); /* 현재 스레드(코드 실행하는 흐름 단위) */ }
                catch( Exception e ){ System.out.println(e); }
            }


    //  권장
    //  [2] 멀티스레드 방법 1 : 익명구현체, new 인터페이스타입(){ 오버라이딩 };
            
    //      Runnable runnable = new Runnable(){ };

            Runnable runnable = new Runnable(){ 

    //          새로운 스레드가 처리할 메소드 = run()  오버라이딩(재정의)

                @Override
                public void run() {

                    // TODO Auto-generated method stub
                    for(int i = 1 ; i <= 5 ; i++){ 

                        System.out.println("1번 새로운 스레드 : " + i ); 
                    
                        try{ Thread.sleep( 1000 ); /* 현재 스레드(코드 실행하는 흐름 단위) */ }
                        catch( Exception e ){ System.out.println(e); }
                    
                    }
                    
                }

            };  // 익명 구현체 구현 끝

            Thread thread1 = new Thread( runnable );  // new Thread( 익명구현체 );
            thread1.start();  // 새로운 스레드가 run() 메소드 호출 = start() , main / task1    (총 2개)


    //  [3] 멀티스레드 방법 2 : 구현체

    //      - runnable 에는 start() 가 없기 때문에 Thread 에 넣어서 진행  ==>  new Thread( 작업스레드2 );

            작업스레드2 작업스레드2 = new 작업스레드2();
            Thread thread2 = new Thread( 작업스레드2 );
            thread2.start();  // main / task1 / task2    (총 3개)


    //  [4] 멀티스레드 방법 3 : 상속

            Thread thread3 = new 작업스레드3();
            thread3.start();
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


class 작업스레드2 implements Runnable{

    @Override
    public void run() {

        for(int i = 1 ; i <= 5 ; i++){

            System.out.println("2번 새로운 스레드 : " + i);

            try{ Thread.sleep( 1000 ); /* 현재 스레드(코드 실행하는 흐름 단위) */ }
            catch( Exception e ){ System.out.println(e); }

        }

    }

}


class 작업스레드3 extends Thread{

    @Override
    public void run() {
        
        for(int i = 1 ; i <= 5 ; i++){

            System.out.println("3번 새로운 스레드 : " + i);

            try{ Thread.sleep( 1000 ); /* 현재 스레드(코드 실행하는 흐름 단위) */ }
            catch( Exception e ){ System.out.println(e); }

        super.run();

        }
    
    }

}