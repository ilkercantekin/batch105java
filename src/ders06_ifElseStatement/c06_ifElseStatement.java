package ders06_ifElseStatement;

public class c06_ifElseStatement {
    public static void main(String[] args) {
        /*
        if else statement da süsülü parantez kullanmazsak
        hem if body si için hem de else body si için 1 satır kabul eder
        sonraki satırlar if else ile ilişiklendirilmez her durumda çalışır
         */
        int not=46;

        if (not>=50){
            System.out.println("sınıfı geçtin");
            System.out.println("yazın kafan rahat");
        } else {
            System.out.println("bu dersten kaldın");
            System.out.println("yaz okuluna bekleriz :)");
        }
    }
}
