package Methodlarim;

import java.util.Arrays;

public class methodKullanma {
    public static void main(String[] args) {
        //verilen arrayin elemanlarını 2 artırın
        int [] arr={2,3,4,5};
        arr=arrayinelemanlarini2ArtiripYazdr.elementleriikiartir(arr);
        System.out.println(Arrays.toString(arr));
//   verilen arrayin ArrayElementleriToplama
        System.out.println(ArrayElementleriToplama.toplam(arr));
// arr oluşturma
        int[] yeniarr=KullaniciyaArrayolustur.arrayolustur();
        System.out.println(Arrays.toString(yeniarr));


    }
}
