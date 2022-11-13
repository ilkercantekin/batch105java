package soru_Cozumlerim;

import java.util.Scanner;

public class indirim {
    public static void main(String[] args) {
        //- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("müşteri kartınız var mı?");
        char kart = scan.next().charAt(0);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("liste fiyatını giriniz");
        double fiyat = scan.nextDouble();
        double odeme;

        if (kart == 'e' || kart == 'E' || kart == 'v' || kart == 'V') {
                   if (urunAdedi >= 10) {
                fiyat = (fiyat * 80 / 100);
                System.out.println("indirimli fiyatınız:" + fiyat);
                odeme=fiyat*urunAdedi;
                System.out.println("ödemeniz gereken tutar:" + odeme);
                   } else {
                fiyat = (fiyat * 85 / 100);
                System.out.println("indirimli fiyatınız: " + fiyat);
                odeme=fiyat*urunAdedi;
                System.out.println("ödemeniz gereken tutar:" + odeme);
                    }


        } else {

            if (kart == 'h' || kart == 'H' || kart == 'y' || kart == 'Y') {
                if (urunAdedi >= 10) {
                    fiyat = (fiyat * 85 / 100);
                    System.out.println("indirimli fiyatınız :" + fiyat);
                    odeme=fiyat*urunAdedi;
                    System.out.println("ödemeniz gereken tutar:" + odeme);


                } else {
                    System.out.println("İNDİRİMLİ FİYATINIZ :" + (fiyat = (fiyat * 90 / 100)));
                    odeme=fiyat*urunAdedi;
                    System.out.println("ödemeniz gereken tutar:" + odeme);
                }


            }


        }

    }


}