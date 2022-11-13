package ders05_concatination_operatorler;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {

        // kullanıcıdan iki sayı alın
        //eger birinci sayı >100 ise  "ilk sayı 100 den büyük " yazdırın
        // eger 2. sayı çift ise 2. sayı çift yazdırın
        //eger ilk sayı 2. sayıdan büyükse, " ilk sayı daha büyük" yazddırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz :");
        int s1= scan.nextInt();
        int s2=scan.nextInt();
        //eger birinci sayı >100 ise  "ilk sayı 100 den büyük " yazdırın
        if (s1>100) {
            System.out.println("ilksayı 100den büyük");
        }
        // eger 2. sayı çift ise 2. sayı çift yazdırın
        if (s2%2==0){
            System.out.println("2. sayı çift");
        }
        //eger ilk sayı 2. sayıdan büyükse, " ilk sayı daha büyük" yazddırın
        if (s1>s2) {
            System.out.println("ilk sayı daha büyük");
        }
    }
}
