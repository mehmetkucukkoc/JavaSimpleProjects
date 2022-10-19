package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_15 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
List<Integer>sayiList=new ArrayList<>(List.of(1,5,2,3,2,7,4,2));
int toplam=0;
for (int i:sayiList){
    System.out.println(i+"*"+i+"=" + i * i);
    toplam+=i*i;
}
        System.out.println("toplam = " + toplam);
    }
}

