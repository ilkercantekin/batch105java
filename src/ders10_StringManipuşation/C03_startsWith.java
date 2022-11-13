package ders10_StringManipuşation;

public class C03_startsWith {
    public static void main(String[] args) {
        String  str="manti açarken java öğrenilmez";
        System.out.println( str.startsWith("Manti")); // false
        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("manti açarken java öğrenilmez"));//true
        System.out.println(str.startsWith(""));//true yazar çünkü m den önce hiçlik var
        str.startsWith("açarken",6); // true
        System.out.println(str.startsWith("açarken",6));//true
        System.out.println(str.startsWith("manti",0));//true
        System.out.println(str.startsWith("javai",10));//false

    }
}
