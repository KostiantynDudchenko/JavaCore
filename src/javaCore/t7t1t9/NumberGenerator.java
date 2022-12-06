package javaCore.t7t1t9;

/*�������� �������������� ��������� NumberGenerator, ����������������� ����� �������,
��� ��������� ������ ����������� ������ Number, ������� ����� boolean cond(T arg).

�������� � ������ public static NumberGenerator<? super Number> getGenerator() �
������� ������ ��������� ���������� NumberGenerator, ������� ���������� true,
���� ����� � int ����������� ������ 0.

����������:
1. ������ ���� ����� public static NumberGenerator<? super Number> getGenerator()
2. ���������� ��� ����� ��� ��������������.
3. ��� ��������� ������ ���� "�"
4. ����� ������ ���������� ���������� ����������*/

public interface NumberGenerator <T extends Number> {
        boolean cond(T arg);
}
