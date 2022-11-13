package ders04_matematikselislemler_incrementdecrement;

public class c08_Pre_Post_Increment {
    public static void main(String[] args) {
        int x=3;
        int y=2*++x;
        int z= 5+y--;
        System.out.println(x+y+z);
    }
}
