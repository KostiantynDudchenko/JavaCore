package javaCore.t7t1t8;


/*�������� ����� � ��������� sqrt, ������� ���������� ���������� ���������������
���������� UnaryOperator, ������� ��������� ����� �����(��� int) � ���������� ��� �������.

����������:
1. ������ ���� ����� public UnaryOperator sqrt()
2. ����� ������ ���������� ���������� ���������� UnaryOperator.
3. ���������� ������ ��������������� �������*/

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static UnaryOperator<Integer> sqrt() {
         return x -> x * x;//���� ��� �����
    }

    public static void main(String[] args) {
    }
}
