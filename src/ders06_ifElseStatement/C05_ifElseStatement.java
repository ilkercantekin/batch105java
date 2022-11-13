package ders06_ifElseStatement;

import java.util.Scanner;

public class C05_ifElseStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınız giriniz");
        double yas=scan.nextDouble();
        if (yas>65) {
            System.out.println("yaşınız emeklilik için yeteerli");
        }
        else {
            System.out.println( "emekli olmak için " + (65-yas) + " sene daha çalışmalsınız");}

    }
}
