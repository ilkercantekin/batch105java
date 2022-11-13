package ders06_ifElseStatement;

import java.util.Scanner;

public class c01_ifstatement {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ay isminin ilk harfimini girinizi :");
        char ilkharf = scan.next().charAt(0);

        if (ilkharf == 'o' || ilkharf == 'O') {
            System.out.println("ocak");
        }
        if (ilkharf == 'o' || ilkharf == 'O') {
            System.out.println("ocak");
        }
        if (ilkharf == 'a' || ilkharf == 'A') {
            System.out.println("ARALIK veya AĞUSTOS");
        }
        if (ilkharf == 'S' || ilkharf == 's') {
            System.out.println("subat");
        }
        if (ilkharf == 'm' || ilkharf == 'M') {
            System.out.println("MART veya MAYIS");
        }
        if (ilkharf == 'T' || ilkharf == 't') {
            System.out.println("TEMMUZ");
        }
        if (ilkharf == 'H' || ilkharf == 'h') {
            System.out.println("HAZİRAN");
        }
        if (ilkharf == 'E' || ilkharf == 'e') {
            System.out.println("EYLÜL veya EKİM");
        }
        if (ilkharf == 'K' || ilkharf == 'k') {
            System.out.println("KASIM");
        }
        if (ilkharf == 'N' || ilkharf == 'n') {
            System.out.println("NİSAN");
        }

    }

}