package Haftanın_Sorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
   ArrayList<String> users= new ArrayList<>();
   public ArrayList<String> register(){
      Scanner scan= new Scanner(System.in);
      String name =scan.nextLine();
      User user = new User(name, LocalDateTime.now());
      users.add(name);
      return users;
   }
}
