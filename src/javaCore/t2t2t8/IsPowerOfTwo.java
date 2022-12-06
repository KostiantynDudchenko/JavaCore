package javaCore.t2t2t8;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(IsPowerOfTwo.isPowerOfTwo(i));
        }
    }
}
