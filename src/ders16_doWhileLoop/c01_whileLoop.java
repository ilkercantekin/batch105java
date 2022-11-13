package ders16_doWhileLoop;

public class c01_whileLoop {
    public static void main(String[] args) {

        //  10 11 12 sayılarını toplayan bir while loop oluşturun

        int sayi=10;
        int toplam=0;  //  ilk deger
        while ( sayi<=12) {     // şart
            toplam+=sayi;
            sayi++;    // artış

        }
        System.out.println(toplam);
    }
    /*
    örnekten yaz
     */
}
