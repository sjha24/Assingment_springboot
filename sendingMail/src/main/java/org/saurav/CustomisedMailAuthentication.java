package org.saurav;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomisedMailAuthentication extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailMetaData.userMail,MailMetaData.userPassword);
    }
}
