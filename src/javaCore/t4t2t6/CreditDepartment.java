package javaCore.t4t2t6;

public class CreditDepartment {

    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient)  {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException | ProblemWithLawException e) {
            if (e instanceof BadCreditHistoryException) {
                System.out.println("Проблемы с банковской историей");
            }
        }
        return false;
    }
}
