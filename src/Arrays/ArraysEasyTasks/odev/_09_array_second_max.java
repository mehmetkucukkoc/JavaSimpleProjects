package Arrays.ArraysEasyTasks.odev;
import java.util.Arrays;
public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int arr[] = {15, 25, 22, 18, 30};
       Arrays.sort(arr);

        int max=0;

        for(int i=0;i< arr.length-1; i++){
            if (i==0){
                arr[i]=max;

            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);


    }
}
