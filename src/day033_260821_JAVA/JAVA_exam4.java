package day033_260821_JAVA;

import java.time.LocalTime;
import java.util.Scanner;

public class JAVA_exam4 {

    public static void main(String[] args) {
        
    //  [1] 시계 구현

    //      1. 새로운 작업(시계) 스레드 실행
    
                시계스레드 runnable1 = new 시계스레드();
                Thread thread1 = new Thread( runnable1 );
                thread1.start();    // 스레드 객체 시작 ,  [ 1. main ] Thread 가 작업(시계) 스레드를 켠다. 


    //  [2] 타이머 구현
        
            타이머스레드 thread2 = null;

    //  [3] 입력 구현

            while (true) {
                System.out.print("1. On , 2. Off : \n");
                Scanner scan = new Scanner(System.in);
                int ch = scan.nextInt();

                if(ch == 1){
                    thread2 = new 타이머스레드();
                    thread2.start();  // 
                }
                if(ch == 2){
                    if( thread2 != null ){ thread2.state = false; }
                }

            }
    // 
    //


    }

}


class 시계스레드 implements Runnable{

    @Override public void run() {

        while (true) { 
            System.out.println( LocalTime.now() );
            try{ Thread.sleep(999); } catch( Exception e ){ System.out.println(e); }
        }
    }

}

class 타이머스레드 extends Thread{

    public boolean state = true;  // 타이머 작동 여부

    @Override
    public void run() {
        
        int time = 0;

        while( this.state ){

            System.out.println(">> 타이머 : " + time + "초");
            try{ Thread.sleep(999); } catch( Exception e ){ System.out.println(e); }

            time++;

        }

    }  // run 끝나면 작업스레드 종료

}