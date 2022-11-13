package soru_Cozumlerim;

import java.util.Scanner;

public class BolumunSonucununTamKisminiYazdir {
    public static void main(String[] args) {
        System.out.println("bölünecek sayıyı giriniz :");
        Scanner scan=new Scanner(System.in);
        double bolunen= scan.nextDouble();
        System.out.println("bölecek sayıyı giriniz :");
        double bolen=scan.nextDouble();

        int tamkismi= (int)(bolunen/bolen);
        System.out.println("istenilen tam kısım :  " + tamkismi);
    }
}
