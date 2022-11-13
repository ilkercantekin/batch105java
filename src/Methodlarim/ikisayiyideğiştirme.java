package Methodlarim;

public class ikisayiyideğiştirme {
    public static void main(String[] args) {
  //2 tane sayıyı geçici bir temp değişken kullanmadan nasıl değiştirebiliriz..
        int a=9,b=28;
        a=a+b;
        b=a-b;
        a=-(b-a);
        System.out.println("a : " + a + " b : " + b);

    }
}
