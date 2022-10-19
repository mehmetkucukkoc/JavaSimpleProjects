package A.Practices;

public class Pr_05 {
    public static void main(String[] args) {
        //task array elemanlarının çarpımını print eden kod yazınız.with for each
        int carpim=1;
        int arr[][]={{2,3},{4},{5,6,7}};
        for (int icDizi[]:arr){
            for(int elemanlar:icDizi){
                carpim*=elemanlar;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
