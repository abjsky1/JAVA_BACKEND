package day027_260812_JAVA;

public interface KeyBoard {

    // 폴더 -> new java file -> interface 생성
    
    // 1. 상수  ,  초기값 필수
    public static final String info = "인텔";
    String date = "2026-08-12";  // public static final 기본값으로 들어감

    // 2. 추상메소드
    public abstract void aKey();
    int bkey(int x);  // public abstract 기본값으로 들어감







}
