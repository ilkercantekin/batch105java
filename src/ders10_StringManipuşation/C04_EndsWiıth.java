package ders10_StringManipuşation;

public class C04_EndsWiıth {
    public static void main(String[] args) {
        String  str= "Java heryerde güzel";
        System.out.println(str.endsWith("güzel"));//true
        System.out.println(str.endsWith("l"));//true
        System.out.println(str.endsWith("Java heryerde güzel"));//true
        System.out.println(str.endsWith("Java"));//t false

    }
}
