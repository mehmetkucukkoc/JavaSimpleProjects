package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme2 {

    public static void main(String[] args) {
       String arrStr[] ={"ali", "veli", "deli", "elli"};
       Integer arrInt[]={10,20,30,40,50,60,70,80,90,100};

        System.out.println(arrStr[0]);
        System.out.println(arrStr[1]);
        System.out.println(arrStr[2]);
        System.out.println(arrStr[3]);
        System.out.println(arrStr[0]);
for (int i =0;i<arrInt.length; i++)System.out.println(  i);

    List listeleStr= new ArrayList();
    List listeleInt= new ArrayList();
    listeleStr= Arrays.asList(arrStr);
        System.out.println(listeleStr.get(0));
        System.out.println(listeleStr);
  String s = new String();
          s= (String) listeleStr.get(1);
        System.out.println(s);
        listeleInt= Arrays.asList(arrInt);
        System.out.println(listeleInt);
        Integer copyArrInt[]=Arrays.copyOf(arrInt,2);
        System.out.println(copyArrInt[0]);
        Integer copyArrInt2[]=Arrays.copyOfRange(arrInt,2,8);
        System.out.println(copyArrInt2[5]);
        Arrays.fill(arrInt,0,7,200);
        System.out.println(arrInt[0]);
        System.out.println(arrInt[7]);
        System.out.println(arrInt[6]);
   String sss = Arrays.toString(arrInt);
        System.out.println(sss);
        for (int i=0;i<sss.length();i++){
            System.out.println(i);

        }System.out.println(sss.concat("abc"));

    }
}




