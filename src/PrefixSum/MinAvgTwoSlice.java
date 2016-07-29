package PrefixSum;

/**
 * Created by Amata on 7/16/2016 AD.
 */
public class MinAvgTwoSlice {
    public static int[] pSum(int[] A) {
        int[] p = new int[A.length + 1];
        p[0] = 0;
        for (int i = 1; i <= A.length; i++) {
            p[i] = p[i - 1] + A[i - 1];
        }

        return p;
    }

    public static int countTotal(int[] p, int from, int to) {
        return p[to + 1] - p[from];
    }

    public static int solution(int[] A) {
        return -1;
    }

    public static void main(String[] args) {
//        int[] A = {4,2,2,5,1,5,8};
        int[] B = {-3, -5, -8, -4, -10};
//        System.out.println(solution(A));
        System.out.println(solution(B));
    }

}
