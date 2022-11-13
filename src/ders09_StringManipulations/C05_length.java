package ders09_StringManipulations;

public class C05_length {
    public static void main(String[] args) {
        String str="uzunkavaklaraltında yataruyumazoglu";
        System.out.println(str.length()); // 34 yazar
        //son karakteri yazdırın
        System.out.println(str.charAt(33));// u yazar
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek için kullanılır
        // sondan üçüncü karakteri yazdırın
        System.out.println(str.charAt(str.length()-3));// g yazar

    }
}
