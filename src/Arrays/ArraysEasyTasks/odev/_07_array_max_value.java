package Arrays.ArraysEasyTasks.odev;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
int arr[]={15,2,5,12,8,100};
int max=0;
int min=0;
        for(int i=0;i< arr.length; i++){
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

