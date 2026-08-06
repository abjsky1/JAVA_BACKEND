package day023_260806_JAVA;

public class JAVA_memoryDesign {

    public static void main(String[] args) {
        



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
    int ffmaily;
    int fexp; // 반려동물 경험 있음 1 , 반려동물 경험 없음 0
    String freason;
    int acode; // 동의 1 , 비동의 0
    int pcode;
    int dcode;
    int scode;

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





