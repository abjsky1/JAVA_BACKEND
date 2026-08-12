package day027_260812_JAVA;

import java.security.Key;

public class JAVA_exam2 {

    public static void main(String[] args) {
        
        // 1. 인터페이스(interface) : 키보드 규격(규칙)을 만든다.
        // 2. 규격에 따른 (implements) 구현<구현체>를 만든다.
        // 3. 키보드 타입 생성
        KeyBoard myKeyBoard;  // interface 는 new 할 수 없음.
        // 4. 스포츠게임 실행
        myKeyBoard = new SportsGame(); // 업캐스팅
        // 5. a key
        myKeyBoard.aKey();
        // 6. 스포츠게임 종료하고 액션게임 실행
        myKeyBoard = new ActionGame(); // 업캐스팅 (변수는 단 하나의 자료만 저장)
        // 7. a key
        myKeyBoard.aKey();
        myKeyBoard.aKey();
        myKeyBoard.aKey();



        System.out.println();

        System.out.println();


    }
}



class ActionGame implements KeyBoard{ 

    int hp = 100;

    @Override
    public void aKey() {

        System.out.println("펀치");
        
        this.hp -= 10;

        System.out.println(hp);
        
    }

    @Override
    public int bkey(int x) {
        System.out.println("방어");
        return x;
    }
    
}


class SportsGame implements KeyBoard{ 

    @Override
    public void aKey() {
        System.out.println("슈팅");
        
    }

    @Override
    public int bkey(int x) {
        System.out.println("수비");
        return 0;
    }

}


interface Buy{ 
    // 1) 추상메소드 : 구현부가 없는 메소드
    public abstract void method1( ); // 추상
    // 2) 디폴트메소드 : 구현부가 있는 메소드
    public default void method2( ){ }
    // 3) 정적메소드 : static 이면 인스턴스(구현체) 없이 사용 가능한 메소드
    public static void method3( ){ }
    // 4) 비공개메소드 : 하위타입에서 오버라이딩 불가능한 메소드
    private void method4( ){ }

}

interface Sell{ 
    // 1) 생략시 public abstract 기본적용됨.
    void method5( ); // 추상
}

class Customer extends Object implements Buy, Sell{
    // 인터페이스는 쉼표를 이용하여 두개 이상 구현 가능.
    // 추상메소드는 필수 오버라이딩
    @Override
    public void method1( ){ }
    @Override
    public void method5( ){ }

    // 하위클래스 안에 메소드의 구현부가 없으면 상위클래스 안의 메소드 구현부를 쓰는데
    // 추상메소드는 상위인터페이스에 구현부가 없음.
    // 따라서 추상메소드는 필수 오버라이딩 해야 함.

}

interface CustomerControl extends Buy, Sell{
    // 인터페이스는 다른 인터페이스로부터 상속이 가능
    void order( ); // 추상
}

class Customer2 implements CustomerControl{
    // Buy + Sell 상속받은 CustomerControl 구현함.
    // 따라서 오버라이드 Buy, Sell, CustomerControl 모두 해야 함.
    @Override
    public void method1( ){ }
    @Override
    public void method5( ){ }
    @Override
    public void order( ){ }
}


