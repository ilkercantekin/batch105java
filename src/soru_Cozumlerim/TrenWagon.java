package soru_Cozumlerim;

public class TrenWagon {

        public static void main(String[] args) {
            String tren1 = "  ╔═══════════════╦";

            String tren2 = "═╔╩  - T C D D -  ╚══╦";

            String tren3 = " ╚═══ÔÔÔ═══════ÔÔÔ═══╩";

            String vagon1 = "╔═══════════════════╦ ";

            String vagon2 = "|██  ██  ██  ██  ██ ╠═";

            String vagon3 = "╚═══ÔÔ════ÔÔ═══ÔÔ═══╩ ";

            int kacVagon = 3;

            for(int i = 1; i <= kacVagon; i++) {
                System.out.print(vagon1);
            }
            System.out.println(tren1);

            for(int i = 1; i <= kacVagon; i++) {
                System.out.print(vagon2);
            }
            System.out.println(tren2);

            for(int i = 1; i <= kacVagon; i++) {
                System.out.print(vagon3);
            }
            System.out.println(tren3);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

