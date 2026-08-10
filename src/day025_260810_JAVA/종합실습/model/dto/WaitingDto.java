package day025_260810_JAVA.종합실습.model.dto;

public class WaitingDto {

    // DTO : 데이터 이동객체

    // [1] : 데이터베이스 표에서 (CRUD) 사용할 자료들을 private 멤버변수로 구성
    private int no;
    private String name;
    private int pon;

    // [2-1] : 기본생성자
    public WaitingDto(){}

    // [2-2] : 전체 매개변수 생성자
    public WaitingDto(int no, String name, int pon) {
        this.no = no;
        this.name = name;
        this.pon = pon;
    }

    // [3-1] : setter & getter
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPon() {
        return pon;
    }

    public void setPon(int pon) {
        this.pon = pon;
    }

    // [3-2] : toString
    @Override
    public String toString() {
        return "WaitingDto [no=" + no + ", name=" + name + ", pon=" + pon + "]";
    }
    
}
