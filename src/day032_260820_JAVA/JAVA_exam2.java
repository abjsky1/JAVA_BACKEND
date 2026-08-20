package day032_260820_JAVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
        /*
            제네릭 : 클래스 안에 타입들을 인스턴스 생성시 정한다.

            컬렉션(수집)프레임(틀)워크(일)

                정의 : 데이터 수집(목록) 하는 자료구조(방법)를 미리 만들어 둔 인터페이스/클래스들

                목적 : 복잡한 자료들을 편리하게 사용하기위해 제공 받아 사용

                종류 : 

                    1. List 인터페이스* : 
                        
                        구현체 : ArrayList , Vector , LinkedList , Stack 등

                    2. Set 인터페이스

                        구현체 : HashSet , TreeSet 등

                    3. Map 인터페이스*

                        구현체 : HashMap , HashTable , TreeMap 등

                * 인터페이스 : 서로 다른 클래스들을 하나의 타입으로 제어/조작하기 위해 사용
                * 구현체 : 인터페이스 안에 추상메소드를 구현한 클래스들
                * 다형성 : (업/다운 캐스팅) 하나의 자료가 서로 다른 타입으로 변환 
        */

    //  [1] List 인터페이스
        
        ArrayList<String> list1 = new ArrayList<>();
    //  list1 = new LinkedList<>();  // 불가능

        List<String> list2 = new ArrayList<>();
        list2 = new LinkedList<>();  // 다형성 

    //  [2] List 인터페이스 타입으로 구현체 메소드 사용가능 <day025_260810_JAVA - JAVA_exam1>

    //      01) .add( 자료 )            :  리스트 요소 추가
    //      02) .add( 인덱스 , 자료 )    :  리스트 중간 삽입
    //      03) .set( 인덱스 , 자료 )    :  리스트 특정 인덱스 요소 수정
    //      04) .size()                :  리스트 안에 요소 개수 반환
    //      05) .get( 인덱스 )          :  리스트 특정 인덱스 요소 값 반환
    //      06) .remove( 인덱스 )       :  리스트 특정 인덱스 삭제
    //      07) .clear()               :  리스트 전체 요소 삭제
    //      08) .indexOf( 찾을 값 )     :  리스트 안에 찾을 값이 존재하면 인덱스 값 반환, 없으면 -1 반환
    //      09) .contains( 찾을 값 )    :  리스트 안에 찾을 값이 존재하면 true 반환, 없으면 false 반환
    //      10) .isEmpty()             :  리스트가 비어 있으면 true 반환 , 한개라도 있으면 false 반환

    //  [3] 리스트/배열 과 반복문 관계 : 리스트(목록) 안에 항목(값)들을 한번에 찾을 수 없어 하나씩 순회/반복하여 찾는다.

    //      1. 일반 for문 : index 필요시

                for(int i = 0 ; i <= list1.size()-1 ; i++){String str = list1.get(i); System.out.println(str);}

    //      2. 향상된 for문 : 전체순회시 

                for(String str : list1){ System.out.println(str); }

    //      3. forEach() : 반복메소드

    //          리스트객체.forEach( (반복변수명) -> {실행문} );

                list1.forEach( (str) -> { System.out.println(str); } );

    //  [4] List 구현체 차이 : 사용법(함수/메소드) 동일 , 구조적 차이 존재

    //      1. ArrayList : index 기반의 배열 구조 가짐

    //          [A] [B] [C] [D]         // [E] 저장한 경우, 마지막 뒤에 E 저장
    //           0   1   2   3          // [B] 삭제한 경우, 삭제된 [B] 이후로 한칸씩 앞으로 이동한다. 
    
    //          1000개의 자료가 있을 때, 일부 삭제/수정하면 999 이동 발생

    //          배열 추가만 할 때, 이상적 사용 가능

    //      2. LinkedList : 링크[head][date][tail] = 노드 기반의 리스트 구조

    //          [][ A ][B주소]  [A주소][ B ][C주소]  [B주소][ C ][D주소]  [C주소][ D ][]
    //          [E] 저장한 경우, D 꼬리에 E주소 저장하고 E 헤드에 D주소 저장한다.
    //          [B] 삭제한 경우, B 꼬리를 A 꼬리로 이동하고 B 헤드를 C 헤드로 이동한다.  

    //          1000개의 자료가 있을 때, 일부 삭제/수정하면 앞뒤만 이동발생

    //          중간 삭제 및 변동이 많을 때, 이상적 사용 가능

    //      3. Vector : ArrayList 와 동일한 구조, but 동기화를 지원함.


    }
}
