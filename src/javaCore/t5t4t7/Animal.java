package javaCore.t5t4t7;

import java.io.*;
import java.util.Objects;

        /*Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal.
        Массив байт устроен следующим образом. Сначала идет число типа int,
        записанное при помощи ObjectOutputStream.writeInt(size).
        Далее подряд записано указанное количество объектов типа Animal,
        сериализованных при помощи ObjectOutputStream.writeObject(animal).

        Если вдруг массив байт не является корректным представлением массива экземпляров Animal,
        то метод должен бросить исключение java.lang.IllegalArgumentException.

        Причины некорректности могут быть разные.
        Попробуйте подать на вход методу разные некорректные данные и посмотрите,
        какие исключения будут возникать. Вот их-то и нужно превратить в IllegalArgumentException
        и выбросить. Если что-то забудете, то проверяющая система подскажет.
        Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.

        Требования:
        1. Метод должен быть публичным.
        2. Сигнатура метода должна быть: Animal[] deserializeAnimalArray(byte[] data)*/

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int arrSize = objectInputStream.readInt();
            animals = new Animal[arrSize];
            for (int i = 0; i < arrSize; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
            return animals;
        } catch (IOException | ClassNotFoundException | ClassCastException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /*public static void main(String[] args) throws IOException {
        Animal[] animals1 = new Animal[] {new Animal("Вася"), new Animal("Мурка"), new Animal("Пушок")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(3);
        objectOutputStream.writeObject(animals);

        byte[] byteArr = byteArrayOutputStream.toByteArray();

        Animal[] animals1 = deserializeAnimalArray(byteArr);
        for (int i = 0; i < 3; i++) {
            System.out.println(animals1[i]);
        }*/

}
