package com.example.demo.pres;

import com.example.demo.dao.IDoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner in = new Scanner(new File("File.txt"));
        String daoClassName = in.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDoa dao = (IDoa) cDao.newInstance();
        System.out.println(dao.getData());
    }
}
