package Caterpillar;

/**
 https://codility.com/programmers/task/abs_distinct
 */
public class AbsDist {

    public static int solution(int[] A) {
        if (A.length < 1) return 0;
        if (A.length == 1) return 1;

        // Removes duplicates
        int now, next;
        int[] D = new int[A.length];
        int right = 0;
        for (int i = 0; i < A.length - 1; i++) {
            now = Math.abs(A[i]);
            next = Math.abs(A[i + 1]);
            if (now != next) {
                D[right] = now;
                right++;
            }
        }
        D[right] = A[A.length - 1];

        // Counts distinct elements
        int cnt = 1; // already get 1, count the rest
        int left = 0;
        while (left < right) {
            cnt++;
            if (D[left] == D[right]) {
                left++;
                right--;
            }
            else if (D[left] < D[right]) {
                right--;
            }
            else if (D[left] > D[right]) {
                left++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] A = {-5, -3, -1, 0, 3, 6};
        System.out.println(solution(A) == 5);

        int[] H = {-2, -1, 0, 1, 5, 5, 5, 6, 6, 7};
        System.out.println(solution(H) == 6);

        int[] B = {-5, -3, -1, 0, 3, 5};
        System.out.println(solution(B) == 4);

        int[] C = {-5, -5, -5, 5, 5, 5};
        System.out.println(solution(C) == 1);

        int[] E = {0, 3, 4, 5, 5, 5, 6, 6};
        System.out.println(solution(E) == 5);

        int[] F = {-3, -4, -5, -5, -5, -6};
        System.out.println(solution(F) == 4);

        int[] G = {-2, -1, 0, 1, 1, 2};
        System.out.println(solution(G) == 3);

        int[] K = {-10, -10, -10, -10, -10};
        System.out.println(solution(K) == 1);

        int[] L = {10, 10, 10,10, 10,10, 10};
        System.out.println(solution(L) == 1);

        int[] M = {-10, -10, -10, 10, 10,10};
        System.out.println(solution(M) == 1);

        int[] N = {0, 0, 0,10};
        System.out.println(solution(N) == 2);

        int[] O = {-10, 0, 10};
        System.out.println(solution(O) == 2);

        int[] P = {-10, 10};
        System.out.println(solution(P) == 1);


//        int[] D = {-2147483648, -2, -1, 0, 1, 1, 2};
//        System.out.println(solution(D) == 4);

//        int[] I = {-2147483648, 0, 0, 6, 6, 7};
//        System.out.println(solution(I) == 4);

//        int[] J = {-2147483648, -2147483647, -2147483647, -1, 0, 0, 6, 6, 2147483647, 2147483647};
//        System.out.println(solution(J) == 5);


    }
}
