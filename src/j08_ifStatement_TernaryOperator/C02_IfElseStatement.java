package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz.");
        int yas = sc.nextInt();
        if (yas >= 18) {
            System.out.println("Ehliyete başvurabilirsiniz..");
                    }
        else {System.out.println("ehliyet alamazsınız");
        }

    }
}

