package org.saurav;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class mailHandler {
    void sendMail() throws MessagingException {
        Properties sysProperties = System.getProperties();//this is give me hash table;
        System.out.println(sysProperties);
        sysProperties.put(MailMetaData.Host,MailMetaData.HostServer);
        sysProperties.put(MailMetaData.MailPort,MailMetaData.port);
        sysProperties.put(MailMetaData.sslProperty,"true");
        sysProperties.put(MailMetaData.authPermission,"true");

        //create a session using email and password;
        Authenticator mailAuthenticator = new CustomisedMailAuthentication();
        Session mailSession = Session.getInstance(sysProperties,mailAuthenticator);

        //mime message build
        MimeMessage mailMessage = new MimeMessage(mailSession);
        mailMessage.setFrom(MailMetaData.userMail);
        mailMessage.setSubject("This is my java code testing");
        mailMessage.setText("hey this is Saurav who is trying to send mail using java");

        //Receiver--->
        Address receiverAddress = new InternetAddress(MailMetaData.ReceiverMail);
        mailMessage.setRecipient(Message.RecipientType.TO,receiverAddress);
        Transport.send(mailMessage);
    }
}
