package soru_Cozumlerim;

import java.util.Scanner;

public class ay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf gir");
        char harf=scan.next().charAt(0);
        if (harf== 'a'){
            System.out.println("ay: ARALIK") ;
        }
        else System.out.println( harf+" "+"harfiyle başlayan bir ay yoktur");


    }
}
