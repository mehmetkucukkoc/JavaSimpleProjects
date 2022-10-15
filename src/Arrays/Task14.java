package Arrays;

public class Task14 {
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

       String str2=str.replaceAll("[a-z]","");
        System.out.println(str2);
        String str3[]=str2.split("");
       int toplam = 0;
       for (int i = 0; i <str3.length; i++){
           int sayi=Integer.parseInt(str3[i]);
           toplam+=sayi;
       }
        System.out.println("toplam = " + toplam);

        //justSumOfDigits(str);


    }

   // public static void justSumOfDigits(String str) {
      //  str.replaceAll("\\s","");



    }




