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