package Methodlarim;

import java.util.Scanner;

public class kelimeyiHarflerineAyirma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir cümle yazınız : ");
        String text = scanner.nextLine();
        show_me(text);
    }

    private static void show_me(String text) {

        String output = "";
        int position = 0;
        int text_length = text.length();

        while(position < text_length)
        {
            output += text.substring(position,position+1) + ", ";
            position++;
        }

        System.out.println("[" + output.substring(0,output.length()-2)  +"]");
    }
}
