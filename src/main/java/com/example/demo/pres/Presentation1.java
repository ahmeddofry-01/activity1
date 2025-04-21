package com.example.demo.pres;

import com.example.demo.dao.DaoImp;
import com.example.demo.dao.IDoa;
import com.example.demo.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImp d = new DaoImp();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("res " + metier.calcul());
    }
}
