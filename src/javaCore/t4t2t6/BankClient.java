package javaCore.t4t2t6;

/*���� ����� BankClient - ��� �����, ����������� ������� �����.

        ���� ��������� BankWorker. ������ ������, ������� ��������� ���� ���������
        �������� ���������� �����, � ������ �������� ������ ��������� ��� ����������
        ������ �� �������.

        � ���� ���� ����� checkClientForCredit, ������� �� ���� ��������� ���������
        BankClient � ���������� true, ���� �� �������� � ������ ����������� �������
        ����� ��������, ��� false - ���� ������ �� �������� ��� ������� �������. �����,
        ���� ����� ����� ��������� ���������� BadCreditHistoryException, ���� � �������
        ������ ��������� �������. ��� ProblemWithLawException, ���� � ������� ���� �������� � �������.

        ���� ������:

        ����������� ����� getCreditForClient, ������� ��������� ��������� ����� � �������,
        ������� ����� �������� ������. ����� ������ ���������� true - ���� ������ ������ �����
        � ��� ������� ��������� � false ���� ���� �����-�� ��������. ���� ������� �������� �
        ������ ������� �� ������� ������ ���������� ������� - ����� ������ �������� � �������
        ��������� "�������� � ���������� ��������", ���� ������� �������� �� ������� ������� �
        ������� �� ������ �������� �� ����� �� �����.*/

public class BankClient {

    private String name;
    private boolean isBadCreditHistory;
    private boolean hasProblemWithLaw;

    public BankClient(String name, boolean isBadCreditHistory, boolean hasProblemWithLaw) {
        this.name = name;
        this.isBadCreditHistory = isBadCreditHistory;
        this.hasProblemWithLaw = hasProblemWithLaw;
    }

    public boolean isBadCreditHistory() {
        return isBadCreditHistory;
    }

    public boolean isHasProblemWithLaw() {
        return hasProblemWithLaw;
    }

}
