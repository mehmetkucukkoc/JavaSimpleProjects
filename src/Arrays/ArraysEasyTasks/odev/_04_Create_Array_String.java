package Arrays.ArraysEasyTasks.odev;

public class _04_Create_Array_String {

    public static void main(String[] args) {

        /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */
String arr[]={"New Jersey", "New York", "Boston", "California"};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++)
        {
            toplam ++;
        }
        System.out.println("toplam = " + toplam);



    }
}
