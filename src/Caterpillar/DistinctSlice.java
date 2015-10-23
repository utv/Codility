package Caterpillar;


/**
 * https://codility.com/demo/results/training365VEU-WKQ/
 */

public class DistinctSlice {

    public static int solution(int M, int[] A) {

        // Hash
        int[] hash = new int[M + 1];
        for (int i = 0; i < M; i++) {
            hash[i] = 0;
        }

        // Counts distinct slices
        int sum = 0;
        int front = 0;
        for (int back = 0; back < A.length; back++) {
            // move forward until a duplicate number found.
            while (front < A.length && hash[A[front]] < 1) {
                hash[A[front]]++;
                front++;
            }
            sum+= front - back;

            if(sum > 1000000000)
                return 1000000000;

            hash[A[back]] = 0;
        }
        return sum;
    }

    // https://github.com/acprimer/Codility/blob/master/src/Lesson13/CountDistinctSlices.java
    public static int sol(int M, int[] A) {
        int ans = 0, pre = -1;
        int[] hash = new int[M + 1];
        for (int i = 0; i < hash.length; i++) hash[i] = -1;
        for (int i = 0; i < A.length; i++) {
            if (hash[A[i]] > pre) {
                pre = hash[A[i]];
            }
            ans += i - pre;
            hash[A[i]] = i;
            if (ans > 1000000000) ans = 1000000000;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] A = {3, 4, 5, 5, 2};
        System.out.println(solution(6,A) == sol(6, A));
////        System.out.println("sum = " + solution(6,A));
////        System.out.println("sol = " + sol(6, A));
//
        int[] B = {1, 1};
        System.out.println(solution(2,B) == sol(2, B));
//
        int[] C = {0};
        System.out.println(solution(0,C) == sol(0, C));
//
        int[] D = {100000, 100000};
        System.out.println(solution(100000,D) == sol(100000, D));
//
        int[] E = {3, 4, 5, 5, 5, 2};
        System.out.println(solution(6,E) == sol(6, E));

        int[] F = {3, 4, 5, 5, 5, 2, 2, 1 ,5,6,0,0,0};
        System.out.println(solution(6,F) == sol(6, F));
//        System.out.println("sum = " + solution(6,F));
//        System.out.println("sol = " + sol(6,F));

        int[] G = {3, 6, 5, 6, 6, 6, 6,6,5,6};
        System.out.println(solution(6,G) == sol(6, G));
//        System.out.println("sum = " + solution(6,G));
//        System.out.println("sol = " + sol(6, G));

        int[] H = {6,5,6};
        System.out.println(solution(6,H) == sol(6, H));
//        System.out.println("sum = " + solution(6,H));
//        System.out.println("sol = " + sol(6, H));

        int[] I = {6,5,6,3,5};
        System.out.println(solution(6,I) == sol(6, I));
//        System.out.println("sum = " + solution(6,I));
//        System.out.println("sol = " + sol(6, I));

    }
}
