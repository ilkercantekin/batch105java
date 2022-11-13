package ders03_datacatingWrapperCllass;

import java.util.Scanner;

public class c04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b');//97+98=195 yazar
        //kullanidan char bir karakterden sonra gelen üç karajteri yazdırın
        // örnek input: a , output:bcd
        Scanner scan= new Scanner(System.in);
        System.out.println("bir karakter giriniz");

        char girilenkrk=scan.next().charAt(0);
        System.out.println(""+(char)(girilenkrk+1) +
                (char)(girilenkrk+2)+(char)(girilenkrk+3));

    }
}
