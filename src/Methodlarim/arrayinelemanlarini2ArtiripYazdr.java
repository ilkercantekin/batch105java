package Methodlarim;

import java.util.Arrays;

public class arrayinelemanlarini2ArtiripYazdr {
    public static void main(String[] args) {
        int[] arr ={2,56,36,47,89};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));
        arr=elementleriikiartir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] elementleriikiartir(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+2;

        }


        return arr;
    }}
