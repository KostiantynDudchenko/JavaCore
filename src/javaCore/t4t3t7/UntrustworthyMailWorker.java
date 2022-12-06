package javaCore.t4t3t7;

import java.util.Set;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        realMailService = new RealMailService();
    }
    public RealMailService getRealMailService() {
        return realMailService;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        Sendable stolenMail = mail;
        for (MailService mailService : mailServices) {
            stolenMail = mailService.processMail(stolenMail);
        }
        return getRealMailService().processMail(stolenMail);
    }
}
