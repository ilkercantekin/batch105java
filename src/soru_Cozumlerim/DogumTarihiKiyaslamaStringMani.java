package soru_Cozumlerim;

import java.util.Scanner;

public class DogumTarihiKiyaslamaStringMani {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen ilk doğum gununu YYYY/AA/GG olarak giriniz");

        String   tarih1= scan.next();
        System.out.println("lütfen ikinci doğum gununu YYYY/AA/GG olarak giriniz");
        String  tarih2=scan.next();

        String yenitarih1= tarih1.replaceAll("\\D", "");

        String yenitarihi2 = tarih2.replaceAll("\\D", "");

        Double tarihis1 = Double.parseDouble(yenitarih1);

        Double tarihis2 = Double.parseDouble(yenitarihi2);

        if (tarihis1 < tarihis2) {
            System.out.println("ilk girdiğiniz büyüktür.");
        } else if (tarihis1 > tarihis2) {
            System.out.println("ikinci girdiğiniz büyüktür.");

        } else {
            System.out.println("Aynı gün doğmuştur.");

        }


    }
}

