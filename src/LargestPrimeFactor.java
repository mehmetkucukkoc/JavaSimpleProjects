public class LargestPrimeFactor {
    public static void main(String[] args) {

        int bolunenSayi = 1000;
        int bolenSayi=2;
        while (bolenSayi <= bolunenSayi) {
            if (bolunenSayi % bolenSayi == 0) {
                System.out.println(bolenSayi);
                bolunenSayi /= bolenSayi;
            } else bolenSayi++;

        }


    }
}
