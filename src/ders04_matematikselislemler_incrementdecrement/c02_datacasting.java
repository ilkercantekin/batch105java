package ders04_matematikselislemler_incrementdecrement;

import java.util.Scanner;

public class c02_datacasting {
    public static void main(String[] args) {
        /* Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya
         bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolmeSonucuTamsayi= (int) (sayi1/sayi2);
        System.out.println(bolmeSonucuTamsayi);



    }
}
