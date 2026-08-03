package day020_260803_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class JAVA_activity {

    public static void main(String[] args) {
        

        /*--------------------------------------
        현재 배열 [크기: 0]: 비어 있음
        1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료
        메뉴를 선택하세요: 1
        추가할 정수 값을 입력하세요: 10
        >> 10 값이 성공적으로 추가되었습니다.
        ----------------------------------------
        현재 배열 [크기: 1]: [ 10 ]
        1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료
        메뉴를 선택하세요: 1
        추가할 정수 값을 입력하세요: 25
        >> 25 값이 성공적으로 추가되었습니다.
        ----------------------------------------
        현재 배열 [크기: 2]: [ 10, 25 ]
        1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료
        메뉴를 선택하세요: 1
        추가할 정수 값을 입력하세요: 40
        >> 40 값이 성공적으로 추가되었습니다.
        ----------------------------------------
        현재 배열 [크기: 3]: [ 10, 25, 40 ]
        1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료
        메뉴를 선택하세요: 2
        삭제할 인덱스 번호(0 ~ 2)를 입력하세요: 1
        >> 인덱스 [1]의 값 (25)이 삭제되었습니다.
        ----------------------------------------
        현재 배열 [크기: 2]: [ 10, 40 ]
        1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료
        메뉴를 선택하세요: 0
        프로그램을 종료합니다.
        --------------------------------------*/

        Scanner scan = new Scanner(System.in);


        // int[ ] arry1 = new int[3];  
        // String[ ] arry2 = { "김길리" , "람보르길리" , "길리슈트" };


        int [] 배열 = new int[0];
        System.out.println(Arrays.toString(배열));
        

        System.out.println(배열.length);


        for(;;){
            System.out.println("\n현재 배열 [크기: "+배열.length+"]: " + Arrays.toString(배열));
            System.out.println("\n1. 요소 추가 | 2. 인덱스로 삭제 | 0. 종료");
            System.out.println("메뉴를 선택하세요: ");
            int 메뉴선택 = scan.nextInt();

            if (메뉴선택 == 1) {
                System.out.println("추가할 정수 값을 입력하세요: ");
                int push = scan.nextInt();
                int [] 배열추가 = new int[배열.length+1];
                if (배열추가.length == 0) { 배열추가[0] = push; 배열 = 배열추가;}
                else{
                    for(int i = 0 ; i <= 배열추가.length-2 ; i++){
                        배열추가[i] = 배열[i];
                    }
                    배열추가[배열추가.length-1] = push;
                    
                    배열 = 배열추가;
                }
            }

            else if (메뉴선택 == 2) {

                if (배열.length == 0) { System.out.println("배열내 삭제할 요소가 없습니다.");}

                else if (배열.length == 1){System.out.println("index 0을 삭제하시려면 0을 눌러주세요");
                    int 삭제할인덱스 = scan.nextInt();
                    if (삭제할인덱스 == 0) {
                        int [] 배열삭제 = new int[0];
                        
                        배열 = 배열삭제;
                    }
                }
            
                else {System.out.println("삭제할 인덱스 번호(0 ~ " + (배열.length-1) + ")를 입력하세요:");
                int 삭제할인덱스 = scan.nextInt();
                    int [] 배열삭제 = new int[배열.length-1];
                        
/* option 1 */      for(int i = 0 ; i <= 배열.length-2 ; i++){
                        if(삭제할인덱스 <= i){ 배열삭제[i] = 배열[i+1]; } 
                        else{
                            배열삭제[i] = 배열[i];
                        }
                    }

/* option 2 */      /* continue 이용 */
//                  int j = 0;
//                  for(int i = 0 ; i <= 배열.length-2 ; i++){
//                      if(삭제할인덱스 == i) continue;
//                          배열삭제[j] = 배열[i];
//                          j++;
//                  }

                    배열 = 배열삭제;
                }
            }
                
            

            else if (메뉴선택 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            else { System.out.println("메뉴를 다시 선택해 주세요");}
        }




        /*
            [ 1 , 2 , 3 ]
              0   1   2

              0   2
            [ 1 , 3 ]
        */








        
    }
}



