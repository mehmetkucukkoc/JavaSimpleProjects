package ArrayListTasks.Tasks;
import java.util.Arrays;
public class Deneme {
    public static void main(String[] args) {


        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String arr[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    arr[i][j] = arr[i][j].replace("$", "");

                }
                if (arr[i][j].contains("€")) {
                    arr[i][j] = arr[i][j].replace("€", "");
                }int arr2[][] =new int[arr.length][arr[i].length];
                arr2[i][j] = Integer.parseInt(arr[i][j]);
                System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
            }

        }


    }

}
