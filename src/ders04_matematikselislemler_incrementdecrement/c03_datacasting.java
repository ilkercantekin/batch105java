package ders04_matematikselislemler_incrementdecrement;

import java.util.Scanner;

public class c03_datacasting {
    public static void main(String[] args) {
        // kullanıcıdan iki int deger alıp
        // bunları biririne bölün sonucu double olarak yazdırın
        Scanner scan =new Scanner(System.in);
        System.out.println("iki tam sayı giriniz");
        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println(sayi1/sayi2);//3
        double ondalikliSonuc=(double) (sayi1/sayi2); // (double)(3)>>>3.0
        System.out.println(ondalikliSonuc);
        double dogruSonuc= (double) sayi1/sayi2; // double /int= double hangisi
        // olsa farketmezolur
        System.out.println(dogruSonuc);

    }
}
