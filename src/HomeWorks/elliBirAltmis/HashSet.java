package HomeWorks.elliBirAltmis;

import java.util.List;
import java.util.Set;

public class HashSet {


    public static void main(String[] args) {
       /*
    SetTask01
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
        Set<String> hashset = new java.util.HashSet<String>(List.of("banana", "strawberry", "kiwi", "pineapple"));
        String str1 = "banana";
        String str2 = "peach";
        changeSet(hashset, str1, str2);
    }
    private static void changeSet(Set<String> hashset, String str1, String str2) {
        if(hashset.removeIf(m -> m.contains(str1))) hashset.add(str2);
        System.out.println(hashset);
    }
}


