package ders13_nestedForLoop_methodolusturma;

public class C01_forLoop {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String input="Java ne kadar guzel";
        for (int i = input.length()-1; i >=0; i--) { // sonkarakterden başlayıp
            System.out.println(input.charAt(i));

// burada sadece yazdırır kaydetmez



        }
    }

}
