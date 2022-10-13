package StringMethods;

public class SubStringMethod {
    public static void main(String[] args) {
        //subString metodu:Stringleri bazen parçalamamız gerekebilir, bu durumda subString metodunu kullanırız.
        // İki farklı kullanımı vardır;tek parametre verildiğinde o sayıdan sonraki karakter kümesini almamızı sağlar,
        // iki parametre verildiğinde ise ilk parametreden başlayarak ikinci parametre sayısınca karakter
        // kümesini elde etmemizi sağlar.
        String s = "Bu Bir String Yazısıdır.";
        System.out.println(s.substring(7) + "\n" + s.substring(7, 13));

    }
}
