package PrefixSum;

/**
 * Created by Amata on 10/1/15 AD.
 */
class CountDiv {
    public int solution(int A, int B, int K) {
//        if(A == B && A % K == 0) return 1;
//        if(A == B && A % K > 0) return 0;
//
//        int startPos = 0;
//        if(A % K != 0) startPos = K - (A % K);
//
//        int N = B - A + 1;
//        if(startPos < N)
//            return (int)Math.ceil( (double)(N - startPos) / K );
//        return 0;


        // sol#2
        if(A % K == 0)
            return (B - A) / K + 1;
        return (B - (A - A % K)) / K;
    }
}
