import java.util.HashMap;
import java.util.Map;

public class C05_replace {

    public static void main(String[] args) {

        Map<String ,Integer> mp1=new HashMap<>();
        mp1.put("a",5);
        mp1.put("b",3);
        mp1.put("c",7);

        System.out.println(mp1.replace("c", 10));// 7
        System.out.println(mp1);// {a=5, b=3, c=10}

        System.out.println(mp1.replace("b", 21));// 3
        System.out.println(mp1);//   {a=5, b=21, c=10}

        System.out.println(mp1.replace("a", 4, 12));//false
        System.out.println(mp1);// {a=5, b=21, c=10}
        System.out.println(mp1.replace("a", 5, 23));// true
        System.out.println(mp1);// {a=23, b=21, c=10}
        System.out.println(mp1.putIfAbsent("f", 55));
        System.out.println(mp1.getOrDefault("c", 44));// 10
        System.out.println(mp1.getOrDefault("d", 44));// 44
        System.out.println(mp1.getOrDefault("f", 44));// 55


        System.out.println(mp1);//{a=23, b=21, c=10, f=55}


    }
}
