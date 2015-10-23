package MaxSlice;

/**
 * Created by Amata on 10/9/2015 AD.
 * https://codility.com/programmers/task/max_profit
 */
public class MaxProfit {
    public int solution(int[] A) {
        if(A.length < 1) return 0;

        int min = A[0];
        int max = 0;
        for(int i = 1; i < A.length; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i] - min);
        }
        return max;
    }
}
