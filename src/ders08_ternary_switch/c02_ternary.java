package ders08_ternary_switch;

public class c02_ternary {
    public static void main(String[] args) {

        //
        String str1="Ali";
        String str2="ali";
        // verilen iki  metin aynı ise metinler aynı
        //farklı ise metinler farklıdırı yazdırın
        if (str1.equals(str2)) {
            System.out.println("metinler aynı");
        }else {
            System.out.println("metinler farklı");
        }
        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");
    }
}
