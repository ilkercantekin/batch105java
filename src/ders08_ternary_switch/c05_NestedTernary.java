package ders08_ternary_switch;

public class c05_NestedTernary {
    public static void main(String[] args) {
        /*
        Ornek : Kullanicidan bir tamsayi alin.
 Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
 Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin
         */

        int sayi=-21;
         if (sayi>0){
            //cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
             System.out.println(sayi%2==0 ?  "çift sayı" : " çift sayı değil");
         }else {
             //3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

             System.out.println( sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değildir");

             // ternary ile hepsi
             String  sonuc= sayi>0
                                        ?
                                        sayi%2== 0    ?    "çift sayı " : "çift sayı değil"
                                        :
                                        sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değil";


         }
    }
}
