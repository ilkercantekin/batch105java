package ders09_StringManipulations;

public class C03_equalsignoreCase {
    public static void main(String[] args) {
        String  str1="Ali";
        String  str2="ali";
        String  str3="ALI";
        System.out.println(str1.equals(str2));//false verir
        System.out.println(str1.equals(str3));// false
        System.out.println(str1.equalsIgnoreCase(str2)); //trrue
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase("Ali")); // false yazar
        /* equalsignorecase aynı metnin büyük küçük harf kullanılarak oluşturulan farklı yazımlarını birbirne eşit olarak kabul eder.
        yani equalsignorecase için  ali,ALI,Ali, aLI, alI birbirine eşittir
        ama kelimede farklılık varsa bunları tolere etmez. boşlukları bile inceller.
        a li  ile  ali eşit değildir
        ali ile Ali.  eşit değildir.cünkü nokta var.
         */

    }
}
