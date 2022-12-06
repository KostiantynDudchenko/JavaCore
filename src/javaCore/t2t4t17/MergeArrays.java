package javaCore.t2t4t17;

public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
        }
        while (i < n) {
            result[k++] = a1[i++];
        }
        while (j < m) {
            result[k++] = a2[j++];
        }
        return result;// инкремент отдельно не выносить
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 3, 5};
        int[] a2 = {0, 2, 2, 5, 9};

        int[] a3 = MergeArrays.mergeArrays(a1, a2);

        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}
