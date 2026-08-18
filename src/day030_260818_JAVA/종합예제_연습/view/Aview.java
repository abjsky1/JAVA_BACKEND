package day030_260818_JAVA.종합예제_연습.view;

import java.util.ArrayList;
import java.util.Scanner;

import day030_260818_JAVA.종합예제_연습.controller.Acontroller;
import day030_260818_JAVA.종합예제_연습.model.dto.Adto;

public class Aview {

    private Aview(){}
    private static final Aview instance = new Aview();
    public static Aview getInstance(){return instance;}

    private Acontroller ac = Acontroller.getInstance();

    Scanner scan = new Scanner(System.in);
    
    public void findingAway(){
        
        for(;;){

        System.out.println("=======경로찾기======");
            System.out.println("1.최단경로  2.***  3.***  4.***  5.***  0.돌아가기");
            System.out.println("=============");
            System.out.print("입력 >> ");

            String i = scan.next();

            if(i == "1"){}
            else if(i == "2"){}
            else if(i == "3"){}
            else if(i == "4"){}
            else if(i == "5"){}
            else if(i == "0"){System.out.println("시스템 종료"); break;}
            else{System.out.println("다시 입력해주세요.");}

        }

    }


    public void shortest(){

        System.out.println("출발지를 입력하세요 >> ");
        String 출발지 = scan.next();
        System.out.print("도착지를 입력하세요 >> ");
        String 도착지 = scan.next();

        Adto adto = new Adto(출발지, 도착지);

        ArrayList<String> result = ac.shortest(adto);

        for( String a : result){
            


        }



    }




}
