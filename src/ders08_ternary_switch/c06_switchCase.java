package ders08_ternary_switch;

public class c06_switchCase {
    public static void main(String[] args) {
        // kullanıcın girdiği gün numarasının ismini yazdırın
        int gunNo=2;
         /*if (gunNo==1) {
             System.out.println("pazratesi");
         } else if (gunNo==2) {
             System.out.println("salı");
         }else if (gunNo==2) {
             System.out.println("salı");
         }else if (gunNo==2) {
             System.out.println("salı");
         }else if (gunNo==2) {
             System.out.println("salı");
         }else if (gunNo==2) {
             System.out.println("salı");
         }else if (gunNo==2) {
                             System.out.println("salı");
         }else {
                             System.out.println("geçersiz gün");
                         }
                         */
          switch (gunNo){
              case 1:
                  System.out.println("pazartesi");
                  break;
              case 2:
                  System.out.println("salı");
                  break;
              case 3:
                  System.out.println("çarşamba");
                  break;
              case 4:
                  System.out.println("perşembe");
                  break;
              case 5:
                  System.out.println("cuma");
                  break;
              case 6:
                  System.out.println("cumartesi");
                  break;
              case 7:
                  System.out.println("pazar");
                  break;
              default:
                  System.out.println("hatalı gün girişi");
                  break;
          }


         }

    }

