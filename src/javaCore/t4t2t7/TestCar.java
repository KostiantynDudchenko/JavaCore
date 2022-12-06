package javaCore.t4t2t7;

import java.io.IOException;

public class TestCar {

    public static class Car implements AutoCloseable {

        public void drive() {
            System.out.println("������ �������.");
        }

        @Override
        public void close() throws RuntimeException {
            System.out.println("������ �����������...");
        }
    } //���� ��� �����

    public static void main(String... args) {

        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {

        }//���� ��� �����
    }
}
