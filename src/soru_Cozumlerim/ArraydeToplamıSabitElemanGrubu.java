package soru_Cozumlerim;

import java.util.Arrays;
import java.util.Scanner;

public class ArraydeToplamıSabitElemanGrubu {
    public static void main(String[] args) {
        //Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
        //Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır

        Scanner scan = new Scanner(System.in);
        int uzunluk;
        int dizi[];
        System.out.println("uzunluk girin");
        uzunluk = scan.nextInt();
        System.out.println("dizinin elemanlarını girin");
        dizi = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            dizi[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(dizi));//[4, 6, 5, -10, 8, 5, 20]
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));//[-10, 4, 5, 5, 6, 8, 20] sıraladı
        for (int i = 0; i <uzunluk ; i++) {
            for (int j = i+1; j <uzunluk ; j++) {

                if (dizi[i] + dizi[j] == 15) {
                    System.out.println("15 = " + dizi[i] + " + " + dizi[j]);
                }
            }
            }

        }

    }


