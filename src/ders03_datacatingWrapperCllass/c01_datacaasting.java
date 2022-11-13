package ders03_datacatingWrapperCllass;

public class c01_datacaasting {
    public static void main(String[] args) {
        /* bazı data türleriasla biribirine cast edilemez
         */
        //String str=20;          çalışmaz
        //boolean mutluMu='true'; çalışmaz
        //int a= true ;           çalışmaz
        /*
        dar data türünden bir degeri geniş data
        türünndeki variableye atama yaparsanız java otomatik olarak yapar
         */
        double sayi=20;
        //long ln = sayi ;
        short sh=23;
        int  a= sh;
        long lng=sh;
        float fl=lng; // variable olamdıgıiçin f yadaF yazmaya gerek yok
        /*
        am tersini yapmakiçin büyük datayıküçük variableye atamakistersek
        java kabul etmez
                 */
        double dbl=20;
        // a =dbl;  çalışmaz kabul etmez
        // short abc=dbl; çalışmaz







    }
}
