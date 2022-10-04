package simpleJavaProjects;




public class ReturnMetod {
    public static void main(String[] args) {
        String isim = "MEHMET";
        String soyisim = "KÜÇÜKKOÇ";
        String isimSoyisim = isimDuzenle(isim, soyisim);
        System.out.println(isimSoyisim);
    }

    private static String isimDuzenle(String isim, String soyisim) {

        String isimDuzenlenmis = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();
        return isimDuzenlenmis +" "+ soyisimDuzenlenmis;

    }

}
