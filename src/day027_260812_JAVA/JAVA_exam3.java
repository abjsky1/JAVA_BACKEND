package day027_260812_JAVA;

public class JAVA_exam3 {

    public static void main(String[] args) {
        
        Car myCar = new Car();
    //  myCar.run();    // ==>> 타이어 없어서 에러  ==>>  tire.roll() 이 추상메소드라 아직 구현체가 없음.
        
        myCar.tire = new HankookTire();
        myCar.run();  // 한국타이어 회전

        myCar.tire = new KumhoTire();
        myCar.run();  // 한국타이어 회전

        System.out.println( myCar.tire instanceof Tire );  // true

        System.out.println( myCar.tire instanceof KumhoTire );  // true

        System.out.println( myCar.tire instanceof HankookTire );  // false


        // * 익명(클래스없이)구현체 = 일회성 사용하는 인터페이스 구현체
        // 자체적으로 추상메소드 오버라이딩
        // new 인터페이스명( ){ 오버라이딩 }
        myCar.tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("일회성타이어 회전");
            }
        };
        myCar.run();  // 일회성타이어 회전


    }
}


class Car{ 

    // 멤버변수
    Tire tire;

    // 메소드
    void run( ){ this.tire.roll(); }

}

interface Tire{

    // 추상메소드
    void roll( ); // { } 없는 메소드는 추상메소드

}

class HankookTire implements Tire{

    // 추상메소드 { } 구현(재정의)  :  오버라이딩하기
    @Override
    public void roll( ){ 
        System.out.println("한국 타이어 회전");
    }

}

class KumhoTire implements Tire{

    // 추상메소드 { } 구현(재정의)  :  오버라이딩하기
    @Override
    public void roll( ){ 
        System.out.println("금호 타이어 회전");
    }

}