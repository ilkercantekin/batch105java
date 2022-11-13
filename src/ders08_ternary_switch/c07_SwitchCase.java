package ders08_ternary_switch;

import java.util.Scanner;

public class c07_SwitchCase {
    public static void main(String[] args) {

        // J: Java
        // D:Development
        // K: Kit
        // kullanıcıdan bir harf alın
        // alınan harf J,D,K dan biri ise  yukardaki kelimeleri yazdırın
        // bu harflerden biri değilse "Geçersiz harf " yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütefn bir harf giriniz");
        char harf=scan.next().charAt(0);
        switch (harf) {
            case  'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("geçersiz harf");
        }


    }
}
