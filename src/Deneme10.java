import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Deneme10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("dosya.txt"));
        while(scan.hasNextLine()){System.out.println(scan.nextLine());}
    }
}
