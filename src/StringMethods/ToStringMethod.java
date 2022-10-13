package StringMethods;

public class ToStringMethod {
    public static void main(String[] args) {
        //her primitive tipe karşılık gelen kapsayıcı sınıfın sunmuş olduğu toString() methodu ile,
        // sayısal değerleri string tipine dönüştürebiliriz.

        int a = 5;
        double b = 5.3;

        String str = Integer.toString(a);
        String str2 = Double.toString(b);

        System.out.println(str + " " + str2);
    }
}
