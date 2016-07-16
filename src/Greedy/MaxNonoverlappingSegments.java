package Greedy;

/**
 https://codility.com/demo/results/trainingTJNW8G-TK7/
 */
public class MaxNonOverLappingSegments {
    public static int solution(int[] A, int[] B) {
        if (A.length < 1) return 0;

        int cnt = 1;
        int prev = 0;
        for (int i = 1; i < A.length; i++) {
            if (B[prev] < A[i]) {
                cnt++;
                prev = i;
            }
        }
        System.out.println(cnt);
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,7,9,9}, new int[]{5,6,8,9,10}) == 3);
        System.out.println(solution(new int[]{0}, new int[]{0}) == 1);
    }
}
