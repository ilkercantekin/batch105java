package soru_Cozumlerim;

import java.util.Scanner;

public class ayYazdirma {
    public static void main(String[] args) {
        // girilen bir harf ile başlayan ay yazdırın
        System.out.println("bir harf giriniz :");
        Scanner scan=new Scanner(System.in);
        char harf=scan.next().charAt(0);
        if (harf=='A') {  // if(harf=='A' || harf=='a') şeklindede yazılabilir
            // ki if sayısı yarıyarıya azalır
             System.out.println("AY:" + " " + "ARALIK");
        }

        if  (harf=='o' || harf=='O') {
            System.out.println("AY:" + "OCAK");
        }

        if (harf=='S'|| harf=='s') {
            System.out.println("AY:" + " " + "ŞUBAT");
        }

               if (harf=='M'|| harf=='m') {
            System.out.println("AY:" + " " + "MART veya Mayıs");
        }

        if (harf=='N'|| harf=='n') {
            System.out.println("AY:" + " " + "NİSAN");
        }

        if (harf=='H'|| harf=='h') {
            System.out.println("AY:" + " " + "HAZİRAN");
        }


        if (harf=='a'|| harf=='A') {
            System.out.println("AY:" + " " + "ARALIK veya AĞUSTOS");
        }
        if (harf=='E'|| harf=='e') {
            System.out.println("AY:" + " " + "EYLÜL veya EKİM");
        }

        if (harf=='K'|| harf=='k') {
            System.out.println("AY:" + " " + "KASIM");
        }
        if (harf=='K'|| harf=='k' ||harf=='E'|| harf=='e' || harf=='a'|| harf=='A' ||  harf=='o'|| harf=='O'
                || harf=='S'|| harf=='s'|| harf=='M'|| harf=='m'|| harf=='N'|| harf=='n'|| harf=='H'|| harf=='h'
                || harf=='a'|| harf=='A' ||harf=='E'|| harf=='e') {
            System.out.println("tebrikler");}
        else { System.out.println("bu harfle başlayan bir ay yoktur");    }

        }





    }


