package Methodlarim;

import java.util.Arrays;

public class arrayeElemanEklemeMetodu {

    public static void main(String[] args) {
        int[] arr={5,6,8,4};
        int eklneceksayi=9;
        arr=arrayeElemanEklemeMet(arr,eklneceksayi);
        System.out.println(Arrays.toString(arr));

    }

    public static int[ ] arrayeElemanEklemeMet(int[] eklenecekArr,int eklneceksayi) {
        int[] arr={5,6,8,4};
        int[] yeniArr=new int [eklenecekArr.length+1];
        for (int i = 0; i <eklenecekArr.length; i++) {
            yeniArr[i]=eklenecekArr[i];
        }
yeniArr[yeniArr.length-1]=eklneceksayi;
        return yeniArr;
    }

}
