public class Deneme7 {
    public static void main(String[] args) {
       int a[]= new int[100];
        System.out.println(a.length);
        int counter=0;
        for (int i=0;i<a.length;i++){
           counter++;
            System.out.println("i = " + i);
        }

        System.out.println("counter = " + counter);
    }
}
