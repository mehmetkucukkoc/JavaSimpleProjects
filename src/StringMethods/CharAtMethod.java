package StringMethods;

public class CharAtMethod {
    public static void main(String[] args) {
        //CharAt():Bu method ile string içinde, verilen pozisyondaki karakteri döndürebilirsiniz.
        // Diziler üzerinde işlem yapmaya benzer. Stringler içerisindeki karakterlerin 0 dan başladığını hesaba katar.
        String str = "Java Programlama";
        System.out.print(str.charAt(0)+ " ");
        System.out.println(str.charAt(5));


        String st1="Programlama";
        int i;

        for(i=0; i<=st1.length()-1; i++) {
            System.out.println("");
            System.out.println(st1.charAt(i));
        }
    }
}
