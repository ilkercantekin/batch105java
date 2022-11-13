package soru_Cozumlerim;

import java.util.Scanner;

public class BesinKati {
    public static void main(String[] args) {
        // girilen sayını 5 in katı mıdır?
        System.out.println("lütfen bir sayı giriniz:  ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int bolum = (int) (sayi / 5);
        double sonuc = (sayi % 5);
        if (sonuc == 0) { // if (sayi%5==0) diye de kısaca yazdırılabilir
            System.out.println("Sayı 5 ile bçlünebilr :" + " bölüm: " + bolum);
        }
        if (sonuc!=0){
            System.out.println(" sayı 5 ile bölünmez");
        }
    }
}
