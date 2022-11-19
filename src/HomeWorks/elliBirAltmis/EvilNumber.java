package HomeWorks.elliBirAltmis;

import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("binary = " + binary);
        int counter = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (Integer.parseInt(String.valueOf(binary.charAt(i))) == 1) {
                counter++;
            }



        } if (counter != 0 && counter % 2 == 0) {
            System.out.println("Evil Number");
        } else System.out.println("Not Evil Number");


    }


}
