package ders12_forLoops;

public class C04_rakamlarToplamı {
    public static void main(String[] args) {

        // kullnıcın verdiği sayının rakamlar toplamını bulun

        int sayi=148564753; // basamak sayısı az gelirse long yapılır

    // ama hepsi long  olmalı ve  long sayi=148564753L diye sonuna L veya l yazılır mutlaka
        String sayistr=""+sayi;

        int birlerbas=0;
        int rakamlartop=0;
        for (int i = 1; i <=sayistr.length() ; i++) {
            birlerbas=sayi%10;
            rakamlartop=rakamlartop+birlerbas;
            sayi=sayi/10;

        }
        System.out.println(rakamlartop);

        }
    }

