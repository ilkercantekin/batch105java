package ders05_concatination_operatorler;

public class c02_logicaloperators {
    public static void main(String[] args) {
         int a=20;
         int b=30;
        System.out.println(a>b && b>0 && a>0);// false

        boolean sonuc=((3*a <= 2*b) && (a>10) && (b>20));
        // sonuc=3*a <= 2*b && a>10 && b>20  da aynı sonucu verir
        System.out.println(sonuc); // true
    }
}
