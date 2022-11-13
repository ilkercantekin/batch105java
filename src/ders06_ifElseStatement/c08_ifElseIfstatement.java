package ders06_ifElseStatement;

import java.util.Scanner;

public class c08_ifElseIfstatement {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin,
        // kenar uzunlukları 0 veya negatif ise geçersiz kenar uzunluğu yazdırı
        // degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin üç kenarını girniz");
        int ken1= scan.nextInt();
        int ken2= scan.nextInt();
        int ken3= scan.nextInt();

        if (ken1<=0 || ken2<=0 ||ken3<=0) {
            System.out.println("geçesiz kenar uzunlugu");
        } else if (ken1==ken2 && ken2==ken3) {
            System.out.println("eşkenar üçgen");}
        else {
            System.out.println("eşkenar değil");

        }
    }
}
