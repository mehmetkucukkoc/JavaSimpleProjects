package HomeWorks.yirmiBirOtuz;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        for (int i =1;i<100;i++){
            //Yöntem 1
           // int abc = (int)(Math.random()*101);
           // System.out.println(abc);
           // System.out.println((int) (Math.random() * 101));
            //Yöntem 2
            Random random = new Random();
            System.out.println(random.nextInt(101));

        }
    }

}
