package A.Practices;

public class Pr_07 {
    public static void main(String[] args) {
        //array elemanlarının işaretini değiştiren bir method create ediniz.
        int arr[]={1,2,-3,4,-5,-6};
        eksiYap(arr);
    }

    private static void eksiYap(int arr[]) {
        for(int a:arr){
            a*=-1;
            System.out.print(a+" ");
        }

    }
}
