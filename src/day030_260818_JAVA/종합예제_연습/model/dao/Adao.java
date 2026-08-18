package day030_260818_JAVA.종합예제_연습.model.dao;

import java.util.ArrayList;

public class Adao implements IBaseDao{

    private Adao(){}
    private static final Adao instance = new Adao();
    public static Adao getInstance(){return instance;}

    @Override
    public ArrayList<Object> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean save(Object obj) {
        // TODO Auto-generated method stub
        return false;
    }

    

}
