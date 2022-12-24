package soru_Cozumlerim;

import java.util.Arrays;

public class MountainArray {
    public static void main(String[] args) {
        int [] arr={0,2};
        int[] arr1 = {0, 2, 5, 3, 1};// m a

        boolean sonuc=MountainArrBul(arr);
        if(sonuc) {
            System.out.println(Arrays.toString(arr) + " mountain array dir");
        } else System.out.println(Arrays.toString(arr)+ " array Mountain değildir");


        sonuc=MountainArrBul(arr1);
        if(sonuc) {
            System.out.println(Arrays.toString(arr1)+ " mountain array dir");
        } else System.out.println(Arrays.toString(arr1) + " array Mountain değildir");

    }

    private static boolean MountainArrBul(int[] arr) {
        // arr.lenght >=3 olmali
        if (arr.length<3){
            return false;
        }
        int i=0;
        for ( i = 1; i < arr.length ; i++) {
            if (arr[i]<= arr[i-1]){
                break;
            }
            
        }
        // 2,0 ise
        if (i== arr.length || i==1){
            return false;
        }
        for (; i < arr.length ; i++) {
            if( arr[i]>=arr[i-1]){
                return false;

            }

        }
        boolean sonuc;
        return i== arr.length;

    }
}
