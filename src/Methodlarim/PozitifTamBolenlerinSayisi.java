package Methodlarim;

import java.util.Scanner;

public class PozitifTamBolenlerinSayisi {

    static int sayi;

    public static void main(String[] args) {
//Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
//bolenleri sayisini bulup bize donduren bir method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayıyı giriniz");
        int sayi = scan.nextInt();
        System.out.println("girilen sayının pbs= "+pztbs(sayi));
    }

    public static int  pztbs(int sayi) {
        int sayac = 0;
        int yenisayi = 0;
        for (int i = 2; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac ++;
                yenisayi = sayi / i;
                }
                while (yenisayi % i == 0) {
               yenisayi=yenisayi/i;  sayac ++;
                    if (yenisayi% i==0) sayac++;
                }
            }
        return sayac;
    }
}
















