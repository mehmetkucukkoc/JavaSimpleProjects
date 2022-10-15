package Arrays.ArraysEasyTasks.odev;

public class _06_Array_contains {

    public static <arr> void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

String arr[]={"Apple","Orange","Banana","Pineapple"};
boolean varMı;

       for(int i=0;i< arr.length; i++){
           if(arr[i]=="Apple"){
               System.out.println(varMı=true);
           }
       }


    }
}
