package soru_Cozumlerim;

import java.util.Scanner;

public class SayıyıByteDonustur {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        double sayi=scan.nextDouble();
        byte yenisayi;
        yenisayi=(byte) sayi;
        System.out.println(yenisayi);
    }
}
