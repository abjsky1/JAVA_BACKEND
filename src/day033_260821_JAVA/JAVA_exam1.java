package day033_260821_JAVA;

import java.util.HashMap;
import java.util.Map;

public class JAVA_exam1 {

    public static void main(String[] args) {
        
        /*
            제네릭타입 : 클래스 만들 때 타입 정하지 않고 클래스 사용할 때 타입 정함

                List<BoardDto> list = new ArrayList<>()

                    - List 인터페이스 만들 때 정의하지 않고 List 인터페이스 사용할 때 BoardDto 타입 정함.
                    - 정의/만들기 class 클래스명{} , 사용/호출 : 클래스명 변수명;

            컬렉션 프레임 워크 

                List 인터페이스 : 중복 허용 , 인덱스 있음    ex) ArrayList , LinkedList 등
                Set  인터페이스 : 중복 불가 , 인덱스 없음    ex) HashSet , TreeSet 등
                Map  인터페이스 : Key - 중복 불가 , value - 중복 허용 , 인덱스 없음    ex) HashMap , TableMap , TreeMap 등

        */

    //  [1] Map : key 와 value 한 쌍(엔트리)으로 여러개 쌍(엔트리) 저장하는 구조 = JSON( { } ) / DTO 가변으로 쓸 때

    //          Map< Key , value > 

                Map< String , Integer > map = new HashMap<>();

    //  [2] 사용법(메소드) : 

    //      1. .put( key , value ) : key - vlaue 한쌍 엔트리 추가

                map.put("김길리", 100);  // Key명 - 속성명 - 필드명
                map.put("람보르길리", 350);
                map.put("길리슈트", 140);

    //      *. 중복된 Key값 입력시 추가가 아닌 수정으로 들어감          
                map.put("김길리", 80);  
                System.out.println(map);  // {람보르길리=350, 김길리=80, 길리슈트=140}

    //      2. .get( Key ) : Key 해당하는 value 반환

                System.out.println( map.get("김길리") );  // 80

    //      3. .size( ) : 총 엔트리 수 반환

                System.out.println( map.size() );  // 3

    //      4-1. .containsKey( 찾을 Key ) : 찾을 Key 존재하면 true / 없으면 false
    
                System.out.println( map.containsKey("람보르길리") );

    //      4-2. .containsValue( 찾을 Value ) : 찾을 Value 존재하면 true / 없으면 false

                System.out.println( map.containsValue(350) );

    //      5-1. .keySet() : 모든 Key 값 반환

                System.out.println( map.keySet() );

    //      5-2. .values() : 모든 values 값 반환

                System.out.println( map.values() );

    //      6. .remove( Key ) : 해당하는 Key 의 엔트리( Key & value ) 삭제

                map.remove("길리슈트");
                System.out.println( map.keySet() );
                System.out.println( map.values() );

    //      7. .clear() : 모든 엔트리 삭제

                map.clear();
                System.out.println( map.keySet() );
                System.out.println( map.values() );

    //      8. .isEmpty() : 엔트리가 1개도 없으면 true / false

                System.out.println( map.isEmpty() );

    //      *. 활용처 :

    //          1. [JSON]  < -- 통신 -->  [DTO/MAP(JAVA)]       * DTO - private , MAP - 단순조회

    //          2. 자료구조(암호화) 등

    //  [3] 반복문과의 관계

    //      1. 일반 For문 불가능 , 인덱스가 없음

    //      2. 향상된 For문 , Key

    //          * Key 이용한 값 호출
                for( String key : map.keySet() ){ System.out.println(key + " , " + map.get(key)); }

    //      3. forEach( ( 반복변수명 ) -> { 실행문 } ) , key

                map.keySet().forEach( (key) -> { System.out.println(key + " , " + map.get(key)); } );
                
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
