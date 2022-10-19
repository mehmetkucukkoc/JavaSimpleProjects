package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_06 {
    public static void main(String[] args) {
        //task iki string elemanlarının ortak olmasını kontrol eden kod create ediniz for each ile
        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","ciğdem"};
        String arr2[]={"musty","gülsüm","ayşe","enise","cüneyt","ciğdem"};
        List<String> ortakIsim=new ArrayList<>();
        for(String s1:arr1){
            for(String s2:arr2){
                if(s1.equalsIgnoreCase(s2)){
                    ortakIsim.add(s1);
                    System.out.println("s1 = " + s1);
                }
            }
        }if(ortakIsim.isEmpty()){
            System.out.println("ortak isim yok");
        }else System.out.println(ortakIsim);
    }
}
