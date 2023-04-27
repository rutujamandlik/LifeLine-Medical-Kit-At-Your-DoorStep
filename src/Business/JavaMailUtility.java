/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
import Business.UserAccount.UserAccount;
import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author divya
 */
public class JavaMailUtility {

    public static void sendMail(String recepient, UserAccount account) throws Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.starttls.enable", "true");
        properties.put("mail.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
        String myAccountEmail = "lifelinecheck@gmail.com";
        String password = "Lifelinecheck@123";
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });
        Message message = prepareMessage(session, myAccountEmail, recepient, account);
        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, UserAccount account) throws MessagingException {
        Message message = new MimeMessage(session);
        Multipart multipart = new MimeMultipart();
        MimeBodyPart attachPart = new MimeBodyPart();
        String attachFile = "/Users/milindsharma/Desktop/LifeLine/TestResults.pdf";
        DataSource source = new FileDataSource(attachFile);
        attachPart.setDataHandler(new DataHandler(source));
        attachPart.setFileName(new File(attachFile).getName());
        try {
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Tests Report");
// message.setText("Recieved"); 
            String msg = "Hi " + account.getEmployee().getName() + "! Please find your attached report.";
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(msg, "text/html");
// Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachPart);
            message.setContent(multipart);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
