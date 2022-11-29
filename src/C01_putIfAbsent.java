import java.util.HashMap;
import java.util.Map;

public class C01_putIfAbsent {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",7);
        mp1.put("C",9);

        System.out.println(mp1.putIfAbsent("D", 10));// null
        System.out.println(mp1);// {A=5, B=7, C=9, D=10}

        System.out.println(mp1.putIfAbsent("D", 15));//10
        System.out.println(mp1);// {A=5, B=7, C=9, D=10}

        /*
        putIfAbsent(K,V)  eger K daha önce  yoksa ekler ve null döner
                          eger K daha önce varsa, eklemek istediğimiz yeni deegeri eklemez ve eski var olan degeri bize döndürür
         */

        Map<Integer,String > mp2=new HashMap<>();

        mp2.put(2,"Ğ");
        System.out.println(mp2.putIfAbsent(3, "K"));//null
        System.out.println(mp2);// {2=Ğ, 3=K}
        System.out.println(mp2.putIfAbsent(3, "Z"));// K
        System.out.println(mp2);// {2=Ğ, 3=K}


    }





}
