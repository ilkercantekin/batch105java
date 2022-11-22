package Methodlarim;

public class ArrayElementleriToplama  {
    public static void main(String[] args) {
        int [] arr={6,-8,9,3,-1,-8,5};

        System.out.println(toplam(arr));

    }

    public static int toplam(int[] arr) {
        int toplami = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplami += arr[i];
            }
        }
        return toplami;
    }
}

