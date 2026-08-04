package day021_260804_JAVA;

import java.util.Scanner;

// 문제 1
class Book{
    String title;
    String author;
    int price;
}

// 문제 2
class pet{
    String name;
    String species;
    int age;
}

// 문제 3
class Rectangle{
    int width;
    int height;
}

// 문제 4
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}

// 문제 5
class Product{
    String name;
    int price;
}

// 문제 6
class Member{
    String id;
    Boolean isLogin;
}

// 문제 7
class Television{
    int channel;
    int volume;
}

// 문제 8
class Player{
    String name;
    int power;
    int speed;
}

// 문제 9
class MenuItem{
    String name;
    int price;
    boolean isSignature;

}

// 문제 10
class UserProfile{
    String name;
    int age;
    String mbti;
}





public class JAVA_practice7 {

    public static void main(String[] args) {
        
        /*[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Book 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
        3. 두 객체의 모든 정보를 각각 출력하세요.*/

        // 객체 생성
        // new 생성자명();
        // 타입 변수명 = new 생성자명();

        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "이것이 자바다";
        b1.author = "신용권";
        b1.price = 30000;

        b2.title = "자바의 정석";
        b2.author = "남궁성";
        b2.price = 28000;

        System.out.println(b1.title); System.out.println(b1.author); System.out.println(b1.price);
        System.out.println(b2.title); System.out.println(b2.author); System.out.println(b2.price);



        /*[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Pet 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
        3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.*/

        pet p1 = new pet();
        pet p2 = new pet();

        p1.name = "초코"; p1.species = "푸들"; p1.age = 3;
        p2.name = "나비"; p2.species = "코리안숏헤어"; p2.age = 5;

        System.out.printf("\n이름: %s, 종류: %s, 나이: %d살", p1.name, p1.species, p1.age);
        System.out.printf("\n이름: %s, 종류: %s, 나이: %d살", p2.name, p2.species, p2.age);




        /*[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
        2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.*/

        Rectangle r1 = new Rectangle();

        // 기본값 할당
        System.out.println(r1.width); System.out.println(r1.height);

        r1.width = 10;
        r1.height = 5;

        System.out.printf("\n사각형의 넓이: %d", r1.width * r1.height);




        /*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버 변수를 가집니다.
        1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000으로 저장하세요.
        2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
        3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/

        BankAccount ba1 = new BankAccount();

        ba1.accountNumber = "111-222-3333";
        ba1.ownerName = "유재석";
        ba1.balance = 10000;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n입금 금액 입력");
        int 입금 = scan.nextInt();

        ba1.balance += 입금;

        System.out.printf("입금 후 잔액: %d", ba1.balance);

        System.out.println("출금 금액 입력");
        int 출금 = scan.nextInt();

        ba1.balance -= 출금;

        System.out.printf("출금 후 잔액: %d\n", ba1.balance);



        /*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
        2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/

        Product a1 = new Product();
        Product a2 = new Product();

        a1.name = "새우깡"; a1.price = 1500;
        a2.name = "콜라"; a2.price = 2000;

        if (a1.price > a2.price) { System.out.println(a1.name);}
        else if ( a2.price > a1.price) { System.out.println(a2.name);}
        else { System.out.printf("\n %s , %s 두 상품 모두 가격이 같습니다.", a1.name , a2.name);}



        /*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.
        1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
        2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
        3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
        4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/

        Member m1 = new Member();

        m1.id = "admin"; m1.isLogin = false;

        System.out.printf("\n로그인 전 상태: %b", m1.isLogin);
        
        m1.isLogin = true;

        System.out.printf("\n로그인 후 상태: %b", m1.isLogin);




        /*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
        2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/

        Television t1 = new Television();

        // 초기값
        System.out.printf("\n채널 : %d , 볼륨 : %d", t1.channel, t1.volume);

        t1.channel = 7; t1.volume = 20;

        System.out.printf("\n채널 : %d , 볼륨 : %d", t1.channel, t1.volume);

        t1.channel = 11; t1.volume = 2;

        System.out.printf("\n채널 : %d , 볼륨 : %d", t1.channel, t1.volume);



        /*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.
        1. main 함수에서 Player 객체 2개를 생성하세요.
        2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
        3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/

        Player q1 = new Player();
        Player q2 = new Player();

        q1.name = "손흥민"; q1.power = 90; q1.speed = 95;
        q2.name = "이강인"; q2.power = 85; q2.speed = 92;

        int sum1 = q1.power + q1.speed;
        int sum2 = q2.power + q2.speed;

        if (sum1 > sum2) { System.out.println(q1.name);}
        else if (sum2 > sum1) { System.out.println(q2.name);}
        else { System.out.printf("\n%s , %s 두 선수의 power 와 speed 의 합이 동일합니다.", q1.name, q2.name);}




        /*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집니다.
        1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번째는 "계란찜", 3000, false로 저장하세요.
        2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/

        MenuItem w1 = new MenuItem();
        MenuItem w2 = new MenuItem();
        MenuItem w3 = new MenuItem();

        w1.name = "김치찌개"; w1.price = 8000; w1.isSignature = true;
        w2.name = "된장찌개"; w2.price = 8000; w2.isSignature = false;
        w3.name = "계란찜"  ; w3.price = 3000; w3.isSignature = false;

        if(w1.isSignature == true){System.out.printf("\n[대표메뉴] [%s] : [%d]원", w1.name, w1.price);}
        if(w2.isSignature == true){System.out.printf("\n[대표메뉴] [%s] : [%d]원", w2.name, w2.price);}
        if(w3.isSignature == true){System.out.printf("\n[대표메뉴] [%s] : [%d]원", w3.name, w3.price);}




        /*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.
        1. main 함수에서 UserProfile 객체를 하나 생성하세요.
        2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
        3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
        3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으로 출력하세요.*/

        UserProfile u1 = new UserProfile();

        String 이름 = scan.next();
        int 나이 = scan.nextInt();
        String 엠비티아이 = scan.next();

        u1.name = 이름;
        u1.age = 나이;
        u1.mbti = 엠비티아이;

        System.out.printf("\"--- 프로필 ---\", \"이름: [%s]\", \"나이: [%d]\", \"MBTI: [%s]\"", u1.name , u1.age, u1.mbti);












    }
}
