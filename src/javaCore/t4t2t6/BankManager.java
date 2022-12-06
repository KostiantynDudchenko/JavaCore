package javaCore.t4t2t6;

public class BankManager implements BankWorker {
    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException{
            if (bankClient.isBadCreditHistory()) {
                throw new BadCreditHistoryException();
            }
            if (bankClient.isHasProblemWithLaw()) {
                throw new ProblemWithLawException();
            }
        return true;
    }

    // решение этого метода не проверялось
}
