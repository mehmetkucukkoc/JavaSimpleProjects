package EMailRegistration;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {

    EMailRegistration user1 = new EMailRegistration("Seda", "Küçükkoç");

    public void messageSender() {

        final String username = "mhmtkckkc@gmail.com";
        final String password = "";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("mhmtkckkc@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("sedakckkc@gmail.com")
            );
            message.setSubject("Bu Mail Java Üzerinden Gönderilmiştir.");
            message.setText("Sayın " + user1.firtsName + " " + user1.lastName + " İşe Alındınız " +
                    "Departmanınız : " + user1.setDepartment() +
                    "E-Mail Adresiniz :  " + user1.setRandomEmail() +
                    "Şifreniz :  " + user1.setRandomPassWord());


            Transport.send(message);

            System.out.println("Gönderildi");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}



