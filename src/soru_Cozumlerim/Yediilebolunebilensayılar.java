package Methodlarim;

import java.util.Scanner;

public class Yediilebolunebilensayılar {

    /*Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.*/

    public static void main(String[] args) {
yediilebolunebilen();
    }
    public static void  yediilebolunebilen() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double sayi= scan.nextDouble();
        for (int i = 1; i <=sayi ; i++) {
            if (i%7==0) {
                System.out.print(i+" ");
        }
         }

        }
    }

