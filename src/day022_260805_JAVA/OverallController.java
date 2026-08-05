package day022_260805_JAVA;

import java.util.Scanner;

public class OverallController {

    public static void main(String[] args) {

        Post[ ] posts = new Post[100];

        for(;;){
            System.out.println("-----------------community-----------------");
            System.out.println("1. 게시물작성  2. 게시물조회  3. 시스템종료");
            System.out.println("-------------------------------------------");
            System.out.printf("선택>>");

            Scanner scan = new Scanner(System.in);

            int select = scan.nextInt();  // 선택 완료
            scan.nextLine();

            if (select == 1) {  // 게시물 작성
                
                System.out.print("\n작성자 : ");
                String writer = scan.nextLine();
                System.out.print("\n내용 : ");
                String content = scan.nextLine();

                Post post = new Post(writer, content);
                boolean ok = false;

                for(int i = 0 ; i <= posts.length-1 ; i++){
                    if (posts[i] == null) {
                        posts[i] = post;
                        ok = true;
                        break;
                    }
                }
                
                if (ok == true) {
                    System.out.println("게시물 작성 성공");
                }
                else { System.out.println("게시물 작성 실패");}

            }

            else if (select == 2) {  // 게시물 조회

                for( Post p1 : posts){
                    if (p1 != null) {
                        System.out.printf("작성자 : %s  ,  내용 : %s\n", p1.writer, p1.content);
                    }
                }
            }

            else if (select == 3) {  // 시스템 종료
                System.out.println("시스템 종료");
                break;
            }

            else {System.out.println("잘못된 입력입니다.");}

        }


    }
}


class Post{
    String writer;
    String content;

    Post(){}

    Post( String writer, String content){
        this.writer = writer;
        this.content = content;
    }

}