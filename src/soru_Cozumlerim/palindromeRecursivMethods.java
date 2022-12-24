package soru_Cozumlerim;

public class palindromeRecursivMethods {
    public static void main(String[] args) {
// palindrome= tersiyel düzü aynı olan sayı veya kelime
       String input="ey edip adanada pide ye";
       boolean sonuc=palindromeKontrolEt(input);
        System.out.println(sonuc);
    }

    private static boolean palindromeKontrolEt(String input) {
        if (input.length()==0 || input.length()==1){
            return true;
        }else if (input.substring(0,1).equalsIgnoreCase(input.substring(input.length()-1))){
            return palindromeKontrolEt(input.substring(1,(input.length()-1)));

        }else {
            return false;
        }

    }
}
