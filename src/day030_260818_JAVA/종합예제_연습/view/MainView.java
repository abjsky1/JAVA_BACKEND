package day030_260818_JAVA.종합예제_연습.view;

import java.util.Scanner;

public class MainView {

    private MainView(){}
    private static final MainView instance = new MainView();
    public static MainView getInstance(){return instance;}

    private Aview av = Aview.getInstance();

    Scanner scan = new Scanner(System.in);

    public void run(){

        while(true){

            System.out.println("=============");
            System.out.println("1.경로찾기  2.***  3.***  4.***  5.***  0.시스템종료");
            System.out.println("=============");
            System.out.print("입력 >> ");

            String i = scan.next();

            if(i == "1"){av.findingAway();}
            else if(i == "2"){}
            else if(i == "3"){}
            else if(i == "4"){}
            else if(i == "5"){}
            else if(i == "0"){System.out.println("시스템 종료"); break;}
            else{System.out.println("다시 입력해주세요.");}


        }


    }


}
