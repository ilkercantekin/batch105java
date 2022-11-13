package ders02_dataturleri_scanner;

import java.util.Scanner;

public class dene1sorusu {
    public static void main(String[] args) {
        //kullnıcıdan iç farklı data alıp yazdırın
        System.out.println("bir tamsayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int tamsayi=scan.nextInt();
        System.out.println("bir ondalıklı sayı giriniz:");
        double oSayi=scan.nextDouble();
        System.out.println("bir isim giriniz");
        String isim = scan.nextLine();
        System.out.println("tamsayı:" + tamsayi + "\nosayi:" + oSayi + "\nisim:" + isim);
    }
}
