package ders06_ifElseStatement;

import java.util.Scanner;

public class c10_ifElseIfcinsyas {
    public static void main(String[] args) {
        /* Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("cinsiyetinizi girinz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("yaşınız giriniz");

        double yas = scan.nextDouble();

        if ((cinsiyet == 'E' || cinsiyet == 'e') && yas > 65) {
            System.out.println("emekli olabilirsin");
        } else if ((cinsiyet == 'E' || cinsiyet == 'e') && yas < 65 && yas > 15) {
            System.out.println("emekli olmak için" + "  " + (65 - yas) + "  " + "sene çalışmalısın");
        } else if ((cinsiyet == 'K' || cinsiyet == 'k') && yas > 60) {
            System.out.println("emekli olabilirsin");
        } else if ((cinsiyet == 'K' || cinsiyet == 'k') && yas < 60 && yas > 15) {
            System.out.println("emekli olmak için" + ", " + (60 - yas) + " " + "sene çalışmalısın");

        } else {
            System.out.println("geçersiz giriş");
        }

    }
}




