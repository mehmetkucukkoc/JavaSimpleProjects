public class SigortaHesap {
    public static void main(String[] args) {
        double a =10000000;

        for(int i=1;i<=12; i++){
            double b=a/10;
            a+=b;

            System.out.println(i+".AY "+a+" ₺");
        }

    }
}
