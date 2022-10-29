import java.util.Scanner;

public class Deneme8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfEl = scan.nextInt();
        int toplam = 0;
        int counter = 0;
        if (numOfEl <= 100 && numOfEl >= 1) {
            int arr[] = new int[numOfEl];
            for (int m = 0; m < numOfEl; m++) {
                int sayi = scan.nextInt();
                if (sayi <= 10000 && sayi >= -10000) {
                    arr[m] += sayi;
                }

            }

            int n = arr.length;

            for (int i = 0; i < n; i++)
            {
                for (int j = i; j < n; j++)
                {
                    for (int k = i; k <= j; k++)

                    {
                        System.out.println("k = " + k);
                        System.out.println("j = " + j);
                        toplam += arr[k];
                    }

                    if (toplam < 0) {
                        counter++;
                    }

                }
            }

        }System.out.println(counter);

    }
}



