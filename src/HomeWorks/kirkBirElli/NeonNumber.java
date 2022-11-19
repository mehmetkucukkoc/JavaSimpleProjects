package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num=sc.nextInt();
        int sq=(int)Math.pow(num,2);
        System.out.println("sq = " + sq);
        int sum=0;
        while(sq > 0){
            sum+=sq%10;
            sq/=10;
        }
        System.out.println(num==sum?"Neon Number":"Not Neon Number");

    }
}
