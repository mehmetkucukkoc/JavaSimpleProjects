package j06_Comparison_Karsılasttrma_Operatoru;

public class C01_Comparison {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */

        int slmYas=33;
        int krmYas=41;
        System.out.println("eşit mi " + (slmYas==krmYas));
        System.out.println("eşit mi " + (slmYas!=krmYas));
        System.out.println("eşit mi " + (slmYas<krmYas));
        System.out.println("eşit mi " + (slmYas>krmYas));

        String s1="memo";
        String s2="memo";
        System.out.println("eşit mi " + (s1==s2));


    }
}
