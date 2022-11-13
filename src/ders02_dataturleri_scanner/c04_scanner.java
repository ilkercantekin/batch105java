package ders02_dataturleri_scanner;

import java.util.Scanner;

public class c04_scanner {
    public static void main(String[] args) {

        // kullanıcıdan isimini alıp büyük ahrlerle yazdırın
        // 1.adım scan objesi oluşturma
        Scanner scan = new Scanner(System.in);
        // 2.adım kullanıcıya ne istedigmixi yazdırma
        System.out.println("adınızı giriniz");
        // 3.adım kullanıcıdan istdgmz bilginin türüne uygun bir variable olusturup
        // scanner methodlarından uygun olanını kullarak alınan değeri vaiableye atayalım
        String kullaniciAdi= scan.next();
        System.out.println(kullaniciAdi.toUpperCase());
    }
}
