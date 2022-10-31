import java.io.FileOutputStream;
import java.io.IOException;

public class Deneme9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileoutput_stream = new FileOutputStream("dosya.txt");
      // for (int i=1;i<=110;i++){fileoutput_stream.write(65);
      //  fileoutput_stream.write(75);}
      // byte[]baba={66,65,66,65};
       //fileoutput_stream.write(baba);
       String isim="Mehmet KÜÇÜKKOÇ";
       byte[]isimDizi=isim.getBytes();
       fileoutput_stream.write(isimDizi);
    }
}
