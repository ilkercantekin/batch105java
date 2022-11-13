package ders03_datacatingWrapperCllass;

import java.util.Scanner;

public class c03_datatcasting {
    public static void main(String[] args) {

        // kullanıcıdan bir tamsayı alıp
        // kullanıcı kaç girersee girsin consolda -128 ile +127
        // arsaında bir sonuçyazdıracak kod yazınız
        Scanner scan= new Scanner(System.in);
        System.out.println("tamsayı giriniz");
        int girilenSayi=scan.nextInt();

        byte donusensayi=(byte)girilenSayi;
        System.out.println("girilen sayı : " + girilenSayi+"\ndonusmüş hali:  "+donusensayi);
    }
}
