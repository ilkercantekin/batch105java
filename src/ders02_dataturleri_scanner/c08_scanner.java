package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c08_scanner {
    public static void main(String[] args) {
        //kullanıcıdan ikisayı alıpdegerlerrinideğiiiştirin
        Scanner scan= new Scanner(System.in);
        System.out.println("1.tamsayıyı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("lutfen 2. tam sayıyı giriniz");
        int sayi2=scan.nextInt();
        int sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.println("sayı1 :" +sayi1);
        System.out.println("sayı2:" + sayi2);


    }
}
