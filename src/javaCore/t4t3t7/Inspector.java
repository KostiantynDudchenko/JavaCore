package javaCore.t4t3t7;

import static javaCore.t4t3t7.AbstractSendable.BANNED_SUBSTANCE;
import static javaCore.t4t3t7.AbstractSendable.WEAPONS;

public class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent().contains(WEAPONS) ||
                    mailPackage.getContent().getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if (mailPackage.getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
