package ders20_MDA;

public class C06_MDASoru {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in
        // son elementlerinin toplaminini yazdiran
        // bir method olusturun.

        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};
sonElementleritopla(arr);
    }
    public static void sonElementleritopla(int [ ] [] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {

            toplam+=arr[i][arr[i].length-1];
        }
        System.out.println("son elementeler toplamı:" + toplam);
    }
}
