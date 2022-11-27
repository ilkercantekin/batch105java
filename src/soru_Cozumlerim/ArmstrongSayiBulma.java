package soru_Cozumlerim;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        System.out.println(new ArmstrongSayiBulma().armstrongSayiBulma());
    }

    public int armstrongSayiBulma() {
        int sayi=0;
        for (int i = 0; i < 1000; i++) {
            int kuplerToplami = 0;
            int ilkDeger = sayi;
            int rakam = 0;

            while (sayi != 0) {
                rakam = sayi % 10;
                kuplerToplami += rakam * rakam * rakam;
                sayi /= 10;

            }
            if (kuplerToplami == ilkDeger) {
                System.out.println("girilen sayı Armstrong sayıdır");
            } else System.out.println("girilen sayı Armstrong değildir");
        }
        return sayi;
    }
    }

