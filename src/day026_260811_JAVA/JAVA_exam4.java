package day026_260811_JAVA;

public class JAVA_exam4 {

    public static void main(String[] args) {
        
        // [01] Car 라는 타입의 myCar 라는 변수로 인스턴스 생성
        Car myCar = new Car();  

            // [01-1] 주소값 체크
            System.out.println(myCar);  // @2f92e0f4
            Car yourCar = new Car();
            System.out.println(yourCar);  // @28a418fc

        // [02] myCar 라는 변수의 tire 라는 속성값에 인스턴스 생성
        myCar.tire = new Tire(); 

        // [03] myCar 라는 변수에 Car 클래스 안에 있는 run 함수 실행 { this.tire.roll(); }
        // [04] this.tire.roll() 에서 this.tire 는 [new Tire();] 를 따라감
        // [05] 따라서 [Tire 클래스] 의 [roll 함수] 실행 {System.out.println("[일반] 타이어가 회전");}
        // [06] "[일반] 타이어가 회전" 터미널에 출력
        myCar.run(); 

        // [07] myCar 라는 변수의 tire 라는 속성값에 인스턴스 새로 생성 (덮어쓰기)
        myCar.tire = new HankookTire(); 

        // [08] myCar 라는 변수에 Car 클래스 안에 있는 run 함수 실행 { this.tire.roll(); }
        // [09] this.tire.roll() 에서 this.tire 는 [new HankookTire();] 를 따라감
        // [10] 따라서 [HankookTire 클래스] 의 [roll 함수] 실행 (오버라이딩 적용) { System.out.println("[한국] 타이어가 회전(업그레이드)"); }
        myCar.run(); 

        // [11] myCar 라는 변수의 tire 라는 속성값에 인스턴스 새로 생성 (덮어쓰기)
        myCar.tire = new KumhoTire();

        // [12] myCar 라는 변수에 Car 클래스 안에 있는 run 함수 실행 { this.tire.roll(); }
        // [13] this.tire.roll() 에서 this.tire 는 [new KumhoTire();] 를 따라감
        // [14] 따라서 [HankookTire 클래스] 의 [roll 함수] 실행 (오버라이딩 적용) { System.out.println("[금호] 타이어가 회전(업그레이드)"); }
        myCar.run(); 

        // [15] 현재 myCar.tire = new KumhoTire();
        // [16] 따라서 상위클래스인 Tire 에 포함 되는 것 맞음
        System.out.println( myCar.tire instanceof Tire ); // true

        // [17] 하위클래스인 KumhoTire 에 포함 되는 것도 맞음
        System.out.println( myCar.tire instanceof KumhoTire ); // true

        // [18] Tire 에는 포함되지만 다른 가지의 하위클래스인 HankookTire 에는 포함 되는 것 아님
        System.out.println( myCar.tire instanceof HankookTire ); // false


        // 필드는 상태, 메소드는 행위
        // 상속의 다형성 : 호환(타입의 변환 IOT AX) , 확장 , 오버라이딩
        
        Tire aa = new KumhoTire();

        // KumhoTire kk = new Tire();

        // HankookTire hh = new Car();

        // HankookTire nn = aa;

        // KumhoTire uu = aa;

        // Car cc = aa;

    }
}


class Car{ // 자동차
 Tire tire;
 void run() { this.tire.roll(); }
}
class Tire{ // 타이어
 void roll(){ System.out.println("[일반] 타이어가 회전"); }
}
class HankookTire extends Tire{
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
 void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}