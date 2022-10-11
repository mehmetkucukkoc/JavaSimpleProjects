package ProjectEulerNet;

public class Problem4_LargestPalindromeProduct {
    public static void main(String[] args) {


        for (int sayi = 100000; sayi <= 1000000; sayi++) {

            String strSayi = Integer.toString(sayi);
            String tersstrSayi = "";
            for (int i = 0; i < strSayi.length(); i++) {

                tersstrSayi = strSayi.charAt(i) + tersstrSayi;
                int inttersstrSayi = Integer.valueOf(tersstrSayi);

                if (sayi == inttersstrSayi) {
                    System.out.println(sayi + " Sayısı Palindromdur");
                    for (int a = 100; a < 1000; a++) {

                        if (sayi % a == 0) {
                            int b = sayi / a;
                            if (b < 1000) {
                                System.out.println(a + "ve" + b);
                            }
                        }
                    }
                    break;
                }
            }


        }
    }

}

