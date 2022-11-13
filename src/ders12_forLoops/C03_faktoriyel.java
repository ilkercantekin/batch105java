package ders12_forLoops;

public class C03_faktoriyel {
    public static void main(String[] args) {
        // kullnıcın verdiği sayının faktoryelini bulun
        int sayi=6;
        int sayi1=sayi;
        int faktoryel=1;
        System.out.print(sayi+"!"+"="+sayi);
        for (int i = sayi; i >=1 ; i--) {
            faktoryel=faktoryel*i;

         if (sayi1>1) { --sayi1;
            System.out.print("*"+sayi1);}}
        System.out.println("= "+ faktoryel);



        // 1 den 100 e kadar olan sayıları toplayın sınırlar dahil;
        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+ i ;
            // System.out.println(toplam); // aradaki sonnuçları isteresk toplam ı for döngüsü içine yazarız

        }
        System.out.println("toplam= "+toplam); // aradaki sonnuçları isteresk toplam ı for döngüsü içine yazarız




    }
}
