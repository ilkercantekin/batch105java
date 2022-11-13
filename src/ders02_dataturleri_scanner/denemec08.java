package ders02_dataturleri_scanner;

import java.util.Scanner;

public class denemec08 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // sadece götüntü değiştirme için bellekte değişmez

        System.out.println("1.tamsayıyı giriniz: ");
        int sayi1=scan.nextInt();
        System.out.println("lutfen 2. tam sayıyı giriniz");
        int sayi2=scan.nextInt();
        System.out.println("1.sayı:" + sayi2);
        System.out.println("2.sayı:" + sayi1);
    }
}
