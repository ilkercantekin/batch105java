package soru_Cozumlerim;

public class Outer {
        int x=10;
        class Inner{
            int x =100;
            public void show() {
                int x =1000;
                System.out.println(x);
            }
        }
        public static void main(String[] args) {
            Outer.Inner o = new Outer().new Inner();
            o.show();
        }

    }


