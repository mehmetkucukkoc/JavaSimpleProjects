package StringMethods;

public class TrimMethod {
    public static void main(String[] args) {
        //trim metodu: Stringlerin başındaki sonundaki tab yada boşlukları siler.
                String s = "\t Bu bir Matematik Yazısıdır";
                String s1 = " Bu bir Matematik Yazısıdır";
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s1);
        System.out.println(s1.trim());
    }
}
