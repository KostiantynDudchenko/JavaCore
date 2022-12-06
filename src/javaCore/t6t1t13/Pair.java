package javaCore.t6t1t13;

/* ���������� generic-����� Pair, ������� �� Optional, �� ���������� ���� ��������� ������ �����
 � �� ����������� ��������� ��������� �������� null.

���������� ������ getFirst(), getSecond(), equals() � hashCode(),
 � ����� ����������� ��������� ����� of(). ����������� ������ ���� �������� (private).

� ��������� ������������� ������� Pair ������ ��������������� � ������� �������� ��������� ���:


Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"
Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

����������, �� ������� ����������� ������� ������ Pair.
��� ���������� �������� ����� ������ ����� �������� ���������.*/

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public class Pair<T, X> {

    private static final Pair<?, ?> EMPTY = new Pair<>(null, null);
    private final T first;
    private final X second;

    private Pair(T first, X second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public X getSecond() {
        return second;
    }

    public static <T, X> Pair of(T value1, X value2) {
    return new Pair<T, X>(value1, value2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);
    }
}
