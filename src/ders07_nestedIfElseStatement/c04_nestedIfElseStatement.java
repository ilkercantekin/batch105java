package ders07_nestedIfElseStatement;

import java.util.Scanner;

public class c04_nestedIfElseStatement {
    public static void main(String[] args) {
        /*
        * Kullanicidan cinsiyetini ve yasini alin,
        * Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        * Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin .*/

        // ana değişken yaş olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        double yas=scan.nextDouble();

        System.out.println("lütfen cinsiyeti giriniz");
        char cinsiyet=scan.next().charAt(0);

        if (yas<15) {
            System.out.println("hatalı yaş girişi");
    } else if (yas<60) {
            // emekli olamaz çalışması gereken sure cinsiyte bağlı
            System.out.println("emekli olamazsın");
            if (cinsiyet=='k' || cinsiyet=='K') {
                System.out.println("daha" + (60 - yas) + "sene çalışmalısın");
            }else if (cinsiyet=='e' || cinsiyet=='E'){
                System.out.println("daha" + (65 - yas) + "sene çalışmalısın");
            }else {
                System.out.println("hatalı cinsiyet girişi");
            }

        } else if ( yas<65) {
            //kadın ise emekli olabilir erkekse çalışması lazım
                if (cinsiyet=='k' || cinsiyet=='K') {
                    System.out.println("emekli olabilirsiniz");
                } else if (cinsiyet=='e' || cinsiyet=='E') {
                    System.out.println("daha" + (65 - yas) + "sene çalışmalısın");
                }else {
                    System.out.println("hatalı cinsiyet girişi");
                }

            }else { // 65 den büyükse
            System.out.println("emekli olabilirsin");
            }

    }
    }
