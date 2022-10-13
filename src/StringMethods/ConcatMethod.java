package StringMethods;

public class ConcatMethod {
    public static void main(String[] args) {
        //concat metodu:İki stringi birleştirmeyi sağlayan metodtur.
        // Println metodlarında yaptığımız “+” operatorünün yerine kullanılabilir.
                String s = "Birinci cümlemiz. ";
        String s2 = "İkinci cümlemiz. ";
        String s3 = s.concat(s2);
        System.out.println(s3);

    }
}
