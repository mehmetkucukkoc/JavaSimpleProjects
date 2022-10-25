public class Deneme2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int sayi;
        int toplam = 0;
        for (int i = 2; i < 10000000; i++) {

            sayi = i;

            g = sayi % 10;
            sayi /= 10;
            f = sayi % 10;
            sayi /= 10;
            e = sayi % 10;
            sayi /= 10;
            d = sayi % 10;
            sayi /= 10;
            c = sayi % 10;
            sayi /= 10;
            b = sayi % 10;
            sayi /= 10;
            a = sayi % 10;
            // System.out.println(a);
            // System.out.println(b);
            // System.out.println(c);
            // System.out.println(d);
            // System.out.println(e);
            //  String s = ("" + a + b + c + d + e);
            //  System.out.println(s);
//
            //  int sayi2 = Integer.parseInt(s);
            //  System.out.println(sayi2);

            if (i == a * a * a * a * a +
                    b * b * b * b * b +
                    c * c * c * c * c +
                    d * d * d * d * d +
                    e * e * e * e * e +
                    f * f * f * f * f +
                    g * g * g * g * g) {
                System.out.println(i);

               toplam += i;

            }

        }
        System.out.println("toplam = " + toplam);

    }
}
