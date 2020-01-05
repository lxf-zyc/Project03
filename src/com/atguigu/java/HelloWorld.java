package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("hellowworld");
//        List list
        Date date2 = new Date();
        System.out.println(date2);

    }
    public static void method1(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
