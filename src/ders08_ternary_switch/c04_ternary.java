package ders08_ternary_switch;

public class c04_ternary {
    public static void main(String[] args) {

        int kenar1=10;
        int kenar2=5;
        int kenar3=10;

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1==kenar2 && kenar3==kenar2 ? "eşkenar üçgen" : "eşkenar değil");

        // hepsini 0 girersek eşkenar üçgen yazar ama hatalı olur. ternary basit durumlarda kullanlırı




        // iki sayı alın büyük olmayanı  yazdırın

        int sayi1=10;
        int  sayi2=11;
        System.out.println( sayi1>sayi2 ? sayi2 : sayi1);
    }

}
