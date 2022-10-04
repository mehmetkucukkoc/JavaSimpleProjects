package j10_StringManipulations.tasks2;

public class _18_String_methods14 {

    public static void main(String[] args) {

        /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.

String str="Clarus Way";
       str.replace(" ", "");
        System.out.println(str.substring(0, str.indexOf(" ")) + " " + str.substring(str.indexOf("W")));


    }
}
