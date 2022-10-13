package StringMethods;

public class IsEmptyMethod {
    public static void main(String[] args) {
        //String length'inin 0 olup olmadığını (boş olup olmadığını) kontrol eder boşsa true değilse false döner
        //parametre almaz.
        String myStr1 = "Hello";
        String myStr2 = "";
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.isEmpty());
    }
}
