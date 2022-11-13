package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    // main method içinde kullanıcıdan iki sayı alın
    // bu iki sayıyı parametre olarak kabul edin,carpımlarını main method a  döndüren bir method olusturun

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayı giirinz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

    }

    public static double carpimMethodu (double sayi1, double sayi2){
        System.out.println(carpimMethodu(sayi1,sayi2));
        return  sayi1*sayi2;

    }

}
