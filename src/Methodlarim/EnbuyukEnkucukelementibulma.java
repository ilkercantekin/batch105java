package Methodlarim;

import java.util.Arrays;

public class EnbuyukEnkucukelementibulma {
    public static void main(String[] args) {
        int [] arr={3,8,9,7,5,4,78,9};
        enBuyukEnKucukElemanYazdir(arr);

    }

    public static void enBuyukEnKucukElemanYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println("en buyuk element" + arr[arr.length-1]);
        System.out.println("en kucuk element" + arr[0]);

    }
}
