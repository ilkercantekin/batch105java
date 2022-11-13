package ders04_matematikselislemler_incrementdecrement;

public class c07_Pre_Post_Increment {
    public static void main(String[] args) {
        int a=10;
        int b= a++;// b=11 ve a=11
        int c= ++b;// c=11
        System.out.println("a :" + a + ", b :" + b + ", c :" + c);
        // a: 11 b: 11 c: 11 yazmalı

        a=20;
        b=++a;
        c=a++;
        System.out.println("a :" + a + ", b :" + b + ", c :" + c);

        a=30;
        System.out.println(a++);// a=30 yazar sonra a=31
        System.out.println(--a);// a=30 y apıp yazar
        System.out.println(a--);// a=30 yazar sonra a=29
        System.out.println(a);// a=29 yazar
    }
}
