package StringMethods;

public class ParseMethod {
    public static void main(String[] args) {
        //Bu tür kapsayıcı sınıflarda (wrapper classes), içlerinde string değerleri kendi tiplerine dönüştüren
        // methodlar tanımlamaktadır. parse…() ile başlayan bu methodlar ile, string olarak verilen değeri
        // bu tipe uygun sayısal değerlere çevirebilirsiniz.

        String str = "5";
        String str2 = "4.3";

        int a = Integer.parseInt(str);
        double b = Double.parseDouble(str2);

        System.out.println(a + " " + b);
        System.out.println(a + b);
//Çıktı
        //5 4.3
        //9.3
    }


}
