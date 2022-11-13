package ders05_concatination_operatorler;

public class c01_concatination {
    public static void main(String[] args) {
        // sadece aşagıda verilen variableları kullanarak
        // istenen degerier yazdıralım
        String s1="java";
        String s2="güzeldir";
        String  s3="";//hiçlik string leştirir
        String  s4=" ";

        int sayi1=4;
        int sayi2=3;
        // java7 güzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);
        //34 java
        System.out.println(s3+sayi1+sayi2+s4+s1);
        //7java güzeldir
        System.out.println((sayi2+sayi1)+s1+s4+s2);
//  java güzeldir7 yazsın

        System.out.println(s1+s4+s2+(sayi1+sayi2));//
//java güzeldir12
        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));
    }
}
