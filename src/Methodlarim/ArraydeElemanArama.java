package Methodlarim;

public class ArraydeElemanArama {
    public static void main(String[] args) {
        // bir arrayde bir eleman varmı varsa kac kere var metod

        int [] arr={1,2,4,5,8,4,2,3,65,45,7,98,58,52,4,1,2,6,8,7,5};
        int aranan=99;

        elemanAra(arr,aranan);

    }

    public static void elemanAra(int[] arr,int aranan) {
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==aranan){
            sayac++;
        }

    } if(sayac==0){
            System.out.println("array de aranan eleman yok");
        }else System.out.println("aranan eleman"+ aranan +"\n"+ sayac +"defa var");
}}
