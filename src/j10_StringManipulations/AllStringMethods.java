package j10_StringManipulations;

public class AllStringMethods {
    public static void main(String[] args) {
        String str="Madem Geldin Dünya'ya Otur Çalış Javaya.";
        String str2="Madem Geldin Dünya'ya Otur Çalış Javaya.....";
        String str3="JAVA ";
        String str4="java";
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0,25));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.compareToIgnoreCase(str4));
        System.out.println(str3.concat(str4));
        System.out.println(str.contains("AV"));
        System.out.println(str.contains("av"));
    }
}
