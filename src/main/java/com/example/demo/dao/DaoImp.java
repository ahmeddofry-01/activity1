package com.example.demo.dao;

public class DaoImp implements IDoa{

    @Override
    public double getData() {
        System.out.println("version de Base de donne");
        double temp = 23.0;
        return temp;
    }
}
