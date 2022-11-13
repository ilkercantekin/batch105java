package ders15_OverLoading_whileloop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan toplanmak üzere tamsayılar alın
        kullanıcı sıfıra basarsa sayı alma işlemini bitirin
        kullanıcınn kaç sayı girdiğini ve
         bu sayıların toplamının kaç oldugunu yadrırn
         */
        Scanner scan=new Scanner(System.in);
int girilensayi=5; // verilen ik deger bu soru için sıfır olmamalı
        // çünkü 0 loop u bitirmek için kullanılacak
        int sayac=0;
        int toplam=0;

        while (girilensayi!=0) {
            System.out.println("lütfen toplamak için tamsayı girin" +
                    "\nbitirmek için sıfıra basın");
            girilensayi= scan.nextInt();
        if (girilensayi!=0){
            sayac++;
            toplam=toplam+girilensayi;
        }


    }
        System.out.println("girilen  "+ sayac+" adet sayının  toplamı  " + toplam);
}}
