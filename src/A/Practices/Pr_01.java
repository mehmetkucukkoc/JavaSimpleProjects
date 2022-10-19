package A.Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Pr_01 {
    public static void main(String[] args) {

List<String> name = new ArrayList<>(Arrays.asList("hardy","ashley","elly"));
System.out.println(name);
for(int i= 0;i<name.size(); i++){
    name.set(i,name.get(i).toUpperCase());
}







    }
}
