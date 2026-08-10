package day025_260810_JAVA.종합예제.model.dto;

public class BoardDto {

    // DTO : 데이터 이동객체
        
        // - 자바는 저장소 아님.

        // - 즉 데이터베이스(저장소)가 저장소

        

    // 1. 데이터베이스 표에서 (CRUD) 사용할 자료들을 private 멤버변수로 구성
    private String content;
    private String writter;


    // 2. 기본생성자, 전체매개변수 생성자
    public BoardDto(){}

    public BoardDto(String content, String writter) {
        this.content = content;
        this.writter = writter;
    }

    // 3. setter and getter , toString
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }

    @Override
    public String toString() {
        return "BoardDto [content=" + content + ", writter=" + writter + "]";
    }

    

    
    
    
    

    

    

    

}
