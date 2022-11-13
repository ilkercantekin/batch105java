package ders12_forLoops;

public class C05_Dikkatedilecekler {
    public static void main(String[] args) {
      /*sonsuz loop
        for (int i = 0; i >-1 ; i++) {

            System.out.print(i+"");*/

        //  for (int i = 0; i > 10; i++) {  // for loop çalışır ilk deger için bitiş sartı true olmuyorsa
        // for body si hiç devreye girmez
        //System.out.println(i); hiç bişey yazmaz.

        // kullanıcınn verdiği bir sayının asal olup olmadıgını bulun

        int sayi = 100;
        boolean asalMi = true;
        for (int j = 2; j <= sayi - 1; j++) {
            if (sayi % j == 0) {
                // bir tane bile bölen sayı
                asalMi = false;
                break;// bir loop un sonunu beklemeden bitirmek istersek
            }
        }
        System.out.println(sayi);
        if (asalMi) {
            System.out.println("asal ");
        } else {
            System.out.println("asal sayı değildır");
        }



        }
    }










