package javaCore.t4t2t6;

public interface BankWorker {

    boolean checkClientForCredit (BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
}
