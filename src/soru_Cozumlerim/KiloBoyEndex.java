package soru_Cozumlerim;

import java.util.Scanner;

public class KiloBoyEndex {
    public static void main(String[] args) {
        /*
        Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
           hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
         obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
          zayif yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kilonuzu giirniz");
        double kilo=scan.nextDouble();
        System.out.println("boyunuzu giriniz");
        int boy=scan.nextInt();
        double endex=(kilo*10000/(boy*boy));

        if (endex>=30) {
            System.out.println("obezsin canım");}
        else if (endex>=25){
            System.out.println("kilolusunuz dikkat edin");}
        else if (endex>=20) {
            System.out.println("normalsiniz");}
        else {
            System.out.println("zayıfsınız");}

        }
    }


