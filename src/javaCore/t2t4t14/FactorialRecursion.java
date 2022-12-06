package javaCore.t2t4t14;

import javax.swing.*;
import java.math.BigInteger;

public class FactorialRecursion {
    public static BigInteger factorial(int value) {
        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(factorial(a));

    }

}
