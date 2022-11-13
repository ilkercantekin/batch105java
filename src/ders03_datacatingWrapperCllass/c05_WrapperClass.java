package ders03_datacatingWrapperCllass;

public class c05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String  str = "java çokgüzel";
        //sayi. noktadan sonra method yoktur
        // primitive data türleri sadece deger barındırır
        /*
        javaya yapılan talepler sonucu java primitive data türkerli ile bazı hazır
        methodlarların kullanılabilnesi için Wrapper Classlar oluşturmuştur
        Wrapper class lar primitive data türlerindeki değerleri alırlar
        ancak method larıda vardır.
         */
        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter('5'));//false
        System.out.println(Character.isDigit('7'));// true
        String str1="123";
        String str2="12";
        System.out.println(str1+str2);
        //123 +12 yi bulsun=135
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        // Integer.parseInteger(str) icine yazılan str  rakamlardan oluşuyorsa str yi integere cevirir
        // ancak bir karakter bile rakam değilse hata verir
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);// aşağıdakileriyazdırır
        //2147483647
        //-32768

    }
}
