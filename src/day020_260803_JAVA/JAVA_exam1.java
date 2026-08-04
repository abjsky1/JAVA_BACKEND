package day020_260803_JAVA;

public class JAVA_exam1 {

    public static void main(String[] args) {
        

        // 조건문 : if 
        int 온도 = 5;
        
        // 조건문 : if ( true or false ) { 실행문; }
        if(온도 <= 10){ System.out.println("외투 입는다");}

        // 조건문 : if ( true or false ) { 실행문; 실행문; }
        if(온도 <= 10){ 
            System.out.println("외투 입는다");
            System.out.println("긴바지 입는다");
        }

        // 조건문 : if ( true or false ) { 실행문; } else if ( true or false ) { 실행문; } else { 실행문; }
        if(온도 <= 10){ System.out.println("외투 입는다");}
        else if (온도 <= 20){ System.out.println("외투 입지 않는다");}
        else{ System.out.println("반팔 입는다");}

        
        // 조건문 중첩 : if( ){ if( ){ } }
        // if, if, if, if    !=    if, else if, else if, else
        // swich 문 : 논리 검사 X , 값에 따른 흐름 제어 , (true or false) 처럼 논리 연산 아님
        // break; 는 주로 for or switch 문에서 사용되는 탈출 키워드
        // 자료에 동일한 값이 case 에 존재하면 실행문 실행 , 단 해당하는 case 부터 아래 case 모두 실행
        
        // switch( 자료 ){ case 값1 : 실행문; case 값2 : 실행문; case 값3 : 실행문; default : 실행문; }

        char grade = 'B';
        switch (grade) {
            case 'A' : System.err.println("A 등급 입니다.");
                break;
            case 'B' : System.out.println("B 등급 입니다.");
                break;
            case 'C' : System.out.println("C 등급 입니다.");
                break;

            default : System.out.println("재시험 입니다.");                
                break;
        }

        switch (grade) {
            // 'A' && 'B'
            case 'A' :
            case 'B' : System.out.println("합격");   
                break;
            // 'C' && 나머지
            case 'C' :
            default  : System.out.println( "불합격");
                break;
        }

        int adult = 1;
        switch (grade) {
            case 'A':
                switch (adult) {
                    case 0 : System.out.println("A등급 미성년자입니다.");
                        break;
                    case 1 : System.out.println("A등급 성인입니다.");
                        break;
                } 
                break;
            case 'B':
                switch (adult) {
                    case 0 : System.out.println("B등급 미성년자입니다.");
                        break;
                    case 1 : System.out.println("B등급 성인입니다.");
                        break;
                }
                break;
        
            default:
                break;
        }



        for(int i=2 ; i <= 9 ; i++){
            if( i == 3 ) continue;  // i 가 3이면 증감식 이동
            if( i == 8 ) break;     // i 가 8이면 반복문 탈출
        }


        for( ; ; ){System.out.println("무한반복"); break;}
        while ( true ) { System.out.println("무한반복"); break;}
    

        // 초기값 ; while ( 조건문 ){ 실행문; 증감식; }
        int i = 1;
        while (i <= 10) { 
            System.out.println(i);
            i++; 
        }


        // 반복문과 배열 : 배열내 저장된 자료들을 인덱스(저장된 순서 번호)로 식별 ( 0 ~ .. )
        int[ ] ary = { 92 , 80 , 75 };  // JAVA 배열

        // * 배열 인덱스가 0 부터 마지막 인덱스까지 순차 저장
        for( int j = 0; j <= ary.length-1 ; j++){ System.out.println(ary[j]);}
        
        // 향상된 for 문 , for( 타입명 변수명 : 배열명 ){ } ,  JS 는 for( 변수명 in 배열명 ){ }
        // : 기준으로 오른쪽 배열 안에 요소들을 왼쪽 변수에 하나씩 대입
        // 인덱스 없이 자료(요소) 추출
        for( int data : ary ){
            System.out.println(data);
        }












    }
}
