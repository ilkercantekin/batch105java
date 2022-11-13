package soru_Cozumlerim;

import java.util.Scanner;

public class KMtoCM {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve
        cevirmek istedigi birimi  sorun, istedigi birim metre veya
         santimetre ise cevirip yazdirin, yoksa
         “istediginiz birim sisteme kayitli degil” yazdirin.*/
        Scanner scan=new Scanner(System.in);


        System.out.println("lütfen KM olarak mesafeyi giriniz");
        double mesafe= scan.nextDouble();
        System.out.println("çevirmek istediğiniz birimi" +"\nmetre için 1 giriniz :" + " \nsantimetre için 2 giriniz");
        double sonuc1,sonuc2;
        sonuc1=(mesafe*1000);
        sonuc2=(mesafe*100000);

      int birim= scan.nextInt();
        System.out.println(birim==1 ? "istenilen uzunluk çevirimi " + sonuc1 + " metre" :
                birim==2 ? "istenilen uzunluk çevirimi " + sonuc2 + " santimetre" : "istediğiniz birim sisteme kayıtlı değil");
       }


       }


