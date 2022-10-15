package ArraysClassMethods;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        //önce sort sonra binary
        /*
        parametreler:

Aranacak dizi
Aranacak değer
Dönüş Türü: dizide yer alıyorsa, arama anahtarının dizini; aksi halde, (-(ekleme noktası) – 1)
         */
        Integer arr[] = {10, 30, 20, 3, 34, 90, 45, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 0, 6, 10));
    }
}
