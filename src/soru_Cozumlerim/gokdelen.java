package soru_Cozumlerim;

public class gokdelen {

        public static void main(String[] args) {

            String cati1  = "   ╔===╦";
            String cati2  = "╔==╩   ╩==╦";


            String kat    = "╟ █  █  █ ╟";


            String zemin1 = "╟   ███   ╟";
            String zemin2 = "▀▀▀▀▀▀▀▀▀▀▀";

            int katSayisi = 10;


            System.out.println(cati1);
            System.out.println(cati2);

            for(int i = 1; i <= katSayisi; i++) {
                System.out.println(kat);
            }

            System.out.println(zemin1);
            System.out.println(zemin2);
        }
    }

