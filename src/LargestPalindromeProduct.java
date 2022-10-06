public class LargestPalindromeProduct {
    public static void main(String[] args) {

        int a = 999;
        int b = 100;
        int sayi = 1;

        for (int i=1;i<1000000;i++ ) {

            sayi = a * b;
            a--;
            b++;
            String s = Integer.toString(sayi);


            for (int j=s.length()-1; j >=0; j--){
                String tersS="";
                tersS+=s.charAt(j);
                if(s.equals(tersS)){
                    System.out.println(tersS);
                }

            }


            }
        }
    }





