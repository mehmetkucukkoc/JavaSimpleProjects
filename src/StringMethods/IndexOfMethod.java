package StringMethods;

public class IndexOfMethod {
    public static void main(String[] args) {
        //indexof:Stringimizin içerisindeki herhangi bir karakterin veya stringin hangi sırada olduğunu döndürür.
        // Ancak Java sıfırdan saymaya başlar.
                String str = "Java Programlama";
        System.out.println("a harfi ilk olarak : " + str.indexOf('a') + " sırada bulundu");
        System.out.println("a harfi 2. indexden sonra " + str.indexOf('a', 2) + " sırada bulundu");
        System.out.println("gram altstringi " + str.indexOf("gram") + " sırada bulundu");
    }
}
