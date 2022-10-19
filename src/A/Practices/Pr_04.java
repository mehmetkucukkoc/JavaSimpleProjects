package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_04 {
    public static void main(String[] args) {
        //2 ile 5 index elemanlarını toplamını print ediniz.
        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
int toplam=0;
for(int a:sayiList.subList(2,6)){
    toplam+=a;
}    System.out.println("toplam = " + toplam);







    }
}
