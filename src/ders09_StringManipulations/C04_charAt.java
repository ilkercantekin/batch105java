package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {
        String  str="Java Candır";
        System.out.println(str.charAt(0));// ilk harfi verir J
        System.out.println(str.charAt(5)); // 5. index teki char ı verrir yani C yazar(boşlukt 4.index sayılır)
        System.out.println(str.charAt(10)); // r yazar
        /*
        bir metindekşi karakter sayısı ile  son index arasında  1 fark vardır
        bu metin için karakter sayısı 11 ama son index 10 dur
         */
       // System.out.println(str.charAt(11));//  hata vereri .StringIndexOutOfBoundsException yazar



    }
}
