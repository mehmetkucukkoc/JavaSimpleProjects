package Arrays.ArraysEasyTasks.odev;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);


        }
        System.out.println("tersStr = "+ tersStr);

    }
}