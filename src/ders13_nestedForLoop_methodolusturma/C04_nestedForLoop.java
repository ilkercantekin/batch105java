package ders13_nestedForLoop_methodolusturma;

public class C04_nestedForLoop {
    public static void main(String[] args) {

        /* aşagıdaki şekli yazdıran bir kod hazırlayın
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <=4 ; i++) {  // satır sayısı     outer loop
            for (int j = 1; j < 6; j++) {  // sütun sayısı   inner loop

                System.out.print("*"+" ");

            }
            System.out.println(" ");         //   iç loop bitince alt satıra geçirir
        }

    }
}
