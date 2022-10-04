package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("bir cümle gir");
        String str=sc.next();
        System.out.println("bir index gir");
        int index =sc.nextInt();
        System.out.println(str.charAt(index));
        System.out.println(str.substring(index, index + 1));

        String harfDepo="ABCDEFGHIJKLMNOPQRSTUVYZ";
       



    }
}
