package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        //str1 e değer atanmıştır
        System.out.println(str1);// hiçlik yazdrr
        System.out.println(str1.concat("Java"));
        String  str2;
        // str2  olşturuldu ama deger atanmadı
        //System.out.println(str2);// degeri yokki yazsın.CTE verir . altını kırmızı çizer
        //System.out.println(str2.concat("Java"));// deger atanmadığı için method la kullanılamaz
        str2="Java candır";
        System.out.println(str2);// yazar
        System.out.println(str2.concat(".")); // Java candır. yazdrr
        String str3=null; //str3 e deger atanmamıştır
        // nullpointer ile str3 e deger atamadıgımızn farkında oldumuzu soyluyoruz
        System.out.println(str3);// yazdrr sorun çkıarmaz. ama null işaretlendiğini yazdırır
        //System.out.printf(str3.concat("Java")); //.NullPointerException hata verir
        System.out.println(str3+"java");// nulljava yazar
        //System.out.println(str3.toUpperCase()); // NullPointerException hata verir



    }
}
