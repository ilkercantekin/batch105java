package ders04_matematikselislemler_incrementdecrement;

public class c05_increment {
    public static void main(String[] args) {
        int sayi=10;
        // bu sayıyı 3 artıralım ve yazdıralım
        sayi= sayi+ 3;
        System.out.println(sayi);

        sayi+=3;
        System.out.println(sayi);

        int s=10;
        //bu sayyıyı bir artırın
        s=s+1;
        System.out.println(s);//11
        s+=1;
        System.out.println(s);//12
        s++;
        System.out.println(s);//13
        ++s;
        System.out.println(s);//14
        int t=10;
        // bu sayıyı 1 eksiltelim
        t=t-1;//9
        t-=1;//8
        t--;//7 postdecrement
        --t;//6 predecrement
        System.out.println(t
        );


    }
}
