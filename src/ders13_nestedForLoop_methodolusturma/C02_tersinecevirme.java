package ders13_nestedForLoop_methodolusturma;

public class C02_tersinecevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String  input="Java her geçen gun güzelleşiyor";
        String tersinput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersinput+=input.substring(i, i+1);  //input.length()-1  =  i  idi

        }
        System.out.println("ters hali:  " + tersinput);  //royişellezüg nug neçeg reh avaJ  yazdırır
    }
}
