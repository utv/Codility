package Caterpillar;

/**
 https://codility.com/demo/results/trainingA8YQTM-FSZ/
 */

import java.util.Arrays;
import java.util.Map;

public class MinAbsSumOfTwo {

    // This is cleaner than my solution
    // http://www.martinkysel.com/codility-minabssumoftwo-solution/
    public static int solution2(int[] A) {
        Arrays.sort(A);
        int front = 0;
        int back = A.length - 1;
        int min = Integer.MAX_VALUE;

        int absFront, absBack;
        while (front <= back) {
            min = Math.min(min, Math.abs(A[front] + A[back]));
            absFront = Math.abs(A[front]);
            absBack = Math.abs(A[back]);

            if (absFront > absBack) front++;
            else back--;
        }

        return min;
    }

    // My solution
    public static int solution(int[] A) {
        Arrays.sort(A);

        // Min of pairs (i,j)
            int back = A.length - 1;
        int min = Integer.MAX_VALUE;
        for (int front = 0; front < back; front++) {
            int localMin = Math.abs(A[front] + A[back]);
            while (front < back && Math.abs(A[front] + A[back - 1]) <= localMin)
                localMin = Math.abs(A[front] + A[--back]);

            if (localMin < min)
                min = localMin;
        }

        // Min of pairs (i,i)
        for (int i: A) {
            if (Math.abs(i + i) < min)
                min = Math.abs(i + i);
        }

        return min;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{-8, 4, 5, -10, 3}) == 3);
        System.out.println(solution(new int[]{-100, -94, -8, -1, 3, 8, 60, 70}) == 0);
        System.out.println(solution(new int[]{-98, 99}) == 1);
        System.out.println(solution(new int[]{8, 5, 3, 4, 6, 8}) == 6);
        System.out.println(solution(new int[]{-1000000000, -999999999}) == 1999999998);
        System.out.println(solution(new int[]{3}) == 6);
        System.out.println(solution(new int[]{-100, -94, -88, 8, 33, 9, 60, 70}) == 16);
        System.out.println(solution(new int[]{-100, -94, -88, -8, -3, 2}) == 1);
        System.out.println(solution(new int[]{-100, -94, -88, -8, -3, 60}) == 6);
        System.out.println(solution(new int[]{5,5,5,5,5, -7, -23}) == 2);
        System.out.println(solution(new int[]{44, 13, 52, -10}) == 3);

    }
}
