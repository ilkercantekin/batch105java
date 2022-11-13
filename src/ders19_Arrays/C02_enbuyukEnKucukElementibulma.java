package ders19_Arrays;

import java.util.Arrays;

public class C02_enbuyukEnKucukElementibulma {
    public static void main(String[] args) {
        // Verilen bir int array de en küçük ve nebüyük  sayıları yazdıran bi metod yazınız
        int[] arr={3,8,1,5,2,9};
enbuyukenkucukElementyazdir(arr);

    }
    public static void enbuyukenkucukElementyazdir(int[] arr){
        Arrays.sort(arr);  // [1,2,3,5,8,9]
        System.out.println("en buyuk element:  " +arr[ arr.length-1]);
        System.out.println( " en kucuk elemet: " + arr[0]);

    }
}
