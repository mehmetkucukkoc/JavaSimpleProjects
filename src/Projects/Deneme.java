package Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {
        String array[]= {"Muhiddin","Selami","Hamdi","Ceylan"};
        Integer array1[]= {90,21,55,67};

        List listele=new ArrayList();
        List listele1=new ArrayList();//Dizilerimizi liste görünümüne aldık.

        listele= Arrays.asList(array);
        listele1=Arrays.asList(array1);//aslist metodumuz ile liste yapısına dönüştürdük.
        //listelediğimiz dizilerimizi yazdırdık.
        System.out.println(listele.get(0));
        System.out.println(listele);
        System.out.println(listele1.get(0));
        System.out.println(listele1);


    }
}




