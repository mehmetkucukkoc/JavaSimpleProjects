package Arrays.ArraysEasyTasks.odev;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
int arr[]={12,14,21,23,10,4};
int length=arr.length;
int toplam=0;
for (int i = 0; i < arr.length; i++){
    toplam+= arr[i];


}
        System.out.println(toplam/length);

    }
}