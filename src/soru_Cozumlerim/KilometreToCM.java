package soru_Cozumlerim;

import java.util.Scanner;

public class KilometreToCM {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve
        cevirmek istedigi birimi sorun, istedigi birim metre veya
         santimetre ise cevirip yazdirin, yoksa
          “istediginiz birim sisteme kayitli degil” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen KM olarak mesafeyi giriniz");
        double mesafe= scan.nextDouble();
        System.out.println("çevirmek istediğiniz birimi giriniz :");

        String birim= scan.nextLine();

        if (birim.equalsIgnoreCase("metre1" +
                "m")  || birim.equalsIgnoreCase("m")) {
            System.out.println("istenilen uzunluk metre olarak : " + (mesafe*1000) + "metre");
        } else if (birim.equalsIgnoreCase("santimetre") || birim.equalsIgnoreCase("cm")) {
            System.out.println("isstnilen uzunluk santimetre olarak :" + (mesafe*100000)+"cm");
        }else {
            System.out.println("istediğiniz birim sistemde kayıtlı değil");
        }


    }
}
