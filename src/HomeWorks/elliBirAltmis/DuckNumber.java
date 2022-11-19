package HomeWorks.elliBirAltmis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = scan.nextLine();
       for (int i = 0; i <num.length(); i++){
           numbers.add(Integer.valueOf(String.valueOf(num.charAt(i))));

       }



        System.out.println((numbers.get(0)!=0&&numbers.contains(0))?num+" Duck Number":num+" Not Duck Number");

    }
}
