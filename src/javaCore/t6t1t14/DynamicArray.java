package javaCore.t6t1t14;


/*������� � Java ����� ������������� �����. ��������� ������ ��� �����������.
  �������� ����� DynamicArray, ������� ������ � ���� ������, � ����� ������ ��� ����������
  void add(T el), void remove(int index) �������� � ���������� T get(int index) �� ���� ���������,
  ��� ������������ �������� �������, ������ ����������� �����, �������� �������.

  ��� ����������� ������ � ���������� �������� DynamicArray ������ ���� ����������.
  ��� ������� ������ ����� ��������������� �������� �� ������ java.util.Arrays.
  ������ ����� ������ ��� �������� � ����������� �������. ��������� ��� ���� �� �����

  ����������:
  1. ������ ���� ����� public static class DynamicArray
  2. ����� DynamicArray ������ ����� ������ ��������� void add(T el),
     void remove(int index) � T get(int index)
  3. � ������ ������� ������������� ������� ���������,
     ��� ����� get �������� ArrayIndexOutOfBoundsException
  4. ����� DynamicArray ������  ����� ��������� ����������� �� ���������
  5. ������ ������� ������ ��������������� �������*/

import java.util.Arrays;

public class DynamicArray <T> {

    private int size = 0;
    private T[] array = (T[]) new Object[10];

   /* public void add(T el) {
        if (arrLength == arrCapacity) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[arrLength] = el;
        arrLength++;
    }*/

    public void add (T el) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + 16);
            array[size++] = el;
        } else {
            array[size++] = el;
        }
    }
    public void remove(int index) {
        if (index >= 0 && index < array.length - 1) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            size--;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i);
        }

        System.out.println(dynamicArray);

        for (int i = 10; i > 0; i--) {
            dynamicArray.add(i);
        }

        System.out.println(dynamicArray);

        for (int i = 0; i < 20; i+=2) {
            System.out.print(dynamicArray.get(i) + " ");
        }
        System.out.println();
        for (int i = 1; i < 20; i+=2) {
            dynamicArray.remove(i);
        }

        System.out.println(dynamicArray);
    }
}