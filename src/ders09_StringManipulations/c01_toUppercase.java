package ders09_StringManipulations;

import java.util.Locale;

public class c01_toUppercase {
    public static void main(String[] args) {
        String  str= "java mutluluktur";
        System.out.println(str.toUpperCase()); //JAVA MUTLULLIKTUR  yazar
        System.out.println(str);// aynen yazar
                str=str.toUpperCase();
        System.out.println(str);
        str= "ince  mehmet";
        //str=str.toUpperCase();
        //System.out.println(str); // INCE MEHMET
        str=str.toLowerCase();
        System.out.println(str);// ince mehmet
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));


    }
}
