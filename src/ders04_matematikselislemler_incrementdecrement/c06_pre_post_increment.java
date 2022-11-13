package ders04_matematikselislemler_incrementdecrement;

public class c06_pre_post_increment {
    public static void main(String[] args) {
        //  a variableın degerini yazdrp sonra a nın degerini bir artırın
        int a=10;

        System.out.println("a " +a);//10
        a++;
        // a artık 11
        int b=10;
        // b varibalenın degerini 1 artıtıp sonra yazdırın
        b++;
        System.out.println("b : "+b);
         int c=10;
        //  c variableın degerini yazdrp sonra c nın degerini bir artırın
        System.out.println("c:"+ c++); //10 yazmalı
        // d varibalenın degerini 1 artıtıp sonra yazdırın
        int d=10;
        System.out.println("d :"+ ++d); //11
        /*
          c++  veya ++d  yi yazdirma veya atama isleminde kullanirsaniz
          c++ 'e post increment denir o satir icin once islemi yapar
           sonra artirmayi yapar
          ++d 'ye ise pre increment denir,
           once artirma yapip sonra islemi yapar

           islemin oldugu satirin bir alt satirina gecildiginde
          c'de d'de bir artmistir
         */
    }
}
