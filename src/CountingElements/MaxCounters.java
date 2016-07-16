package CountingElements;

import java.util.Arrays;

/**
 https://codility.com/demo/results/trainingMVGBRG-Z9U/
 */
public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        int[] C = new int[N];
        int max = 0;
        int minimal = 0;

        // Finds maximal value in an array before A[i] = N + 1 is found
        // The maximal will be a minimal of a counter in other iterations
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                C[A[i] - 1] = Math.max(minimal, C[A[i] - 1]);
                max = Math.max(max, ++C[A[i] - 1]);
            }
            else
                minimal = max;
        }

        // Make sure every counters has minimal value
        for (int i = 0; i < N; i++) {
            C[i] = Math.max(minimal, C[i]);
        }

        return C;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}), new int[]{3, 2, 2, 4, 2}));
    }
}
