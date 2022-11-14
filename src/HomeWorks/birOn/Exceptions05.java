package HomeWorks.birOn;

public class Exceptions05 {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method
        // runn ederek ınteger'e cevirildiğinde oluşan RTE exception
        // java'da String içinde ki rakam karakterler parseInt()
        // method ile ınt değere atanabilir
        String str ="1453";
        System.out.println(str+5);//14535 -> concat edilir
        int sayi=Integer.parseInt(str);//str deki rakam karakter sayi variable atandı
        System.out.println(sayi+5);
       try {
           String str2 = "1453v571";
           int sati2 = Integer.parseInt(str2);
       }catch(NumberFormatException e){
           System.out.println("String içinde integer dışında değerler olduğu için metod görevini yapamadı");
       }
    }

}
