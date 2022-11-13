package ders08_ternary_switch;

public class c03_ternary {
    public static void main(String[] args) {
        // ternary operatörü tek başına kullanılamaz
        //ternary bize sonuç üretir
        //bu sonucu ya direk yazdırmalı veya bir variable atamamlıyız
        int a=5;
        String sonuc=a%2==0 ? "çift sayı": "tek sayı";
        System.out.println(sonuc);
                // ternary nin sonucunu bir varibaleye atayacaksak tru ve false durumlarında
        // üretilecek sonucun aynı data türüne uygun olmalı gerekir.ama ternary'i sout icinde kullanirsak
        // sonuclarin data turunun ayni olmasi sart olmaz
        // aksi halde CTE oluşur
        //String sonuc2= a>10 ? "büyük sayı" : 2*a; // CTE :cmpile time error altını kırmızı çizmesi
        String sonuc2= a>10 ? "büyük sayı" : "" + 2*a; //Cte vermemesii için stringe cevirdik

        System.out.println(a>10 ? "büyük sayı" : 2*a);
    }
}
