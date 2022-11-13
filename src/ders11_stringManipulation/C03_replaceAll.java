package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String  str="J1ava2 G9üzell5dir8";
        // str deki rakamlatrı kaldırıp metin haline cevirin
        // str.replaceAll  sadece bir harf veya char sequence değil genelleme ile söyleyebileceğimiz
        // ortak özellikteki tüm karakterleri değiştirir
        System.out.println(str.replaceAll("\\d",""));//Java Güzelldir  sadece  digit olmayan // karakterleri alır
        System.out.println(str.replaceAll("\\D",""));//12958 sadece digitleri
        String s1= "ilk ürün fiyatı : 1250 tl";
        String s2= "ikinci urun fiyati : 1500 tl";
        // iki urunun fiyatini toplayin
        s1=s1.replaceAll("\\D",""); // "1250"
        s2= s2.replaceAll("\\D",""); // "1500"

        System.out.println(s1+s2); // 12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 2750

    }
}
