package ders09_StringManipulations;

public class c02_equals {
    public static void main(String[] args) {
        String  str1= "Ali";
        String str2="ali";
        String str3= new String("Ali");
        String  str4="Ali";
        System.out.println(str1==str2);// false yazar
        System.out.println(str1==str3);// false yazar
        System.out.println(str1==str4);// true yazar
        /*
        == String leri karşılaştırırken beklediğimiz sonuçları vermeyebilr
        Stringlerde metinlerin aynı  olup olmadığını karşılaştırmak için == yerine equals() kullanılır.
         */

        System.out.println(str1.equals(str2));// false yazar so
        System.out.println(str1.equals(str3)); // true yazar
        System.out.println(str1.equals(str4));// true yazar
    }
}
