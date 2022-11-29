import java.util.HashMap;
import java.util.Map;

public class C03_compute {

    public static void main(String[] args) {

        Map<String ,Integer > mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        // c varsa degerini 3 artır

        if (mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);
        }
        System.out.println(mp1);// {A=5, B=3, C=10}
         // B vars degerini 5 ile carpın

        mp1.computeIfPresent("B", (k,v) -> v*5);
        System.out.println(mp1);//{A=5, B=15, C=10}

        // A varsa 5 azaltın

        mp1.computeIfPresent("A", (k,v) -> v-5);
        System.out.println(mp1); // {A=0, B=15, C=10}

        // map te D yoksa  value sunu 11 olarak ekleyelim
        if (!mp1.containsKey("D")){
            mp1.put("D",11);
        }
        System.out.println(mp1);;//{A=0, B=15, C=10, D=11}

        mp1.computeIfAbsent("E",v-> 8);
        System.out.println(mp1);// {A=0, B=15, C=10, D=11, E=8}

        mp1.compute("E",(k,v)-> v+4);
        System.out.println(mp1);// {A=0, B=15, C=10, D=11, E=12}

        // mp1.compute("R", (k,v)-> v*11);
        System.out.println(mp1);// NullPointerException

        mp1.compute("R", (k,v)-> v=71);
        System.out.println(mp1);//  {A=0, R=71, B=15, C=10, D=11, E=12}





    }


}
