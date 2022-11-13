package ders17_Scope;

public class C01_localvariables {
    public static void main(String[] args) {
        // bir methodun içinde oluşturulan  variablelar ın scope u içinde oluşruldukları method dur
//  o method un dışından ulaşılamaz


        int sayi=10;
        String isim="Ramazan";
        for (int i = 0; i <10 ; i++) {
            String adres="Ankara";
            // bir loop içinde oluşturulan variablelar sadece o loop içinde geçerlidir
            // bu vaiableları loop dışında kullanamazsınız

        }

        // local variablelara deger atamamak mümkün mü?
        double pi;
        //izin verir ama kullanamazsınız
        // System.out.println(pi);  CTE verir

    }
     public static void method1(){
         //  System.out.println(sayi);  sayi diye bir variale yok ki bu metod içinde
        //  isim="tugay";      isimi diye bir variable yok ki bu metod içinde

     }
}
