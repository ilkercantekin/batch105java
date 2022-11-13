package soru_Cozumlerim;

import java.util.Scanner;

public class tekNegatifPositiftek {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=scan.nextInt();
         if (sayi%2==0) {
             // sayı cift ise 10 un katımıdır yazdır
             if (sayi%10==0) {
                 System.out.println("sayı çift ve 10un katıdır");
             }else {
                 System.out.println("sayı çifttir ama 10 un katı değildir");
             }

         } else if (sayi<0) {
             //sayı te ise pozitif veya negatif tek sayı oldugunu yazdır
             System.out.println(" negatif teksayıdır ");
            } else {
             System.out.println("sayı pozitif tek sayıdır");
         }




         }
    }

