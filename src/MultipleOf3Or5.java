public class MultipleOf3Or5 {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i=1;i<1000; i++) {
            if(i%3==0||i%5==0){
                toplam +=i;

            }
        }System.out.println(toplam);


    }
}
