package j08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
        int krmYas = 33;
        int ismYas = 40;
        if (krmYas == ismYas) {
            System.out.println("aynı yaştasınız");
            System.out.println("yoksa ikiz misiniz?");
        }
        if (krmYas == 40) System.out.println("kerim bey olgunluk yaşındasınız");
        if (krmYas + ismYas > 100) {
            System.out.println("yaşları toplamı yüzden büyük");
        }
    }
}
