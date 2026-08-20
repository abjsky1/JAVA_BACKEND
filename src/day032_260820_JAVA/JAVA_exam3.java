package day032_260820_JAVA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JAVA_exam3 {

    public static void main(String[] args) {
        
    //  Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션 

    //      - 단, 중복 제거 기능

    //      - index(순서) 없음.  =>  .get(index) 함수 지원 불가

    //      [1]

    //      1. Set 구현

                Set<String> set1 = new HashSet<>();

    //      2. Set  .add(추가할 값);

                set1.add("김길리");
                set1.add("람보르길리");
                set1.add("김길리");     // List 중복 허용 , Set 중복 허용 안 함.
                set1.add(new String("람보르길리"));
                System.out.println(set1);

    //      3. .get(인덱스); 불가

    //          set1.get(0);   // error

    //      4. .size(); 불가
    
                System.out.println(set1.size());
    
    //      5. .remove(자료);  인덱스가 아닌 자료로 삭제          

                set1.remove("김길리");
                System.out.println(set1);

    //      6. .indexOf(찾을 값);  불가

    //          set1.indexOf("람보르길리");
                
    //      7. .contains(찾을 값);  가능

                set1.contains("김길리");

    //      8. .clear() : 항목 전체삭제 가능

                set1.clear();

    //      9. .isEmpty() : 항목이 하나도 없으면 true , 하나라도 있으면 false

                System.out.println(set1.isEmpty());



            set1.add("김길리");
            set1.add("람보르길리");
            set1.add("길리슈트");

    //      [2] Set 컬렉션과 반복문 관계

    //      1. 일반 for문 불가능 (인덱스가 없기때문)

    //      2. 향상된 for문 사용 가능

                for(String str : set1){ System.out.println(str); }

    //      3. .forEach() 메소드 사용 가능

                set1.forEach( (str) -> { System.out.println(str); } );

    
    //      [3] Set 활용처

    //      1. ResultSet : JDBC 에서 사용함.

    ///     2. .iterator() : 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
            
                Iterator<String> 순회자 = set1.iterator();

    //      3. .hasNext() : 인덱스 없이 목록에서 자료를 저장된 순서대로 하나씩 이동

                while ( 순회자.hasNext() ){ System.out.println(순회자.next()); }


    //      [4] TreeSet 

    //      1. 자동 정렬 시스템 지원 

                TreeSet<Integer> set2 = new TreeSet<>();

                set2.add(50);
                set2.add(70);
                set2.add(60);

                System.out.println(set2);
                System.out.println(set2.descendingSet());



    }

}
