package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Mail Adresi Giriniz");
        String mail = scan.nextLine();
        eMailController(mail);
    }

    public static void eMailController(String email) {

        int index = email.indexOf('@');

        if (email.contains(" @") || !email.contains(".") || !email.contains("@") || email.contains("" + "@" + "")) {
            System.out.println("Geçersiz Email");
        } else {
            System.out.println("Geçerli Email");
        }
    }

}

