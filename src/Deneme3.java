public class Deneme3 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println("a/b = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Hatanız Bu : " + e);
        }

        System.out.println("kod çalışmaya devam etti");

    }

}





