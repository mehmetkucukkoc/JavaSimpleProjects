package HomeWorks.onBirYirmi.HesapMakinesi;

public class HesapMakinesi {
    double x;
    double y;
    char islem;

    public HesapMakinesi(int x, int y, char islem) {
        this.x = x;
        this.y = y;
        this.islem = islem;

    }
    public HesapMakinesi() {

    }


    public double topla(double x, double y) {
        return x + y;
    }

    public double cikarma(double x, double y) {
        return x - y;
    }

    public double carpma(double x, double y) {
        return x * y;
    }

    public double bolme(double x, double y) {
        return x / y;
    }

    public void hesapla() {
        switch (islem) {
            case '+':
                System.out.println(topla(x, y));
                break;
            case '-':
                System.out.println(cikarma(x, y));
                break;
            case 'x':
                System.out.println(carpma(x, y));
                break;
            case '/':
                System.out.println(bolme(x, y));
                break;
        }


    }
}