package javaCore.t2t4t16;

public class PrintOddNumbers {
    public static void printOddNumbers(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sb.append(arr[i]).append(',');
            }
        }
        if (sb.length() == 0) {
            return;
        }
        System.out.println(sb.deleteCharAt(sb.length()-1));
    }

    public static void main(String[] args) {
        int[] arr = {};
        PrintOddNumbers.printOddNumbers(arr);
    }
}
