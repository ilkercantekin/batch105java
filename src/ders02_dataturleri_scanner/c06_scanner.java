package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {
        //kullanıcıdan dikdörtgenin iki kenar uzunlugunu alıp alaını yazd

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen dikdörtgenin iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasında entera basın");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        System.out.println("alan: " +(kenar1*kenar2));
    }
}
