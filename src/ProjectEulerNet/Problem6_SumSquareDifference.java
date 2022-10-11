package ProjectEulerNet;

public class Problem6_SumSquareDifference {
    public static void main(String[] args) {

int i;
int iToplam=0;
int iSon;
int j;
int jToplam=0;

        for (i = 1; i <= 100; i++){
            iToplam=i+iToplam;

        }iSon=iToplam * iToplam;
        System.out.println(iSon);
        for (j = 1; j <= 100; j++){
            jToplam=j*j+jToplam;
        }
        System.out.println(jToplam);
        System.out.println(iSon - jToplam);
    }
}
