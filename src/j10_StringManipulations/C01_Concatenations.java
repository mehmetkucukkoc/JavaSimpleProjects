package j10_StringManipulations;

public class C01_Concatenations {
    public static void main(String[] args) {

        /*
       concat() metodu içine (parametre) aldığı string variable çalıştığı stringin sonuna ekler.
       Javada + işlemi eğer en az bir string variable varsa java toplam değil concat yapar
         */

        String name="Nur";
        String meslek=" Qa tester";
        System.out.println(name.concat(meslek));
        // string metodları variable geçici değişiklik yapar ama atama yapılırsa kalıcı olur.
        name=meslek.concat(name);
        System.out.println(name);

        System.out.println(name.concat(true + ":)"));

        //concat metodu string type harici tüm dataları stringe çevirip concat eder


    }
}
