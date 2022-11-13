package ders04_matematikselislemler_incrementdecrement;

public class c01_Datacasting {
    public static void main(String[] args) {
        int sayi1= 20;
        int   sayi2= 6;
        System.out.println(sayi1/sayi2);
        //bölünen ve bölen ikiside tamsayı ise,
        // java sonucun sadece tamsayı kısmını alır
        double sayi3=6;
        System.out.println(sayi1/sayi3);// 3,33333333333
        // int/ double java geniş olana göre davrabır.


    }
}
