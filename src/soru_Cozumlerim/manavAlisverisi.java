package soru_Cozumlerim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manavAlisverisi {
    /*
    Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
 * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
 * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
 * goster.
 *
     *//*
    static String urun;
    static double kg;
    static double toplamTutar=0;
    static double kilo;
    static int secim;
static double ucret;
    public static void main(String[] args) {
        List<String> manavReyonu = new ArrayList<>();
        List<Double> fiyatlistesi = new ArrayList<>();
        manavReyonu.add("patates");
        fiyatlistesi.add(10.5);
        manavReyonu.add("pirasa");
        fiyatlistesi.add(11.5);
        manavReyonu.add("soğan");
        fiyatlistesi.add(12.5);
        manavReyonu.add("elma");
        fiyatlistesi.add(13.5);
        manavReyonu.add("muz");
        fiyatlistesi.add(23.5);

        Scanner scan = new Scanner(System.in);

        System.out.println(manavReyonu + ">>" + "lütfen ürün seçiniz " +
                "\npatates için 1 giriniz" +
                "\nsoğan için 2 giriniz" +
                "\npırasa için 3 giriniz" +
                "\nelma için 4 giriniz" +
                "\nmuz için 5 giriniz");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("kaç kilogram istediğinizi giriniz");
                double kilo = scan.nextDouble();
                double tutar=kilo * fiyatlistesi.get(manavReyonu[0]);
                break;
            case 2:
                System.out.println("kaç kilogram istediğinizi giriniz");
                kilo = scan.nextDouble();
                 tutar=kilo * fiyatlistesi.get(manavReyonu.[1]);
                break;
            case 3:
                System.out.println("kaç kilogram istediğinizi giriniz");
                kilo = scan.nextDouble();
                tutar=kilo * fiyatlistesi.get(manavReyonu.indexOf(2));
                break;
            case 4:
                System.out.println("kaç kilogram istediğinizi giriniz");
                kilo = scan.nextDouble();
               tutar=kilo * fiyatlistesi.get(manavReyonu.indexOf(3));
                break;
            case 5:
                System.out.println("kaç kilogram istediğinizi giriniz");
                kilo = scan.nextDouble();
                tutar=kilo * fiyatlistesi.get(manavReyonu.indexOf(4));
                break;
        }

        double toplamTutar=0;
        double tutar = 0;


        toplamTutar+=tutar;
        System.out.println("Sepetinizdeki urulerin toplam tutari: " + toplamTutar + " Turk Lirasıdır.");
    }

    }*/

    static String urun;
    static double kilogram;
    static double toplamTutar=0;
    public static void main(String[] args) {
        List<String> manavReyonu = new ArrayList<>();
        List<Double> fiyatListesi = new ArrayList<>();
        manavReyonu.add("patates");
        fiyatListesi.add(9.90);
        manavReyonu.add("sogan");
        fiyatListesi.add(6.90);
        manavReyonu.add("domates");
        fiyatListesi.add(17.50);
        manavReyonu.add("biber");
        fiyatListesi.add(14.50);
        manavReyonu.add("patlican");
        fiyatListesi.add(18.90);

        Scanner scan = new Scanner(System.in);
        System.out.println(manavReyonu + ">>" + " bu urun listesinden almak istediginiz bir urunu yaziniz: " );
        urun = (scan.next()).toLowerCase();

        if (manavReyonu.contains(urun)){
            System.out.println(urun + "'den kac kilo almak istediginizi yaziniz: ");
            kilogram = scan.nextDouble();
        }
        else{
            System.out.println("Girilen urun manavımızda bulunmamaktadir!" +
                    "\nLutfen Manav Reyonunda bulunan urunlerimizden seciniz >> " + manavReyonu);
        }
        double tutar = 0;
        tutar = sepetToplamHesapla(manavReyonu,fiyatListesi,kilogram,urun);
        toplamTutar+=tutar;
        boolean urunTalebi = true;
        while (urunTalebi){
            System.out.println("Sepetinize baska bir urun almak eklemek ister misiniz? (E/H)");
            String devamDurumu = scan.next();
            if (devamDurumu.equalsIgnoreCase("e")){
                System.out.println(manavReyonu + ">>" + " bu urun listesindeki almak istediginiz bir urunu yaziniz: " );
                urun = (scan.next()).toLowerCase();
                if (manavReyonu.contains(urun)){
                    System.out.println(urun + "'den kac kilo almak istediginizi yaziniz: ");
                    kilogram = scan.nextDouble();
                }
                else{
                    System.out.println("Girilen urun manavımızda bulunmamaktadir!" +
                            "\nLutfen Manav Reyonunda bulunan urunlerimizden seciniz >> " + manavReyonu);
                }
                tutar = sepetToplamHesapla(manavReyonu,fiyatListesi,kilogram,urun);
                toplamTutar+=tutar;

            } else if (devamDurumu.equalsIgnoreCase("h")) {
                urunTalebi=false;
            }
        }
        System.out.println("Sepetinizdeki urulerin toplam tutari: " + toplamTutar + " Turk Lirasıdır.");
    }

    private static double sepetToplamHesapla(List<String> manavReyonu, List<Double> fiyatListesi, double kilogram, String urun) {
        double toplamTutar=0;
        if (urun.equalsIgnoreCase("patates")){
            toplamTutar+=kilogram* fiyatListesi.get(manavReyonu.indexOf("patates"));
        } else if (urun.equalsIgnoreCase("sogan")) {
            toplamTutar+=kilogram* fiyatListesi.get(manavReyonu.indexOf("sogan"));
        }
        else if (urun.equalsIgnoreCase("domates")) {
            toplamTutar+=kilogram* fiyatListesi.get(manavReyonu.indexOf("domates"));
        }
        else if (urun.equalsIgnoreCase("biber")) {
            toplamTutar+=kilogram* fiyatListesi.get(manavReyonu.indexOf("biber"));
        }
        else if (urun.equalsIgnoreCase("patlican")) {
            toplamTutar+=kilogram* fiyatListesi.get(manavReyonu.indexOf("patlican"));
        }
        return toplamTutar;
    }}

