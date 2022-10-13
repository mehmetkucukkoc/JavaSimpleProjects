package StringMethods;

public class CompareToMethod {
    public static void main(String[] args) {
        //The compareTo() method compares two strings lexicographically (in the dictionary order).
        // The comparison is based on the Unicode value of each character in the strings.
        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kolin";
        int result;

        // comparing str1 with str2
        result = str1.compareTo(str2);

        System.out.println(result);  // 0

        // comparing str1 with str3
        result = str1.compareTo(str3);

        System.out.println(result);  // -1

        // comparing str3 with str1
        result = str3.compareTo(str1);

        System.out.println(result);  // 1
    }
}
