package soru_Cozumlerim;

import java.util.Scanner;

public class hesapMakinesi1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("************\nHesap Makinesi\n"+"--------------\n" +
                "Toplama işlemi için +'ya basınız\n"+
                "Cıkarma(eksiltme) işlemi için -'ye basınız\n"+
                "Bolme işlemi için /'ye basınız\n"+
                "Çarpma işlemi için *'ya\n"+
                "\t\t\t\t\tBeta Version 1.0\n"+
                "********************************");


        System.out.println("lütfen ilk sayıyı girin");
        double sayi1= scan.nextDouble();
        System.out.println("lütfen ikinci yayı girin");
        double sayi2= scan.nextDouble();
        System.out.println("lütfen yapmak istediğiniz işlemi seçin");
        char islem= scan.next().charAt(0);
        double sonuc=0;

        if( islem=='+') {
            System.out.println("toplama işlemi yaptınız. Sonuc :" + (sayi1+sayi2));

        }else if(islem=='-'){
            System.out.println("çıkarma işlemi yaptınız. Sonuc :" + (sayi1-sayi2));
        }else if(islem=='/'){
            System.out.println("Bölme işlemi yaptınız. Sonuc :" + (sayi1/sayi2));
        }else if(islem=='*'){System.out.println("Çarpma işlemi yaptınız. Sonuc :" + (sayi1*sayi2));
        }
        else {
            System.out.println("hatalı işlem");
        }

    }
}
