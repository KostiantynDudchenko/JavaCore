package javaCore.t6t1t14;


/*ћассивы в Java имеют фиксированную длину. ѕопробуем обойти это ограничение.
  —оздайте класс DynamicArray, который хранит в себе массив, и имеет методы дл€ добавлени€
  void add(T el), void remove(int index) удалени€ и извлечени€ T get(int index) из него элементов,
  при переполнении текущего массива, должен создаватьс€ новый, большего размера.

  ƒл€ возможности работы с различными классами DynamicArray должен быть дженериком.
  ƒл€ решени€ задачи можно воспользоватьс€ методами из класса java.util.Arrays.
  »мпорт этого класса уже объ€влен в тестирующей системе. ƒобавл€ть его €вно не нужно

  “ребовани€:
  1. должен быть класс public static class DynamicArray
  2. класс DynamicArray должен иметь методы публичные void add(T el),
     void remove(int index) и T get(int index)
  3. ¬ случае подбора некорректного индекса ожидаетс€,
     что метод get выбросит ArrayIndexOutOfBoundsException
  4. класс DynamicArray должен  иметь публичный конструктор по умолчанию
  5. работа методов должна соответствовать условию*/

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