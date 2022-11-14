package HomeWorks.birOn;

public class Exceptions06 {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException -> array'lerde olomayan bir index
        // elelmanı ile işlem yapıldığında oluşan RTE exception.
        int[] dizi = {12, 9, -6, 3, 54};
        System.out.println("dizi[3] = " + dizi[3]);
        try {
            System.out.println("dizi[6] = " + dizi[6]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dizide bulunmayan bir indeksi çağırmamalısın");
        }
    }
}