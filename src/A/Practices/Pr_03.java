package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_03 {
    public static void main(String[] args) {
        //ilk üç eleman hariç tek olanları print ediniz.
        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));

        for(int a:sayiList.subList(3, sayiList.size())){
            if (a%2==1){
                System.out.println(a+" ");
            }
        }









    }
}
