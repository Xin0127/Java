package org.example.util;

public class Main {
    public static void main(String[] args) {
        System.out.println(t1());
    }

    public static int t1(){

        try {
            System.out.println(1);
            int i = 1/0;
            System.out.println(2);
            return 3;
        } catch (Exception e) {
            e.printStackTrace();
            return 4;
//        } finally {
//            return 5;
        }
    }
}
