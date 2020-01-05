package com.atguigu.java;

/**
 * @author lxf
 * @date 2020/1/4-16:17
 * 常用的模板
 */
public class Templatetest {

    //模板1  ：main   psvm
    public static void main(String[] args) {
        //模板二 ：sout
        System.out.println();
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        //模板三
        String[] arr = new String[]{"1","2","3"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];

        }
    }


}
