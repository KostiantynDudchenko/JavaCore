package javaCore.t4t1t9;

/*���������� �����, ����������� ������ ������� ������, ������ �� �������.

        ����� getCallerClassAndMethodName() ������ ���������� ��� ������ � ������, ������ ������ �����,
        ��������� ������ ��������� �����. ��� null (������� ������, � �� ������ "null"), ���� �����,
        ��������� getCallerClassAndMethodName() �������� ������ ����� � ���������, �.�. ��� ����� �� �������.

        ��� ���������, ��������, � ����������� �����������,
        ��� ��� ������� ��������� � ���� ���� �������� ����� � �����, ������ ��������� ���� ������������.

        ������

        package org.stepic.java.example;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        // ...
    }
}
    ��� ������� ��� ��������� ������ �������:

        null
        org.your.project.Test#main
        P.S. ��� ������������ ���� ��������� � ����� ���������� �� ������ �������� ������ ���������:
        ������ null � ������ ������� ����� ��������� �����-�� ����������� ����� � �����.
        ��� ������� � ���, ��� ����� ���������� ������ ��������� �� ��� �����, � ���� �����������,
        ������� ����� ��� �������� ���. ����� ����� ��������, ���������� ��������� �������� "java" � ��������� ������.

        P.P.S. ��� ������ � ����� ��� ���������� �� �������� :)*/

public class Test {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] methods = new Exception().getStackTrace();
        return (methods.length < 3) ? null : methods[2].getClassName() + "#" + methods[2].getMethodName();
    }
}




