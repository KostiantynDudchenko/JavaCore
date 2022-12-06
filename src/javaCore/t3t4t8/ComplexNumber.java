package javaCore.t3t4t8;

/*��� ����� ComplexNumber. �������������� � ��� ������ equals() � hashCode() ���,
 ����� equals() ��������� ���������� ComplexNumber �� ����������� ����� re � im,
 � hashCode() ��� �� ������������� � ����������� equals().

 ���������� hashCode(), ������������ ��������� ��� �� ����������� ������� �����
 re � im,��������� �� �����

        ������

        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        // a.equals(b) must return true
        // a.hashCode() must be equal to b.hashCode()

        ��������� 1. ������� � ������ java.lang.Double ����������� �����,
        ������� ������� � ������� ������.

        ��������� 2. ���� ������ ����� �� ��������, ����� ������� �� ������ ����� ����������,
        ������� ����� ���� ������������ equals() � hashCode(). ���� �� ��������������� ������� IDE,
        �� �����������, ��� ���� ������������� � ������ ��� �������� ������ ���.
        ����� ��� �� ������������� �������� �� ������� ����������� equals() � hashCode()
        ��� ������-������ �������� ������, �� ����� ���������� ������ �� ������.

        ����������:
        1. ������ ���� ����� public static class ComplexNumber
        2. ����� ComplexNumber ������ ����� ���� re � im ���� double
        3. ����� ComplexNumber ������ �������������� public boolean equals(Object o) � public int hashCode()
        4. equals � hashcode ������ ��������� ��������*/

import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return (Double.hashCode(re) >>> 2 ) * 31  + (Double.hashCode(im) >>> 3) * 31;
    }
}
