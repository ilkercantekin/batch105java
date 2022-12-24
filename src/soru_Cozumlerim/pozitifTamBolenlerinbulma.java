package soru_Cozumlerim;
import java.util.Scanner;

class pozitifTamBolenleriningbulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println(” java da klavyeden girilen sayiyinin pozitif tam bölenlerini veren program : “);
        System.out.println("sayıyı giriniz");


        int sayi=scan.nextInt();
        for (int i = 1; i <=sayi; i++)
        {
            if(sayi%i==0)
                System.out.println(sayi + " sayisinin pztf tam böleni "+ i +"dir.");
        }
    }
}
