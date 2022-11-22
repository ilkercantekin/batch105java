package Methodlarim;

import java.util.Arrays;

public class ArraySagaKaydir {
       // arr={4,5,6,7   yi  arr= {7,4,5,6} seklinde yazdıaralım

    public static void main(String[] args) {

        int arr[] = {4,5,6,7};
        arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] sagaKaydir(int[] arr) {
        int boskova=arr[arr.length-1]; // son elemneti boskovaya koyduk
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=boskova;
        return arr;
    }
}
