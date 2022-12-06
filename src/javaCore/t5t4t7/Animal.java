package javaCore.t5t4t7;

import java.io.*;
import java.util.Objects;

        /*���������� �����, ������� �� ����������� ������� ���� ����������� ������ �������� Animal.
        ������ ���� ������� ��������� �������. ������� ���� ����� ���� int,
        ���������� ��� ������ ObjectOutputStream.writeInt(size).
        ����� ������ �������� ��������� ���������� �������� ���� Animal,
        ��������������� ��� ������ ObjectOutputStream.writeObject(animal).

        ���� ����� ������ ���� �� �������� ���������� �������������� ������� ����������� Animal,
        �� ����� ������ ������� ���������� java.lang.IllegalArgumentException.

        ������� �������������� ����� ���� ������.
        ���������� ������ �� ���� ������ ������ ������������ ������ � ����������,
        ����� ���������� ����� ���������. ��� ��-�� � ����� ���������� � IllegalArgumentException
        � ���������. ���� ���-�� ��������, �� ����������� ������� ���������.
        ������� �� ������� ������� ����������, �.�. �� ��������� ����� ������ catch.

        ����������:
        1. ����� ������ ���� ���������.
        2. ��������� ������ ������ ����: Animal[] deserializeAnimalArray(byte[] data)*/

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
        Animal[] animals1 = new Animal[] {new Animal("����"), new Animal("�����"), new Animal("�����")};
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
