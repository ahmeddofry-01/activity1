package com.example.demo.dao;

public class DaoImpV2 implements IDoa{

    @Override
    public double getData() {
        System.out.println("version Web Service");
        return 41;
    }
}
