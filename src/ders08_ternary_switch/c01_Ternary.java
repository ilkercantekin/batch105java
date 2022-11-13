package ders08_ternary_switch;

import java.util.Scanner;

public class c01_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alın
        //sayı pozitif ise iki katını yazdırın
        //sayı poz degilse sayıya 10 ekleyip yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();
        if (sayi>0) {
            System.out.println(sayi * 2);
        }else {
            System.out.println(sayi+10);}

         // TERNARY İLE aşağıdaki gibi
        System.out.println(sayi>0? sayi*2: sayi+10);
}}
