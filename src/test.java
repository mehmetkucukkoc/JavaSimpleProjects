import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Kelime Giriniz");
        String kelime=scan.nextLine();
        for (int i = kelime.length()-1; i >=0; i--){
            String tersKelime="";
            tersKelime+=kelime.charAt(i);
            System.out.print(tersKelime);
        }
    }
}
