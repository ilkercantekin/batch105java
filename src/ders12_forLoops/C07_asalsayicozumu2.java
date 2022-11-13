package ders12_forLoops;

public class C07_asalsayicozumu2 {
    public static void main(String[] args) {
        // başka şekilde yapalım BAYRAK İle
        int sayi = 100;
        int bayrak = 0;
        for (int k = 0; k <= sayi - 1; k++) {
            if (sayi % k == 0) {
                // bir tane bile bölen sayı varsa aşkımız bitti
                bayrak++;
            }

        }
        System.out.println(bayrak);
        if (bayrak == 0) {
            System.out.println("asal ");
        } else {
            System.out.println("asal sayı değildır");
        }
    }
}
