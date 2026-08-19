package day031_260819_JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class JAVA_practice14 {

    // Scanner 를 한번만 소환해서 쓸 수 없는가


    public static void main(String[] args) {
        
        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
            
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1.위치찾기 2.입차 3.출차 선택: 0.시스템종료");
            int ch = scan.nextInt();
            if( ch == 1 ){ findCarLocation(carParkingList); } // 위치찾기 구현 
            if( ch == 2 ){ carParkingList = 입차처리(carParkingList); } // 입차 구현 
            if( ch == 3 ){ carParkingList = 출차처리(carParkingList); } // 출차 구현
            if( ch == 0 ){ break; } // 시스템 종료
        }
        
        /*
        [ 문자열 실습 ] 타워 주차 관리 시스템 데이터 처리
         
        1. 문제 개요
        주차장 관제 시스템에서 관리 중인 차량 데이터(carParkingList)는 단일 String으로 관리되고 있습니다. 
        이 데이터를 기반으로 입차, 출차, 내 차량 위치 찾기 기능을 구현하세요.
        단) 새로운 클래스 만들지 않습니다.
        
        2. 데이터 규격
        데이터 구분자:
        행(객체/차량) 구분: 줄바꿈 문자 (\n)
        열(속성) 구분: 쉼표 (,)
        컬럼 순서: 위치번호,차량번호,날짜시간(YYYYMMDDhhmm)
        
        초기 데이터 예시:
        String carParkingList = "3,211가6231,202608190930\n8,452하1234,202608171227";
        
        3. 구현 요구사항
        다음 세 기능 구현하세요. 
        ① 차량 위치 찾기 (findCarLocation)
        기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
        입력: carNumber (찾을 차량번호)
        출력/반환:
        차량이 존재할 경우: 주차 위치 번호 (예: "3")
        차량이 없을 경우: "미등록 차량" 또는 -1 반환

        ② 입차 처리
        기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
        조건:
        이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
        입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
        출력/반환:
        차량이 입차한 경우 : 주차 위치 번호 (예: "3")
        차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)
        
        ③ 출차 처리
        기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
        입력: carNumber (출차할 차량번호)
        반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
        기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
        예: 31분 ~ 40분 주차 -> 1,000원   
        예: 41분 ~ 50분 주차 -> 2,000원
        일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
        각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.
        
        */


    }

    // static 이 붙어야 하는 이유 :
    // 매개변수를 입력해야 하는 이유 :
    static void findCarLocation(String carParkingList){

        Scanner scan = new Scanner(System.in);

        /*
            3. 구현 요구사항
            다음 세 기능 구현하세요. 
            ① 차량 위치 찾기 (findCarLocation)
            기능: 차량 번호를 입력받아 현재 주차된 위치 번호를 반환합니다.
            입력: carNumber (찾을 차량번호)
            출력/반환:
            차량이 존재할 경우: 주차 위치 번호 (예: "3")
            차량이 없을 경우: "미등록 차량" 또는 -1 반환
        */

        System.out.print("차량 번호 입력 >> ");
        String carNumber = scan.next();

        String[] carAry = carParkingList.split("\n");

        if(carNumber.length() == 7){}

        else if(carNumber.length() == 8){

            boolean a = true;

            for(int i = 0 ; i <= carAry.length-1 ; i++ ){

            if(carAry[i].contains(carNumber) == true){ a = false;
                System.out.printf("[%s] 차량은 [%s]번에 주차되어 있습니다.\n", carNumber , carAry[i].charAt(0)); }
            }

            if (a) {System.out.println("미등록 차량");}

        }

        else{ System.out.println("차량 번호를 정확히 입력해 주세요");}
        
    }

    // 반환타입을 String 으로 해서 return 해야 하는 이유 : 
    static String 입차처리(String carParkingList){

        Scanner scan = new Scanner(System.in);

        /* 
        ② 입차 처리
        기능: 새로운 차량의 주차 정보를 기존 데이터에 추가합니다.
        조건:
        이미 주차되어 있는 위치 번호에는 중복 주차할 수 없습니다
        입력: location (위치번호), carNumber (차량번호), dateTime (입차일시)
        출력/반환:
        차량이 입차한 경우 : 주차 위치 번호 (예: "3")
        차량이 입차가 없을 경우: 위치 번호에는 중복 주차할 수 없습니다. (위치 중복 시 입차 불가 메시지 출력)
        */

        
        String[] carAry = carParkingList.split("\n");

        ArrayList<String> carArray = new ArrayList<>();
        
        for(int i = 0 ; i <= carAry.length-1 ; i++){
            carArray.add(i, carAry[i]);
        }

        System.out.println("주차 위치 번호를 입력해 주세요.");
        String location = scan.next();
        boolean a = true;
        
        for(int i = 0 ; i <= carArray.size()-1 ; i++ ){
            if(carArray.get(i).charAt(0) == location.charAt(0)){ a = false; }
        }

        if(a){
            
            System.out.println("입차할 차량 번호를 입력해 주세요");
            String carNumber = scan.next();
                
            if(carNumber.length() == 7 || carNumber.length() == 8){

                LocalDateTime dateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yMMddHHmm");

                // dateTime.format(formatter)

                // 데이터형식 : "3,211가6231,202608190930\n8,452하1234,202608171227"

                StringBuilder builder = new StringBuilder();

                builder.append(location);
                builder.append(",");
                builder.append(carNumber);
                builder.append(",");
                builder.append(dateTime.format(formatter));
                
                String addCar = builder+"";
                carArray.add(carArray.size(), addCar);
                
            }else{ System.out.println("차량 번호를 정확히 입력해 주세요");}

        }else{System.out.println("위치 번호에는 중복 주차할 수 없습니다.");}

        String newCarParkingList = "";

        for(int i = 0 ; i <= carArray.size()-1 ; i++){
            
            newCarParkingList += carArray.get(i);

            if(i == carArray.size()-1){break;}

            newCarParkingList += "\n";
        }

        return newCarParkingList;

    }

    static String 출차처리(String carParkingList){

        /* 
        ③ 출차 처리
        기능: 출차할 차량 번호를 입력받아 해당 차량의 행을 carParkingList에서 삭제합니다.
        입력: carNumber (출차할 차량번호)
        반환: 해당 차량이 제거되고 줄바꿈이 올바르게 정리된 갱신된 carParkingList 문자열
        기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
        예: 31분 ~ 40분 주차 -> 1,000원   
        예: 41분 ~ 50분 주차 -> 2,000원
        일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
        각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.
        */

        Scanner scan = new Scanner(System.in);

        String[] carAry = carParkingList.split("\n");

        ArrayList<String> carArray = new ArrayList<>();
        
        for(int i = 0 ; i <= carAry.length-1 ; i++){
            carArray.add(i, carAry[i]);
        }

        String newCarParkingList = "";
        
        System.out.println("출차할 차량번호를 입력해 주세요");
        String carNumber = scan.next();

        if(carNumber.length() == 7){
            
        }else if(carNumber.length() == 8){

            // 차량번호 인덱스 찾기.

            boolean t = true;
            int a = 0;

            for(int i = 0 ; i <= carArray.size()-1 ; i++ ){

                // .contains( 찾을 문자 )  :  만약 찾을 문자가 존재하면 true 반환, 없으면 false 반환
                if(carArray.get(i).contains(carNumber)){ a = i; t = false; }

            }

            if (t) {System.out.printf("[%s] 차량을 찾을 수 없습니다.\n",carNumber);}

            // 요금 계산

        //  기본 정책: 최초 30분 무료추가 요금: 30분 초과 시, 10분당 1,000원 (10분 단위 절상/올림 계산)
        //  일일 최대 요금: 24시간(1일)당 최대 20,000원여러 날에 걸쳐 주차한 경우, 
        //  각 일자 단위로 계산 후 합산하거나 총 일수×20,000원 + 잔여시간 요금(최대 20,000원)을 적용합니다.
        
            carArray.get(a);
            
            // str10.substring(0,6)  ==>>  0 ~ 5 (= 6-1) 인덱스 추출

            // 8,452하1234,202608171227
            // 123456 78910 11 연12131415 월1617 일1819 시2021 분2223
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");

            int 입차연 = Integer.parseInt(carArray.get(a).substring(11, 15));
            int 입차월 = Integer.parseInt(carArray.get(a).substring(15, 17));
            int 입차일 = Integer.parseInt(carArray.get(a).substring(17, 19));
            int 입차시 = Integer.parseInt(carArray.get(a).substring(19, 21));
            int 입차분 = Integer.parseInt(carArray.get(a).substring(21, 23));

            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMdd");

            LocalDateTime dateTime1 = LocalDateTime.of(입차연, 입차월, 입차일, 입차시, 입차분);
            String 입차시간 = dateTime1.format(formatter1);
            
            LocalDateTime dateTime2 = LocalDateTime.now();
            String 출차시간 = dateTime2.format(formatter);
            

            // 200001010505
            // 123456 78 910 1112
            int 출차시 = Integer.parseInt(출차시간.substring(8, 10));
            int 출차분 = Integer.parseInt(출차시간.substring(10, 12));

            // 230분 부터 1일 사이에 2만원 첫날 30 다음날 2시간 첫날 다음날부터 마지막날 전날 까지는 다 어차피 20000원

            // 요금계산 일수 찾기

            int 일수 = 0;

            for(int i = 0 ; i <= 36500 ; i++){
                LocalDateTime result1 = dateTime1.plusDays(i);
                String 비교시간 = result1.format(formatter1);
                if(Integer.parseInt(입차시간) < Integer.parseInt(비교시간)){
                    일수 = i;
                    break;
                }                
            }

            
            int 첫날주차시간 = 0;  // 24시 빼기 입차시간

            int 마지막날주차시간 = 0;           // 출차시간

            int 첫날주차요금 = 0;

            int 마지막날주차요금 = 0;

            int 총주차요금 = 0;

            int 총주차시간 = 0;

            if(일수 == 0){

                총주차시간 = ((24-입차시)*60-(입차분))-((24-출차시)*60-(출차분));

                if (총주차시간 >= 230) { 총주차요금 = 20000; }
                else if (총주차시간 <= 30){}
                else{ 총주차요금 = (총주차시간-30)/10*1000;}

                System.out.println("주차요금 : " + 총주차요금 + "원");

            }else if (일수 >= 1) {
                
                첫날주차시간 = (24-입차시)*60-(입차분);

                마지막날주차시간 = 출차시*60+출차분;

                if (첫날주차시간 >= 230) { 첫날주차요금 = 20000; }
                else if (첫날주차시간 <= 30){}
                else{ 첫날주차요금 = (첫날주차시간-30)/10*1000;}

                if (마지막날주차시간 >= 230) { 마지막날주차요금 = 20000; }
                else if (마지막날주차시간 <= 30){}
                else{ 마지막날주차요금 = (마지막날주차시간-30)/10*1000;}

                // 일수 * 20000
                총주차요금 = 첫날주차요금 + 마지막날주차요금 + (일수-1)*20000;

                System.out.println("주차요금 : " + 총주차요금 + "원");

            }

            
        //    int 요금계산 = 일수*20000 + ;



            // 리스트에서 지우기

            for(int i = 0 ; i <= carArray.size()-1 ; i++){

                if( i < a ){

                    newCarParkingList += carArray.get(i);

                    if(i == carArray.size()-1){break;}

                    newCarParkingList += "\n";

                }
                else if( i >= a ){

                    if(i == carArray.size()-1){break;}

                    newCarParkingList += carArray.get(i+1);

                    if(i+1 == carArray.size()-1){break;}

                    newCarParkingList += "\n";

                }
            }


        }else{ System.out.println("차량 번호를 정확히 입력해 주세요");}



        

        return newCarParkingList;


    }

    

}
