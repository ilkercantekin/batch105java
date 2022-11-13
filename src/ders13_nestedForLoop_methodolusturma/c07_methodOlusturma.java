package ders13_nestedForLoop_methodolusturma;

public class c07_methodOlusturma {
    public static void main(String[] args) {

        String str="Java muhtesemdir";
        //  metni büyük harfe cevirin
        String  buyukstr=str.toUpperCase(); // bi kere kaydedince sonra istediğin gibi kullanabiliriz
        System.out.println(str); // Java muhtesemdir
        System.out.println(buyukstr);  // JAVA MUHTESEMDIR

        //METNİN BUYUK HARFLERE CEVRİLMİŞ HALİ S İÇEİRİRMİ?
        System.out.println(buyukstr.contains("S")); //true


    }
}
