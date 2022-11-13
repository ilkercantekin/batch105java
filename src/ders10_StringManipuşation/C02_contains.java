package ders10_StringManipuşation;

public class C02_contains {
    public static void main(String[] args) {
        String str="Java ile kodlama çok zevkli";
                str.contains("çok");
                        //  CharSequence = char dizisi
        System.out.println(str.contains("odla"));// true
        System.out.println(str.contains("a")); //true
        //   System.out.println(str.contains('s'));   //parameter olarak cahr kabuletmez
        System.out.println(str.contains("java")); // false çünkü küçük j != J
        String str2= "Java";
        System.out.println(str.contains(str2)); //true
        String str3="234 Ali Can ";
        // str3.contains(2);   kabul etmez 2 string değil
        str3.contains("2"); //true yazar


    }
}
