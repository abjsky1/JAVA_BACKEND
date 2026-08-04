package day021_260804_JAVA;

class Book {
          String title;
          // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
          Book(String title) { this.title = title; } 
        }

public class JAVA_test {

    public static void main(String[] args) {
        
            // 인스턴스 1
            Book b1 = new Book("Java Basics"); // b1 만들어짐
            
            // 인스턴스 2
            Book b2 = new Book("OOP Concepts"); // b2 만들어짐
        
            // 인스턴스 3
            Book[] library = new Book[3];  // [ null, null, null] 3칸짜리 배열 생성
        
            // 인스턴스 3
            library[0] = b1;        // [ b1, null, null] 3칸짜리 배열
            // 인스턴스 4
            library[1] = new Book("Data Structure");    // [ b1, 새로운 거 생성, null] 3칸짜리 배열
        
            // 인스턴스 4
            Book b3 = library[1];       // b3 에 new Book("Data Structure"); 이거 들어감 
        
            // 인스턴스 2
            b2 = library[0];            // b2 를 b1 으로 업데이트  (b2 삭제) [ b1, "Data Structure", null] 3칸짜리 배열 
            // b2 = new Book("OOP Concepts");
            // library[0] = b1 = new Book("Java Basics");
            // b2 = new Book("Java Basics");
            // b2 = new Book("OOP Concepts");  ->  b2 = new Book("Java Basics");

            // 인스턴스 3
            Book[] archive = library;  // 이건 archive [b1, "Data Structure", null] 3칸짜리 배열
            // 인스턴스 5
            archive[2] = new Book("Algorithm");     // [b1, "Data Structure", 새로운 거 생성] 3칸짜리 배열
        
            // 인스턴스 3
            library[0] = null;      // [ b1 에서 null로 변경, "Data Structure", null] 3칸짜리 배열
            // 인스턴스 1
            b1 = null;              // b1 도 null로 변경


            System.out.println("123");

            // 최종 모습

            // [1] b1 = null;
            // [2] b2 = b1;
            // [3] b3 = new Book("Data Structure");
            // [4] library[] = [ null, "Data Structure", ""]
            // [5] archive[] = [b1, "Data Structure", "Algorithm"]


            // ===== 프로그램 실행 종료 직전 (Final State) =====
            // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 
            // Ans. 5개

            // main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
            // Ans. 유효 4개 , 사라짐 1개












    }
}
