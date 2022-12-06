package javaCore.t2t4t13;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int value) {
        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        return bi;//Твой код здесь
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(3));
    }

}
