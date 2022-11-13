package ders04_matematikselislemler_incrementdecrement;

import java.util.Scanner;

public class c04_modulus {
    public static void main(String[] args) {
        // kullanıcının girdiği 4 basamaklı sayının rakamlar toplamını veren bir kod yazınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int input=scan.nextInt();
        int birlerBasamagi;
        int rakamlarToplami=0;
        //birler basamagını al
        //Scanner scan=new Scanner(System.in);
        //dewaımı yaz..............
        birlerBasamagi= input %10; // 3
        //birler basamagını rakamlartoplamına ekle
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //3
        input = input/10;//145

        birlerBasamagi= input %10; // 5

        rakamlarToplami = rakamlarToplami + birlerBasamagi; //8
        input = input/10;//14

        birlerBasamagi= input %10; // 4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //12
        input = input/10;
        // dört basamklı oldan 4 kere işlem tekrarlanır

        birlerBasamagi= input %10; // 1

        rakamlarToplami = rakamlarToplami + birlerBasamagi; //13
        input = input/10;//0

        System.out.println(rakamlarToplami);
    }
}
