package HomeWorks.yirmiBirOtuz.Satis;

public class Runner {
    public static void main(String[] args) {

        double accountBalance = 1;

        Urun urun = new Urun();
        // System.out.println(urun.toString());
        Options options = new Options();
        //options.select(urun);

        urun.setPrice(options.select(urun));
        accountBalance = options.balance(urun.getPrice(), accountBalance,urun);
        //System.out.println(accountBalance);

    }
}
