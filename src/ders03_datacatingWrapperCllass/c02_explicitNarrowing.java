package ders03_datacatingWrapperCllass;

public class c02_explicitNarrowing {
    public static void main(String[] args) {
        int sayi=20;
        /* geniş data değerini dar dat türündeki bir variable
        ya atamak isteersenix sorumlulugu alırsak kabul eder
        bu sorumluğu almak için cast edeceğimizi değerin önüne () içerisinde
        cast etmek istediğimiz data türü yazılır
        bu durumda dat kayıpları double dan inte gecerken olabilir
        veya başkalaşım olabilir.
        int i byte cevirirsek tekrar tekrar başa döner.
         */
        short sh=(short) sayi;
        System.out.println(sh);

        double dbl= 23.5;
        int say= (int) dbl;
        System.out.println(say);


        say=128; //int
        byte byt =(byte) say;
        System.out.println(byt);



    }
}
