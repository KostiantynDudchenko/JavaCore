package javaCore.t4t3t7;

public class Thief implements MailService {
    private int minPackagePrice;
    private double stolenValue = 0;

    public Thief(int minPackagePrice) {
        this.minPackagePrice = minPackagePrice;
    }

    public int getStolenValue() {
        return (int) stolenValue;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage mailPackage = null;
        if (mail instanceof MailPackage) {
            mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getPrice() > minPackagePrice) {
                stolenValue += mailPackage.getContent().getPrice();
                return new MailPackage(mailPackage.getFrom(), mailPackage.getTo(), new Package("stones instead of " + mailPackage.getContent().getContent(), 0));
            }
        }
        return mail;
    }
}
