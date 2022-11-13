package ders12_forLoops;

public class C02_forLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
 // ikii basamaklı ayılrdan 7 ile bölünebillenleri yanyana yazdırın
        for (int i = 10; i <100 ; i++) {
            if ( i%7==0) System.out.print(i + " ");
        }
        System.out.println("");
// 13 den başlayıp 100 e kadar 7 şer 7 şer artırıp yazdıralım
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i+ " ");
        }
        System.out.println("");
//  1 den 10 kadar sınırlar dahil sayıların karelerini yazdırın
        for (int i = 1; i <=10 ; i++) {
            System.out.print( i*i + " ");

        }

    }
}
