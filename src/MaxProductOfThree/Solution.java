package MaxProductOfThree;

/**
 * Created by Amata on 10/2/15 AD.
 */
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        int max1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int max2 = A[A.length - 1] * A[0] * A[1];
        if(max1 > max2) return max1;
        return max2;
    }
}
