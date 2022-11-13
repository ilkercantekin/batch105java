package soru_Cozumlerim;

import java.util.Scanner;
      //Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
      //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
      //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
      //zamani” yazdirin
public class haftaGunu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen hangi günde olduğuzu yazınız");
        // hatfa içi veya haftasonu gün olması için gün ü ana koşul alalım
        String gun= scan.nextLine();
        if (gun.equalsIgnoreCase("pazartesi")){
            System.out.println("Şimdi çalışma zamanı tatile 4 gün daha var");
        }else if (gun.equalsIgnoreCase("salı")) {
            System.out.println("Şimdi çalışma zamanı tatile 3 gün daha var");
        }else if (gun.equalsIgnoreCase("çarşamba") ) {
            System.out.println("Şimdi çalışma zamanı tatile 2 gün daha var");
        }else if (gun.equalsIgnoreCase("perşembe") ) {
            System.out.println("Şimdi çalışma zamanı tatile 1 gün daha var");
        }else if (gun.equalsIgnoreCase("cuma") ) {
            System.out.println("Şimdi çalışma zamanı tatile 0 gün daha var");
        }else if (gun.equalsIgnoreCase("cumartesi") ) {
            System.out.println("Şimdi  tatil zamanı  ");
        }else if (gun.equalsIgnoreCase("pazar") ) {
            System.out.println("Şimdi  tatil zamanı  ");
        }else {
            System.out.println("yanlış gün girdiniz");
        }




    }
}
