package MaxSlice;

import java.util.Arrays;

/**
 * https://codility.com/media/train/7-MaxSlice.pdf
 * Created by Amata on 10/4/15 AD.
 */
class MaxSlicePos {

    public static int maxSumSlice(int[] A) {
        int max = 0;
        int sum;
        if (A.length > 0) {
            max = A[0];
            sum = A[0];
            for (int i = 1; i < A.length; i++) {
                sum = sum + A[i];
                sum = Math.max(sum, A[i]);
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static int[] maxSlice(int[] A) {
        int sum, max, end;
        if (A.length > 0) {
            sum = A[0];
            max = sum;
            end = 0;

            // Finds an ending position of maximum sum
            for (int i = 1; i < A.length; i++) {
                sum+= A[i];
                sum = Math.max(sum, A[i]);

                if (sum >= max) {
                    max = sum;
                    end = i;
                }
            }

            // Looks for a starting position
            int total = 0;
            int start = 0;
            for (int i = end; i >= 0; i--) {
                total+= A[i];
                if (total == max) {
                    start = i;
                    break;
                }
            }
            return Arrays.copyOfRange(A, start, end + 1);
        }
        // if no array, return an empty array
        int[] emptyArr = new int[0];
        return emptyArr;
    }

    public static void printArray(int[] A) {
        for (int i: A)
            System.out.print(i + ", ");
        System.out.println();
    }

    public static int sumArr(int[] A) {
        int sum = 0;
        for (int i: A)
            sum+= i;
        return sum;
    }

    public static void test(int[] A) {
        System.out.print(">> ");
        printArray(A);
        int[] result = maxSlice(A);
        System.out.print(">> ");
        printArray(result);
        System.out.println("Result max = " + sumArr(result));
        System.out.println("True max = " + maxSumSlice(A));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        int[] A = {-10, -1 };
        test(A);
        int[] B = {10, 1 };
        test(B);
        int[] C = {5, -7, 3, 5, -2, 4, -1};
        test(C);
        int[] D = {5};
        test(D);
        int[] E = {5, -5, 5, 1};
        test(E);
        int[] F = {-631, -4, 0, -1, 0, 0, 1, -2, -4, 0, 1, 1};
        test(F);
        int[] G = {-631, -4, -33};
        test(G);
        int[] H = {6, -5, -9};
        test(H);
        int[] I = {-6, 0, -1, 1};
        test(I);

    }
}
