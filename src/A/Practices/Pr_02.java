package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_02 {
    public static void main(String[] args) {
        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        //task list elemanlarını ayrı satırlara print ediniz.

        for(int i:sayiList)System.out.println(i);
    }
}
