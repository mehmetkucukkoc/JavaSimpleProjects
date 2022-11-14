package HomeWorks.birOn;

public class Exceptions07 {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir
        // String'de length() method run edildiğnde oluşan RTE exception
        String str = "";
        System.out.println(str.length());//0
        String str2 = null;
        try {
            System.out.println(str2.length());//NullPointerException kod kırılır
        }catch (NullPointerException e){
            System.out.println("Null Stringin uzunluğu olmaz.");
        }

    }
}