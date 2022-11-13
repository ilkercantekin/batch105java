package ders06_ifElseStatement;

import java.util.Scanner;

public class c04_ifelsestatement {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);
        if (krk >='A' && krk<='Z'){
            System.out.println("büyük harf");}
        else {
            System.out.println("büyük harf değil");

        }
    }
}
