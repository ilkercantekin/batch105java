package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {
        String  str = "Java gün geçtikçe güzelleşiyor";
        System.out.println( str.substring(5,8)); // gün
        //5. indexten başlar 8-5=3 karakter yazdırı
        // 5.inedxten  dahil  8.index hariç tir
        System.out.println(str.substring(9,17));// geçtikçe
        System.out.println(str.substring(3,7));//a gu
        String  isim= "hüSEYIN";
        // VERİLEN İSMİ İLK HARFİ BÜYÜK GERİYE KALANLAR KÜÇÜK HARF OLARAK kaydedin
        isim= isim.substring(0,1).toUpperCase() + // ilk harfi alıp büyük harf yaotık
                   isim.substring(1).toLowerCase();
                System.out.println(isim);// Hüseyin
        System.out.println(isim.substring(3,4));// a
        System.out.println("cevap:"+isim.substring(2,2)); //  hiç bişey yazmaz
        // System.out.println(isim.substring(5,2)); // geri gitmez. hata verir. .StringIndexOutOfBoundsException


    }
}
