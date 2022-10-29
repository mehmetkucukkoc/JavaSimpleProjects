package EMailRegistration;

import java.util.Random;
import java.util.Scanner;

public class EMailRegistration {
    String firtsName;
    String lastName;
    String passWord;
    String department = "";
    String email = "";
    String emailSuffix;
    int mailBoxCapasity;//1000
    int defaultpassWordLenght;//12

    public EMailRegistration(String firtsName, String lastName) {
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public String setDepartment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yeni Personel İçin Bir Departman Seçiniz.");
        System.out.println("Test Automation Engineer İçin 1'e Basınız.");
        System.out.println("Full-Stack Developer İçin 2'ye Basınız.");
        System.out.println("Salseforce İçin 3'e Basınız.");
        System.out.println("Departman Seçmeyecekseniz 4'e Basınız.");
        int departmentNo= scan.nextInt();
        switch (departmentNo) {
            case 1:
                department = "Test Automation Engineer";
                break;
            case 2:
                department = "Full-Stack Developer";
                break;
            case 3:
                department = "SalseForce";
                break;
            default:
                System.out.println("Herhangi Bir Departman Seçmediniz");
                break;

        }


        return this.department = department;
    }

     String setRandomEmail() {
        String domain = "clarusway.com";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (email.length() < 10) {
            int character = (int) (Math.random() * 26);
            email += alphabet.substring(character, character + 3);
            email += Integer.valueOf((int) (Math.random() * 99));
            email += "@" + domain;
        }
        return this.email = email;
    }

    public String setRandomPassWord() {
        String characters = "";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String combination = upper + lower + num + specialChars;
        int passwordlen = 12;
        char[] password = new char[passwordlen];
        Random random = new Random();

        for (int i = 0; i < password.length; i++) {
            password[i] = combination.charAt(random.nextInt(combination.length()));
        }
        System.out.println("Şifreniz : " + new String(password));
        return this.passWord = String.valueOf(password);


    }


    public String showInfo() {
        return "firtsName=" + firtsName +
                ", lastName=" + lastName +
                ", passWord=" + passWord +
                ", email=" + email +
                ", department=" + department
                ;

    }
}
