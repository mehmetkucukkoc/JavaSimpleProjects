package ProjectEulerNet;

public class Problem9_SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (a = 1; a <= 1000; a++) {
            for (b = 1; b <= 1000; b++) {
                for (c = 1; c <= 1000; c++) {
                    if ((a * a + b * b == c * c)&&(a+b+c==1000)) {
                        System.out.println(a + " " + b + " " + c);
                        break;
                    }
                }
            }

        }
    }

}

