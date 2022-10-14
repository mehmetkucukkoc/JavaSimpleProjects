package MathClass;

public class MutlakDegerAlma {
    public static void main(String[] args) {

        // Custom integer input received from user
        int n = -7;

        // Printing value before applying absolute function
        System.out.println(
                "Without applying Math.abs() method : " + n);

        // Applying absolute math function and
        // storing it in integer variable
        int value = Math.abs(n);

        // Printing value after applying absolute function
        System.out.println(
                "With applying Math.abs() method : " + value);
    }
}
