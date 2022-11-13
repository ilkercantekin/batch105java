package soru_Cozumlerim;

import java.util.Scanner;

public class BolumSonucunuDoubleyazdir {
    public static void main(String[] args) {
        System.out.println("lütfen bir ondalıklı sayı giriniz :  ");
        Scanner scan=new Scanner(System.in);
        double sayi1= scan.nextDouble();
        System.out.println(" lütfen bir tam sayı giriniz:   " );
        int sayi2= scan.nextInt();

        System.out.println(" istenilen bölüm tamsayı :" + (int)(sayi1/sayi2));
    }
}
