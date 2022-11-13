package ders07_nestedIfElseStatement;

import java.util.Scanner;

public class c02_ifElseIfStatement {
    public static void main(String[] args) {

        /* Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
          kullaniciya musteri karti olup olmadigini sorun.
          Musteri karti varsa 10 urunden fazla alirsa %20,
           10 üründen az ise %15 indirim yapin,
           Musteri karti yoksa 10 urunden fazla alirsa %15,
            yoksa %10 indirim yapin
         */
        int urunadedi=30;
        boolean kartvarmi=false;
        double listefiyati=12.5;
        double toplamfiyat=0;

        if (kartvarmi && urunadedi>=10) {
          toplamfiyat=urunadedi*listefiyati*(0.8);
            System.out.println("%20 indirimili toplam fiyat:" + toplamfiyat);
        } else if (kartvarmi && urunadedi<10 && urunadedi>0) {
            toplamfiyat=urunadedi*listefiyati*(0.85);
        } else if (!kartvarmi && urunadedi>10) {
            toplamfiyat=urunadedi*listefiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyat:"+ toplamfiyat);
        } else if (!kartvarmi && urunadedi<10 && urunadedi>0) {
            toplamfiyat=urunadedi*listefiyati*(0.9);
            System.out.println("%10 indirimli toplam fiyat:" +toplamfiyat);
        }
    }
}
