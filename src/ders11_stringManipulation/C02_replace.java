package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String  str="Java candır";
        System.out.printf( str.replace('a', 'A')); // JavA cAndır .bütün aları değiştirir
        System.out.println(str.replace(' ','_'));// Java_candır
        System.out.println(str.replace("candır","cok güzeldir" )); //Java cok güzeldir
        System.out.println(str.replace(""," ")); //J a v a   c a n d ı r
        System.out.println(str.replace("Java", "hava").replace("candır","cok güzel"));
        // hava cok güzel yazar
        // sadece 1.a yı  A yapın
        System.out.println(str.replaceFirst("a","A")); // JAva candır
        // String'deki tum a'lari silin
        System.out.println(str.replace("a","")); // Jv cndir

        // Java yerine Hava, candir yerine cok guzel yazdiralim

        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel"));// Hava cok guzel

        System.out.println(str.replace("","_"));
        // _J_a_v_a_ _c_a_n_d_i_r_

        // sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst("a","A")); // JAva candir

    }
}
