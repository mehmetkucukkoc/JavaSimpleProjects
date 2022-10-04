package j10_StringManipulations;

public class C08_Equals_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Merhaba";
        String str2="merhaba ";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));

        str2="merHaba";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str1));
    }
}
