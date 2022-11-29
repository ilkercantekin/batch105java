import ders44_maps.MapDepo;

import java.util.Map;

public class C02_contains {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
         /*
            {
            101=Ali-Can-10-H-MF,
            102=Veli-Cem-11-M-Soz,
            103=Ali-Cem-11-H-TM,
            104=Ayse-Can-10-H-MF,
            105=Ayse-Cem-11-M-TM,
            106=Fatma-Han-10-K-Soz}
         */
        System.out.println(ogrenciMap.containsKey(105));//true
        System.out.println(ogrenciMap.containsKey(111));// false
        System.out.println(ogrenciMap.containsValue("10"));// false
        System.out.println(ogrenciMap.containsValue("Fatma-Han-10-K-Soz"));// true
        /*
        containsvalue ("aranan deger") value lerin içerisindeki bir bölümü aramaz value yu butun olarak aranandeger varmı diye bakar.
         */


    }
}
