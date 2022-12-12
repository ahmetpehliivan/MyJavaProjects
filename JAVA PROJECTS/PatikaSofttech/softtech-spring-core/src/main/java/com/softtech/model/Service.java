package com.softtech.model;

public class Service {

    private Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }
    public void testService(){
        dao.testDao();
    }
}
