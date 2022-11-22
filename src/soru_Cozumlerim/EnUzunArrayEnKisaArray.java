package soru_Cozumlerim;

public class EnUzunArrayEnKisaArray {
    // Soru 7 : String' lerden oluşan bir arrayde uzunluğu en kisa ve en uzun  olan elemanları bulunuz.
    // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Jonathan

    public static void main(String[] args) {
        String[] arr = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }
            if (arr[i].length() < enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }
        }
        System.out.println("enKisaKelime = " + enKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);
    }

}
