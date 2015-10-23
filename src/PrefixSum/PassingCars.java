package PrefixSum;

/**
 * Created by Amata on 10/2/15 AD.
 */
class PassingCars {
    public int solution(int[] A) {
        int[] P = new int[A.length + 1];
        P[0] = 0;
        for(int i=1; i < P.length; i++)
            P[i] = P[i - 1] + A[i - 1];

        int sum = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                sum+= P[P.length - 1] - P[i + 1];
            }
            if(sum > 1000000000) return -1;
        }
        return sum;
    }
}
