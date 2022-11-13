package ders10_StringManipuşation;

public class C01_concatination {
    public static void main(String[] args) {
        String  str1="Java";
        String  str2="Güzeldir";
        boolean bl = true;
        int sayi=20;
        double dbl=3.54;
        System.out.println(str1+bl+sayi);
       // System.out.println(bl+sayi);
        // string dışındaki data türlerinde toplama yapmammız izin vermeyebilir.
        System.out.println(sayi+dbl);//23,54 yazar
       //  System.out.println(str1.concat(dbl));  hata verir
        // concat sadece string variableları birleştirmek için kullnılır
        System.out.println(str1.concat(" ").concat(str2));//  Java Güzeldir

    }
}
