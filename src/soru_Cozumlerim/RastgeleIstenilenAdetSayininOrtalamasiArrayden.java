package soru_Cozumlerim;

import java.util.Random;
import java.util.Scanner;

public class RastgeleIstenilenAdetSayininOrtalamasiArrayden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("rastgele kac adet sayının ortalamasını istiyorsunuz");
        int adet=scan.nextInt();

        Random rastegelesayi=new Random();
        int [] arr  = new int[adet];
        int toplam= 0;
        for (int i = 0; i <adet ; i++) {
            arr[i]=rastegelesayi.nextInt(1000);
            toplam+=arr[i];
        }
        System.out.println("toplamları :" + toplam + "\nsayıların ortalaması :" + toplam/arr.length);



    }


}
