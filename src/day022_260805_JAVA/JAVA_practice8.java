package day022_260805_JAVA;

public class JAVA_practice8 {

    public static void main(String[] args) {
        

        /*[문제 1] Book 클래스 (매개변수 생성자 기본)
        Book 클래스를 정의하세요. (멤버 변수: title, author, price)
        멤버 변수의 타입은 적절하게 선택하시오.
        title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 정의하세요.
        main 함수에서 해당 생성자를 이용하여 다음 두 객체를 생성하고, 각 객체의 필드 값을 출력하세요.
        ("이것이 자바다", "신용권", 30000)
        ("자바의 정석", "남궁성", 28000)*/

        Book book1 = new Book("이것이 자바다", "신용권", 30000);
        Book book2 = new Book("자바의 정석", "남궁성", 28000);

        System.out.printf("\n%s %s %d", book1.title, book1.author, book1.price);
        System.out.printf("\n%s %s %d", book2.title, book2.author, book2.price);



        /*[문제 2] Rectangle 클래스 (매개변수 생성자를 통한 객체 초기화)
        Rectangle 클래스를 정의하세요. (멤버 변수: width, height)
        멤버 변수의 타입은 적절하게 선택하시오.
        width와 height를 매개변수로 받아 초기화하는 생성자를 정의하세요.
        main 함수에서 (10, 5) 값을 매개변수로 전달하여 Rectangle 객체를 생성하세요.
        생성된 객체의 width와 height 값을 각각 출력하세요.*/

        Rectangle rec1 = new Rectangle(10, 5);

        System.out.printf("\n%d %d", rec1.height, rec1.width);



        /*[문제 3] BankAccount 클래스 (다양한 데이터 타입을 가진 생성자)
        BankAccount 클래스를 정의하세요. (멤버 변수: accountNumber, ownerName, balance)
        멤버 변수의 타입은 적절하게 선택하시오.
        세 멤버 변수(accountNumber, ownerName, balance)를 모두 전달받아 초기화하는 생성자를 정의하세요.
        main 함수에서 ("111-222-3333", "유재석", 10000) 정보로 BankAccount 객체를 생성하세요.
        객체 생성 후, 해당 객체의 계좌번호, 예금주명, 잔액 정보를 출력하여 올바르게 초기화되었는지 확인하세요.*/

        BackAccount bank1 = new BackAccount("111-222-3333", "김길리", 10000);

        System.out.printf("\n%s %s %d", bank1.accountNumber, bank1.ownerName, bank1.balance);




        /*[문제 4] Goods 클래스 (생성자 오버로딩)
        Goods 클래스를 정의하세요. (멤버 변수: name, price)
        멤버 변수의 타입은 적절하게 선택하시오.
        Goods 클래스에 생성자 오버로딩을 적용하여 두 개의 생성자를 정의하세요.
        기본 생성자: name은 "미정", price는 0으로 초기화
        매개변수 생성자: name과 price를 전달받아 초기화
        main 함수에서 다음 두 객체를 각각 생성하고, 두 객체의 멤버 변수 정보를 출력하세요.
        기본 생성자로 생성한 객체
        매개변수 생성자를 통해 ("콜라", 2000) 정보로 생성한 객체*/

        Goods g1 = new Goods();

        System.out.printf("\n%s - %d", g1.name, g1.price);

        Goods g2 = new Goods("콜라", 2000);

        System.out.printf("\n%s - %d", g2.name, g2.price);



        /*[문제 5] Member 클래스 (기본 생성자 및 초기값 설정)
        Member 클래스를 정의하세요. (멤버 변수: id, isLogin)
        멤버 변수의 타입은 적절하게 선택하시오.
        Member 클래스에 기본 생성자를 만들고, 생성자 내부에서 id는 "guest", isLogin은 false로 초기화되도록 구현하세요.
        main 함수에서 new Member()로 객체를 생성한 뒤, 초기화된 id와 isLogin 값을 출력하여 확인하세요.*/

        Member m1 = new Member();

        System.out.printf("\n%s %b", m1.id, m1.isLogin);









    }
}




class Book{
    String title;
    String author;
    int price;

    Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Rectangle{
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height= height;
    }
}

class BackAccount{
    String accountNumber;
    String ownerName;
    int balance;

    BackAccount(String accountNumber, String ownerName, int balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}

class Goods{
    String name;
    int price = 0;

    Goods(){}

    Goods( String name , int price ){
        this.price = price;
        this.name = name;
    }
}

class Member{
    String id;
    boolean isLogin;

    Member(){
        this.id = "guest";
        this.isLogin = false;
    }


}