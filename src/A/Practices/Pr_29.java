package A.Practices;

public class Pr_29 {
    public static void main(String[] args) {
        // TASK ->
        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);

    }
}
