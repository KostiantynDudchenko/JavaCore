package javaCore.t4t3t7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    Logger LOGGER;

    public Spy(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailMessage message = null;
        if(mail instanceof MailMessage) {
            message = (MailMessage) mail;
            if (mail.getFrom().equals(AbstractSendable.AUSTIN_POWERS) || mail.getTo().equals(AbstractSendable.AUSTIN_POWERS)) {
                LOGGER.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object[] {mail.getFrom(), mail.getTo(), message.getMessage()});
            } else {
                LOGGER.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {mail.getFrom(), mail.getTo()});
            }
        }
        return mail;
    }
}
