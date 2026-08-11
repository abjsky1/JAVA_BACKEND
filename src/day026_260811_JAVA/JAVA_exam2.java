package day026_260811_JAVA;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
        // 자바는 100% 객체지향언어다.
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계

        // [1]
        A a = new A(); // 총 2개 , A --> Object

        // [2]
        B b = new B(); // 총 3개 , B --> A --> Object
        
        // [3]
        C c = new C(); // 총 3개 , C --> A --> Object

        // [4]
        D d = new D(); // 총 4개 , D --> B --> A --> Object

        // [5]
        E e = new E(); // 총 4개 , E --> C --> A --> Object


        // 자동 타입 변환

        A a2 = b;        //  B --> A  [가능]

        Object o1 = a2;  //  A --> Object  [가능]

        // 강제 타입 변환

        B b2 = (B)a2;    //  A --> B  [가능]  (태생이 B라서)

    //  C c2 = (C)b;     //  B --> C  [불가능]  (B는 C를 포함하지 않기 때문에)

        
        // 타입 확인 , 인스턴스 instanceOf 타입명

        System.out.println( e instanceof Object );  // e --> Object     // true
        System.out.println( e instanceof C );       // e --> C          // true
    //  System.out.println( e instanceof D );       // e --> D          // false
    //  System.out.println( e instanceof B );       // e --> B          // false

  






    }

}


class A{
    A(){ System.out.println("[1] A 객체 생성");}
}

class B extends A{
    B(){ System.out.println("[2] B 객체 생성");}
}

class C extends A{
    C(){ System.out.println("[3] C 객체 생성");}
}

class D extends B{
    D(){ System.out.println("[4] D 객체 생성");}
}

class E extends C{
    E(){ System.out.println("[5] E 객체 생성");}
}