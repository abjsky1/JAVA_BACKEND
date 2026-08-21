package day033_260821_JAVA;

import java.lang.reflect.WildcardType;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
    /*
        [1] 스택(Stack) : 후입선출 ( LIFO : 마지막 삽입된 자료부터 삭제 )

            - Stack 클래스 이용한 구현

    */
        
            Stack<String> stack = new Stack<>();

            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.push("4");
            stack.push("5");

    //  *.  ! : 부정문 , !변수명.isEmpty() , 비어있으면 반복문 종료

    //      입력 순서 : 1-2-3-4-5  ,  삭제 순서 : 5-4-3-2-1

            while ( !stack.isEmpty() ) { System.out.println( stack.pop() ); }
            

    /*
        [2] 큐(Queue) : 선입선출 ( FIFO : 가장 먼저 삽입된 자료부터 삭제 )

            - LinkedList 클래스 이용한 구현
    */

            Queue<String> queue = new LinkedList<>();
            queue.offer("1");
            queue.offer("2");
            queue.offer("3");
            queue.offer("4");
            queue.offer("5");

    //  *.  ! : 부정문 , !변수명.isEmpty() , 비어있으면 반복문 종료
    
    //      입력 순서 : 1-2-3-4-5  ,  삭제 순서 : 5-4-3-2-1

            while ( !queue.isEmpty() ) { System.out.println( queue.poll() ); }



    }

}
