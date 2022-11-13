package ders07_nestedIfElseStatement;

public class c03_nestedfElseStatement {
    public static void main(String[] args) {
        /*
        * Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/
        char cinsiyet = 'K';
        int yas = 48;

        // nested if elese şeklinde kullanım için önce ana değişkeni seçip ona göre ana yapyı oluşturalım
        //cinsiyet ana değiişken olsun
        if (cinsiyet == 'k' || cinsiyet == 'K') {
            // giriş yapılan deger bir kadına ait demektir.
            if (yas < 15) {
                System.out.println("hatalı yaş girişi");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın " + (60 - yas) + "yıl daha çalışmalısın");
            } else {
                System.out.println("emekli olabillrisn");
            }
        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            // giriş yapılan deger bir erkek ait demektir.
            if (yas < 15) {
                System.out.println("hatalı yaş girişi");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın " + (65 - yas) + "yıl daha çalışmalısın");
            } else {
            }

        } else {
            System.out.println("yanlış giriş");
        }
    }

}