package Methodlarim;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KullaniciyaArrayolustur {
    public static void main(String[] args) {
        int[] kullaniciArrayi=arrayolustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    public static int[] arrayolustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayin boyutunu giriniz");
        int lenght=scan.nextInt();
        int [] kullaniciArrayi=new int[lenght];
        for (int i = 0; i <lenght ; i++) {
            System.out.println("arraye eklenecek sayı giriniz");
            kullaniciArrayi[i]=scan.nextInt();

        }


        return kullaniciArrayi;
    }

}
