package Arrays.Rotation;

/**
 * Created by Amata on 5/6/2016 AD.
 */
public class Solution {
    
    public int[] reverse(int[] A, int from, int to) {
        if (to < from) return A;

        int tmp;
        while (from < to) {
            tmp = A[from];
            A[from] = A[to];
            A[to] = tmp;
            from++;
            to--;
        }
        return A;
    }
    
    public int[] rotate(int[] A, int K) {
        reverse(A, 0, A.length - 1);
        reverse(A, 0, K - 1);
        reverse(A, K, A.length - 1);
        return A;
    }

//    public static void main() {
//        int[] A = {2,3,4,5};
//        Solution sol = new Solution();
//        sol.reverse(A, 0, 0);
//        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
//        }
//    }

}
