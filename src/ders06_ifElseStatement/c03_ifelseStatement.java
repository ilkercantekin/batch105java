package ders06_ifElseStatement;

import java.util.Scanner;

public class c03_ifelseStatement {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin üç kenarını girniz");
        int ken1= scan.nextInt();
        int ken2= scan.nextInt();
        int ken3= scan.nextInt();
        if (ken1==ken2 && ken2==ken3){
            System.out.println("eşkenar üçgen");}
        else {
            System.out.println("eşkenar üçgen değildir");
        }
    }
}
