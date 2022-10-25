import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listArr = new ArrayList<>();

        for (int n = 1; n <= 10; n++) {
            String str[] = scan.nextLine().split(" ");
            //if(str[1].equals("5")){};
            for (int i = 0; i < str.length; i++) {

                listArr.add(str[i]);
            }
            for (int j = 0; j < listArr.size(); j++) {
                for (int k = j + 1; k < listArr.size(); k++) {


                    if (listArr.get(j).equalsIgnoreCase(listArr.get(k))) {
                        listArr.remove(k);
                    }

                }
            }
            for (int j = 0; j < listArr.size(); j++) {
                for (int k = j + 1; k < listArr.size(); k++) {


                    if (listArr.get(j).equalsIgnoreCase(listArr.get(k))) {
                        listArr.remove(k);
                    }

                }
            }
            for (int m = 0; m < listArr.size(); m++) {
                if(listArr.get(m).equals("5")){break;};
                System.out.print(listArr.get(m) + " ");
            }
            System.out.println("");
            Arrays.fill(str, null);
            listArr.clear();


        }
    }
}
