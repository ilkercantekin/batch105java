package soru_Cozumlerim;

import java.util.Scanner;

public class BirHarftenSonrakiUcHarfiYazdır {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz : " );
        char harf= scan.next().charAt(0);
        System.out.println("harfinizden sonraki üç harf: " + " "+(char)(harf+1) + (char)(harf+2) +(char)(harf+3));
    }
}
