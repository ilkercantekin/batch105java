package ders20_MDA;

public class c05_sayilarincarpimi {
    public static void main(String[] args) {

//Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini
// bize donduren bir method olusturun.

        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};

        System.out.println(elementelricarp(arr));


    }
    public static int elementelricarp(int [][] arr){
        int carpim = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }


        }
        return carpim;
    }
}