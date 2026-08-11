package day026_260811_JAVA;

public class JAVA_exam3 {

    public static void main(String[] args) {
        
        상위클래스 obj1 = new 상위클래스();
        obj1.show(); 
    //  상위 탄생 , 상위 메소드 실행
        System.out.println(obj1.value1);
        System.out.println(obj1.value2);
    //  System.out.println(obj1.value3);
    //  System.out.println(obj1.value4);


        하위클래스 obj2 = new 하위클래스();
        obj2.show();
    //  상위 탄생 , 하위 탄생 , 하위 메소드 재정의 실행
        System.out.println(obj2.value1);
        System.out.println(obj2.value2);
        System.out.println(obj2.value3);
        System.out.println(obj2.value4);
    


        // 타입변환
        상위클래스 obj3 = obj2;
        obj3.show();
    //  하위 메소드 재정의 실행 
        System.out.println(obj3.value1);
        System.out.println(obj3.value2);
    //  System.out.println(obj3.value3);
    //  System.out.println(obj3.value4);


    }

}


/*
    오버로딩 :
        - 생성자명/메소드명 동일하게 여러개 선언하는 것
        - 조건
            1) 매개변수 개수, 타입, 순서 다른 경우

    오버라이딩 (우선) :
        - 물려받은 메소드 재정의하는 것
        - 조건
            1) 상위클래스의 메소드 선언부와 모두 동일하면 재정의  
*/

class 상위클래스{
    int value1 = 10;
    int value2 = 20;
    
    상위클래스(){ System.out.println("상위 탄생");}
    void show(){ System.out.println("상위 메소드 실행");}

}


class 하위클래스 extends 상위클래스{
    int value3 = 30;
    int value4 = 40;

    하위클래스(){System.out.println("하위 탄생");}

    // 주의 : 오버로딩 vs 오버라이딩

    // 오버로딩 : 메소드명은 같지만 매개변수가 다름
    void show( int a ){ }   

    // 오버라이딩 : 상위클래스의 메소드 선언부와 모두 동일
    @Override
    void show(){ System.out.println("하위 메소드 재정의 실행");}

    
    
    
}