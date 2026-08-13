package 종합예제.model.dao;

import java.util.ArrayList;

public class BoardDao implements IBaseDao {
    private BoardDao() {
    }

    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance() {
        return instance;
    }

    private ArrayList<Object> boardList = new ArrayList<>();

    // TODO 1: IBaseDao의 save() 메서드를 오버라이딩하여 boardList 저장하는 로직 작성

    @Override
    public boolean save(Object obj) {
        boardList.add(obj);
        return true;
    }

    // BoardDto 라는 class
    // Object 라는 class

    // Object 최상위
    // BoardDto 하위  ^^ 업캐스팅 자동 타입 변환. 문제가 안 생김.
    



    // TODO 2: IBaseDao의 findAll() 메서드를 오버라이딩하여 boardList를 반환하는 로직 작성
    @Override
    public ArrayList<Object> findAll() {

        return boardList;

    }

}