package ders13_nestedForLoop_methodolusturma;

import java.util.Scanner;

public class C08_methodOlusturma {
    public static void main(String[] args) {
        /* kullnıcıdan 2 sayı alıp bunların toplamınnı yazdıran bir mteod olusuturun
                 */
 isteToplaYazdir();
 isteToplaYazdir();

    }
    public static void isteToplaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayi1= scan.nextDouble();;
        double sayi2= scan.nextDouble();;
        System.out.println("girilensayıların toplamı : " + (sayi2+sayi1));
    }


}
