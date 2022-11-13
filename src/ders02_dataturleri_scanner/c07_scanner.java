package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c07_scanner {
    public static void main(String[] args) {

        //kullanıcıın isim soyisim yas alıp
        // isim:
        //soyisim:
        //yas:
        // kaydınız basarıyla tamamlanmıştr yazdr

        Scanner scan= new Scanner(System.in);

        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        System.out.println("lutfen soy isimi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yaş giriniz");
        double yas= scan.nextDouble();

        System.out.println("isim : " + isim + "\nsoyisminiz : " + soyisim + "\nyaşınız :" + yas  + "\nkaydınız tamamlanmıştır.");




    }
}
