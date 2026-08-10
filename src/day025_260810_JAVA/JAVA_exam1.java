package day025_260810_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*
            배열 : 여러개 (동일한 타입) 자료들을 저장하는 타입 , 정적길이

            ArrayList 클래스 : 
            
                1. 컬렉션(수집) 프레임(틀) 워크(일) , 자료 수집관련 클래스/기능 제공

                2. 목적

                    1) 가변길이 제공
                    2) 배열과 관련된 기능(메소드) 제공 , 편의성
                    3) 사용법
                        - ArrayList<제네릭타입> 변수명 = new ArrayList<>();
                        - 제네릭타입 : 리스트 안에 저장할 요소들의 타입
                            - <String> 리스트에 여러개 String 저장
                            - 주의 : <제네릭타입> 은 기본타입이 불가능  int -> Integer (기본타입을 클래스타입으로 사용)
            
                3. 주요메소드

                    01) .add( 자료 )            :  리스트 요소 추가
                    02) .add( 인덱스 , 자료 )    :  리스트 중간 삽입
                    03) .set( 인덱스 , 자료 )    :  리스트 특정 인덱스 요소 수정
                    04) .size()                :  리스트 안에 요소 개수 반환
                    05) .get( 인덱스 )          :  리스트 특정 인덱스 요소 값 반환
                    06) .remove( 인덱스 )       :  리스트 특정 인덱스 삭제
                    07) .clear()               :  리스트 전체 요소 삭제
                    08) .indexOf( 찾을 값 )     :  리스트 안에 찾을 값이 존재하면 인덱스 값 반환, 없으면 -1 반환
                    09) .contains( 찾을 값 )    :  리스트 안에 찾을 값이 존재하면 true 반환, 없으면 false 반환
                    10) .isEmpty()             :  리스트가 비어 있으면 true 반환 , 한개라도 있으면 false 반환
                

        */

        // [리스트 생성]
        ArrayList< String > 변수명1 = new ArrayList<>();  // String 타입 여러개 저장하는 리스트

        // [리스트에 요소 추가]
        변수명1.add("김길리");  변수명1.add("람보르길리");  변수명1.add("길리슈트");

        // [리스트 전체 출력]
        System.out.println(변수명1);  // 결과물 : [김길리, 람보르길리, 길리슈트]

        // [리스트 중간 삽입]
        변수명1.add(1, "*리스트 중간 삽입*");

        System.out.println(변수명1);  // 결과물 : [김길리, *리스트 중간 삽입*, 람보르길리, 길리슈트]

        // [리스트 요소 수정]
        변수명1.set(1, "*리스트 요소 수정*");

        System.out.println(변수명1);  // 결과물 : [김길리, *리스트 요소 수정*, 람보르길리, 길리슈트]

        // [리스트 요소 총 개수]
        System.out.println(변수명1.size());  // 결과물 : 4  (배열 안에 전체 요소 개수)

        // [리스트 특정 요소 출력]
        System.out.println(변수명1.get(2));  // 결과물 : 람보르길리

        // [리스트 요소 삭제]
        변수명1.remove(1);

        System.out.println(변수명1);  // 결과물 : [김길리, 람보르길리, 길리슈트]

        // [리스트 요소 찾기]
        System.out.println(변수명1.indexOf("김길리"));  // "김길리" 찾을 값의 인덱스 반환 , 없으면 -1

        System.out.println(변수명1.contains("김길리"));  // "김길리" 찾을 값이 있으면 true , 없으면 false

        // [반복문과 리스트의 관계]
        // 일반 for 문
        for(int i = 0 ; i <= 변수명1.size()-1 ; i++) { String str = 변수명1.get(i);}
        // 향상된 for 문  ,  : 콜론 기준으로 오른쪽 리스트 안에 요소들을 하나씩 왼쪽 변수에 반복 대입
        for( String str : 변수명1 ) { }

        // [리스트 전체 삭제]
        System.out.println(변수명1.isEmpty());  // 리스트 안에 요소가 하나도 없으면 true , 하나라도 있으면 false 
        
        변수명1.clear();

        System.out.println(변수명1);  // 결과물 : []

        System.out.println(변수명1.isEmpty());  // 리스트 안에 요소가 하나도 없으면 true






        /*[문제 1] String 타입의 요소를 저장할 수 있는 ArrayList를 nameList 라는 이름으로 생성하세요.
        1. .add() 메소드를 사용하여 "유재석", "강호동", "신동엽" 세 개의 이름을 리스트에 추가하세요.
        2. 리스트의 모든 요소를 System.out.println()으로 한 번에 출력하세요.*/

        ArrayList< String > nameList = new ArrayList<>();
        
        nameList.add("유재석");
        nameList.add("강호동");
        nameList.add("신동엽");

        System.out.println(nameList);


        /*[문제 2] 다음과 같이 초기화된 ArrayList가 있습니다.
        1. ArrayList<String> fruits = new ArrayList<>();
        2. fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        3. 일반 for문을 사용하여, 각 인덱스와 해당 인덱스의 요소를 "인덱스 0: 사과" 형식으로 모두 출력하세요.*/

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");

        for(int i = 0 ; i <= fruits.size()-1 ; i++){
            System.out.println("인덱스 " + i + ": "+ fruits.get(i));
        }


        /*[문제 3] 문제 3의 fruits 리스트를 사용합니다.
        1. 향상된 for문 을 사용하여 리스트의 모든 요소를 하나씩 출력하세요.*/

        for(String fruit : fruits){System.out.println(fruit);}


        /*[문제 4] "A", "B", "C", "D", "E"를 요소로 가지는 ArrayList를 생성하세요.
        1. .remove() 메소드를 사용하여 2번 인덱스의 요소("C")를 삭제하세요.
        2. 삭제 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.*/

        ArrayList <String> abcde = new ArrayList<>();
        abcde.add("A"); abcde.add("B"); abcde.add("C"); abcde.add("D"); abcde.add("E");
        System.out.println(abcde);
        abcde.remove(2);
        System.out.println(abcde);


        /*[문제 5] "자바", "파이썬", "C++"를 요소로 가지는 ArrayList를 생성하세요.
        1. .add(인덱스, 요소) 메소드를 사용하여 1번 인덱스에 "자바스크립트"를 삽입하세요.
        2. 삽입 후의 리스트 전체를 출력하여 순서가 올바르게 변경되었는지 확인하세요.*/

        ArrayList <String> com = new ArrayList<>();

        com.add("자바"); com.add("파이썬"); com.add("C++");

        System.out.println(com);

        com.add(1, "자바스크립트");

        System.out.println(com);


        /*[문제 6] title(문자열)과 author(문자열) 멤버 변수를 가진 Book 클래스를 만드세요.
        1. Book 객체를 저장할 수 있는 ArrayList를 library 라는 이름으로 생성하세요.
        2. new Book(...)을 사용하여 3권의 책 객체를 생성하고 library 리스트에 추가하세요.
        3. 향상된 for문을 사용하여 library에 저장된 모든 책의 제목과 저자를 출력하세요.*/

        ArrayList <Book> library = new ArrayList<>();

        Book b1 = new Book(); b1.title = "t1"; b1.author = "n1"; 
        Book b2 = new Book(); b2.title = "t2"; b2.author = "n2";
        Book b3 = new Book(); b3.title = "t3"; b3.author = "n3";

        library.add(new Book("책이름1", "저자1"));
        library.add(new Book("책이름2", "저자2"));
        library.add(new Book("책이름3", "저자3"));

        library.add(b1); library.add(b2); library.add(b3);

        for(int i = 0 ; i <= library.size()-1 ; i++){
            System.out.print(library.get(i).title);
            System.out.println(library.get(i).author);
        }

        for(Book bb : library){
            System.out.println(bb.title + bb.author);
        }
        


        /*[문제 7] Scanner를 사용하여 사용자로부터 문자열을 계속해서 입력받습니다.
        1. 입력받은 문자열은 ArrayList에 순서대로 저장합니다.
        2. 만약 사용자가 "종료" 라는 단어를 입력하면, 입력을 멈추고 그때까지 리스트에 저장된 모든 내용을 출력한 뒤 프로그램을 종료하세요.*/

        Scanner scan = new Scanner(System.in);

        ArrayList <String> aa = new ArrayList<>();

        for(;;){
            System.out.print("문자열 입력 >> ");
            String a = scan.next();    

            if(a.equals("종료")){
                
                for(int i = 0 ; i <= aa.size()-1 ; i++){
                    System.out.println(aa.get(i));  
                }
                
                break;
                
            }

            aa.add(a);

        }



        /*[문제 8] "국어", "수학", "사회", "과학"을 요소로 가지는 ArrayList를 생성하세요.
        1. .set(인덱스, 요소) 메소드를 사용하여 1번 인덱스의 "수학"을 "영어"로 수정하세요.
        2. 수정 후의 리스트 전체를 출력하여 결과가 올바른지 확인하세요.*/

        ArrayList <String> subject = new ArrayList<>();

        subject.add("국어"); subject.add("수학"); subject.add("사회"); subject.add("과학");
        
        System.out.println(subject);

        subject.set(1, "영어");

        System.out.println(subject);



    }
}

class Book{
    String title;
    String author;
    
    public Book(){};
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}