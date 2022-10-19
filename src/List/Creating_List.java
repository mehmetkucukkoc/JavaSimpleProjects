package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Creating_List {
    public static void main(String[] args) {
        List<Integer> listSayi = new ArrayList<>();

        listSayi.add(1);
        listSayi.add(9);
        listSayi.add(0);
        listSayi.add(5);
        System.out.println(listSayi);
        listSayi.add(3, 7);
        System.out.println(listSayi);
        ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("ali", "veli", "deli, elli"));
        System.out.println(listIsim);
        ArrayList<String> list = new ArrayList<>(List.of("12", "23", "34", "34"));
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("34")) {
                list.remove(i);
            }
        }
        System.out.println(list);


    }
}
