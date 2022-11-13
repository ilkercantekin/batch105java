package soru_Cozumlerim;

import java.util.Scanner;

public class UcSayininOrtalmasi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("üç adet tamsayı giriniz :");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int sayi3=scan.nextInt();
        System.out.println("verilen sayıların ortalamsı: " + (double)(sayi1+sayi2+sayi3)/3);

    }
}
