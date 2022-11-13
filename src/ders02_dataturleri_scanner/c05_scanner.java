package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c05_scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir double birde int sayıalın
        //bunların toplamını ve carpımını yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ondalık sayı giriniz");
        double ondalikliSayi=scan.nextDouble();
        System.out.println("tamsayıgiriniz");
        int tamSayi= scan.nextInt();
        System.out.println("sayı çarpımı:" + tamSayi*ondalikliSayi );

    }
}
