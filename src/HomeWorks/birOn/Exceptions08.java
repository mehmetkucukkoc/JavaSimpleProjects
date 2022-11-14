package HomeWorks.birOn;

public class Exceptions08 {
    public static void main(String[] args) {
        // ClassCastException -> Biribirne dönüştürülemeyen
        // data type'lar biribirine dönüştürüldüğünde oluşan RTE Exception dur
        Object obj1 = "Mehmet";
        Object obj2 = 1986;
        String str = (String) obj1;//object data type String data type casting yapılarak atandı
        System.out.println(str);
        String sayi = (String) obj2;//object data type String data type casting yapılarak atandı
        try {
            System.out.println(sayi);//ClassCastException


        }catch(ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}