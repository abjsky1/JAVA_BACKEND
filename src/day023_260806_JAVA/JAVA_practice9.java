package day023_260806_JAVA;

import java.util.Scanner;

public class JAVA_practice9 {

    public static void main(String[] args) {
        

        /*[문제 1] Printer 클래스를 만드세요.

        1. "안녕하세요, 메소드입니다."라고 출력하는 printMessage 메소드를 정의하세요. (매개변수 X, 반환값 X)
            
        2. main 함수에서 Printer 객체를 생성하고, printMessage 메소드를 호출하세요.*/
            
        Printer p1 = new Printer();

        p1.printMassage();



            
        /*[문제 2] Greeter 클래스를 만드세요.
            
        1. 문자열(이름) 하나를 매개변수로 받아, "안녕하세요, [이름]님!"이라고 출력하는 greet 메소드를 정의하세요.
        (매개변수 O, 반환값 X)
            
        2. main 함수에서 Greeter 객체를 생성하고, 자신의 이름을 인자로 전달하여 greet 메소드를 호출하세요.*/
            
        Greeter g1 = new Greeter();

        g1.greet("김길리");



        /*[문제 3] SimpleCalculator 클래스를 만드세요.
            
        1. 정수 두 개를 매개변수로 받아, 두 수의 합을 반환하는 add 메소드를 정의하세요. (매개변수 O, 반환값 O)
            
        2. main 함수에서 SimpleCalculator 객체를 생성하고, add 메소드를 호출하여 반환된 결과를 변수에 저장한 뒤,
        그 변수를 출력하세요.*/
            
        SimpleCalculator sc1 = new SimpleCalculator();

        int sum = sc1.add(1, 2);

        System.out.println(sum);


        
        /*[문제 4] Checker 클래스를 만드세요.
            
        1. 정수 하나를 매개변수로 받아, 그 수가 짝수이면 true, 홀수이면 false를 반환하는 isEven 메소드를 정의하세
        요.
            
        2. main 함수에서 isEven 메소드를 호출하고, 반환된 값에 따라 "짝수입니다." 또는 "홀수입니다."를 출력하세
        요.*/
            
        Checker check = new Checker();

        Scanner scan = new Scanner(System.in);

        System.out.printf("정수 입력 : ");
        int a = scan.nextInt();

        if (check.isEven(a) == true) { System.out.println("짝수입니다.");}
        else { System.out.println("홀수입니다.");}


            
        /*[문제 5] Lamp 클래스를 만드세요. isOn (boolean) 멤버 변수를 가집니다.
            
        1. turnOn 메소드를 호출하면 isOn이 true가 되고, turnOff 메소드를 호출하면 false가 되도록 두 메소드를 정
        의하세요.
            
        2. main 함수에서 Lamp 객체를 생성하고, turnOn과 turnOff를 차례로 호출하며 각 단계에서 램프의 상태
        (isOn 값)를 출력하여 확인하세요.*/
            
        Lamp lamp = new Lamp();

        System.out.println(lamp.isOn);

        lamp.turnOn();

        System.out.println(lamp.isOn);

        lamp.turnOff();

        System.out.println(lamp.isOn);



        /*[문제 6] Product 클래스를 만드세요. name(문자열)과 stock(정수) 멤버 변수를 가집니다.
            
        1. Product 클래스 안에, 구매 수량을 매개변수로 받아 재고를 차감하는 sell 메소드를 정의하세요. 이 메소드는 재고
        가 충분하면 재고를 줄이고 true를, 부족하면 "재고 부족" 메시지를 출력하고 false를 반환합니다.
            
        2. main 함수에서 Product 객체를 생성하고 초기 재고를 10으로 설정한 뒤, sell 메소드를 호출하여 구매를 시도하고
        결과를 확인하세요.*/
            
        Product pd = new Product();
        
        pd.stock = 10;

        System.out.println(pd.stock);

        pd.sell(8);

        System.out.println(pd.stock);

        pd.sell(3);

        System.out.println(pd.stock);




        /*[문제 7] Visualizer 클래스를 만드세요.
            
        1. 정수 하나를 매개변수로 받아, 그 숫자만큼 "★" 문자를 반복하여 하나의 문자열로 만들어 반환하는 getStars 메소
        드를 정의하세요.
            
        2. main 함수에서 getStars(5)를 호출하여 반환된 문자열 "★★★★★"를 출력하세요.*/
            
        Visualizer v1 = new Visualizer();

        String star1 = v1.getStars(5);

        System.out.println(star1);



        /*[문제 8] ParkingLot 클래스를 만드세요.
            
        1. 주차 시간(분)을 매개변수로 받아, 요금 규정에 따라 계산된 최종 주차 요금을 반환하는 calculateFee 메소드를 정
        의하세요.
            
        2. 요금 규정:
            
        기본 요금: 최초 30분까지 1,000원
            
        추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
            
        일일 최대 요금: 20,000원
            
        3. main 함수에서 calculateFee 메소드에 65, 140을 각각 인자로 전달하여 반환된 요금을 출력하세요.*/
            
        ParkingLot park = new ParkingLot();
        
        int 주차요금1 = park.calculateFee(65);

        int 주차요금2 = park.calculateFee(140);

        System.out.println(주차요금1);
        System.out.println(주차요금2);

    }

}




class Printer{
    
    void printMassage(){
        System.out.println("안녕하세요, 메소드입니다.");
    }

}

class Greeter{
    
    void greet( String name ){
        System.out.printf("안녕하세요, [%s]님!\n", name);
    }

}

class SimpleCalculator{

    int add( int x , int y ){
        return x+y;
    }

}


class Checker{

    boolean isEven( int x ){
        if (x % 2 == 0) { return true;}
        else { return false;}
    }

}


class Lamp{

    boolean isOn;  // 멤버 변수

    void turnOn(){
        this.isOn = true;
    }

    void turnOff(){
        this.isOn = false;
    }
    
}


class Product{

    String name;
    int stock;

    boolean sell(int 구매수량){
        if(stock >= 구매수량){ this.stock -= 구매수량; return true;}
        else{ System.out.println("재고 부족"); return false;}
    }

}


class Visualizer{

    String getStars(int x){
        
        String star = "";

        for(int i = 1 ; i <= x ; i++){
            star += "★";
        }

        return star;

    }

}


class ParkingLot{

    int calculateFee(int 주차시간){
        
        int fee = 1000;

        if (주차시간 > 30) { fee = 1000 + ((주차시간-30)/10)*500 ; }
        
        if (fee > 20000) { fee = 20000; }

        return fee;

    }
    
}