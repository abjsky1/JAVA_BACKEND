package day023_260806_JAVA;

import java.net.Socket;
import java.util.Scanner;

public class JAVA_memoryDesign {

    public static void main(String[] args) {
        
        신청서[] 신청서함 = new 신청서[10];

        Scanner scan = new Scanner(System.in);

        신청서 신청서작성함수호출 = new 신청서();

        for(;;){

        System.out.println("---------- 신청서 등록 ----------");
        System.out.println("1. 신청서작성   2. 신청서조회");
        System.out.println("---------------------------------");
        System.out.print("선택 >> ");

        int 번호 = scan.nextInt();

        신청서작성함수호출.신청서관리함수(번호);

        }    
           
           
           

    }
}


class si{

    String siName;
    int scode;

}

class dong{

    String dongName;
    int dcode;

}

class 동물종류 {

    int tcode;
    String tname;

}

class 보호소 {

    int shcode;
    String shname;

}

class 신청서 {

    int fcode;
    String fname;
    String fnumbers;
    int ffamily;
    boolean fexp; // 반려동물 경험 있음 1 , 반려동물 경험 없음 0
    String freason;
    boolean acode; // 동의 1 , 비동의 0
    int pcode;
    int dcode;
    int scode;

    신청서(){}

    // [생성자]
    public 신청서(int fcode, String fname, String fnumbers, int ffamily, boolean fexp, String freason, boolean acode, int pcode,
            int dcode, int scode) {
        this.fcode = fcode;
        this.fname = fname;
        this.fnumbers = fnumbers;
        this.ffamily = ffamily;
        this.fexp = fexp;
        this.freason = freason;
        this.acode = acode;
        this.pcode = pcode;
        this.dcode = dcode;
        this.scode = scode;
    }

    // [메소드]
    
    // 반환 O   --  *반환타입명 함수명(타입 매개변수){  return *반환타입}

    // 반환 = return 

    // 반환 X   --  void 함수명

    void 신청서관리함수(int x){

        신청서[] 신청서함 = new 신청서[10];

        Scanner scan = new Scanner(System.in);

            if (x == 1) {

                System.out.println("int fcode 작성 : ");
                int fcode = scan.nextInt();
                System.out.println("String fname 작성 : ");
                String fname = scan.next();
                System.out.println("String fnumbers 작성 : ");
                String fnumbers = scan.next();
                System.out.println("int ffamily 작성 : ");
                int ffamily = scan.nextInt();
                System.out.println("boolean fexp 작성 : ");
                boolean fexp = scan.nextBoolean();
                System.out.println("String freason 작성 : ");
                scan.nextLine();
                String freason = scan.nextLine();
                System.out.println("boolean acode 작성 : ");
                boolean acode = scan.nextBoolean();
                System.out.println("int pcode 작성 : ");
                int pcode = scan.nextInt();
                System.out.println("int dcode 작성 : ");
                int dcode = scan.nextInt();
                System.out.println("int scode 작성 : ");
                int scode = scan.nextInt();
                
                신청서 sin = new 신청서(fcode , fname , fnumbers , ffamily, fexp , freason , acode , pcode , dcode , scode);

                boolean 신청서작성성공여부확인 = false;

                for(int i = 0 ; i <= 신청서함.length-1 ; i++){

                    if(신청서함[i]==null){
                        신청서함[i] = sin;
                        신청서작성성공여부확인 = true;
                        break;
                    }

                }

                
                if   (신청서작성성공여부확인)   {System.out.println("신청서 작성 성공");}
                else {System.out.println("신청서 작성 실패");}
                

            }

            else if(x == 2){

                for(int i = 0 ; i <= 신청서함.length-1 ; i++){

                    if (신청서함[i] != null) {
                        System.out.printf("%d %s %s %d %b %s %b %d %d %d", 신청서함[i].fcode , 신청서함[i].fname , 신청서함[i].fnumbers , 신청서함[i].ffamily, 신청서함[i].fexp , 신청서함[i].freason , 신청서함[i].acode , 신청서함[i].pcode , 신청서함[i].dcode , 신청서함[i].scode);
                    }
                    
                }



            }

        }

    }
    



    


class petInfo{

    int pcode;
    String pname;
    int pgender;
    int pkg;
    int page;
    String pimg;
    String ppersonality;
    int pjoong;
    int pyeah;
    String pdate;
    int shcode;
    String pcomment;
    int scode;
    int dcode;
    int tcode;
    
    public petInfo(int pcode, String pname, int pgender, int pkg, int page, String pimg, String ppersonality,
            int pjoong, int pyeah, String pdate, int shcode, String pcomment, int scode, int dcode, int tcode) {
        this.pcode = pcode;
        this.pname = pname;
        this.pgender = pgender;
        this.pkg = pkg;
        this.page = page;
        this.pimg = pimg;
        this.ppersonality = ppersonality;
        this.pjoong = pjoong;
        this.pyeah = pyeah;
        this.pdate = pdate;
        this.shcode = shcode;
        this.pcomment = pcomment;
        this.scode = scode;
        this.dcode = dcode;
        this.tcode = tcode;
    }

}





