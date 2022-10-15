package Arrays;

public class Task15 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";

        String str2 = str.replaceAll("[a-z]", "");
        System.out.println(str2);
        int sayi=Integer.parseInt(str2);
        System.out.println(sayi-3);
        int toplam = 0;
        int a=0;
        for(;sayi!=0; sayi/=10){
a++;
         toplam+=sayi%10;
        }
        System.out.println(toplam);
        System.out.println(a);

    }
}




