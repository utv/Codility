import java.math.BigInteger;

/**
 * Created by Amata on 7/20/2016 AD.
 */
public class MagicalString {

    public static void main(String[] args) {
        int n = 200;
        System.out.println("n = " + n + ", countAllDP = " + countAllDP(n));
        System.out.println("n = " + n + ", countLongDP = " + countLongDP(n));

//        n = 5;
//        for (int i = 1; i < n; i++) {
//            System.out.println("n = " + i + ", countAll = " + countAll(str, i));
//            System.out.println("n = " + i + ", countAllDP = " + countAllDP(i));
//        }

    }

    /*
     * Dynamic Programming approach
     */
    public static long countLongDP(int n) {
        ++n;
        long[] A = new long[n];
        long[] E = new long[n];
        long[] I = new long[n];
        long[] O = new long[n];
        long[] U = new long[n];

        for (int i = 0; i < 2; i++) {
            A[i] = E[i] = I[i] = O[i] = U[i] = i;
        }

        for (int i = 2; i < n; i++) {
            A[i] = E[i - 1];
            E[i] = A[i - 1] + I[i - 1];
            I[i] = A[i - 1] + E[i - 1] + O[i - 1] + U[i - 1];
            O[i] = I[i - 1] + U[i - 1];
            U[i] = A[i - 1];
        }

        return (long) ((A[n - 1] + E[n - 1] + I[n - 1] + O[n - 1] + U[n - 1]) % (Math.pow(10, 9) + 7));
    }

    /*
     * Dynamic Programming approach
     */
    public static BigInteger countAllDP(int n) {
        ++n;
        BigInteger[] A = new BigInteger[n];
        BigInteger[] E = new BigInteger[n];
        BigInteger[] I = new BigInteger[n];
        BigInteger[] O = new BigInteger[n];
        BigInteger[] U = new BigInteger[n];

        for (int i = 0; i < 2; i++) {
            A[i] = E[i] = I[i] = O[i] = U[i] = new BigInteger(String.valueOf(i));
        }

        for (int i = 2; i < n; i++) {
            A[i] = E[i - 1];
            E[i] = new BigInteger(String.valueOf(A[i - 1])).add(new BigInteger(String.valueOf(I[i - 1])));
            I[i] = new BigInteger(String.valueOf(A[i - 1]))
                    .add(new BigInteger(String.valueOf(E[i - 1])))
                    .add(new BigInteger(String.valueOf(O[i - 1]))
                    .add(new BigInteger(String.valueOf(U[i - 1]))));
            O[i] = new BigInteger(String.valueOf(I[i - 1])).add(new BigInteger(String.valueOf(U[i - 1])));
            U[i] = A[i - 1];
        }

        return new BigInteger(String.valueOf(A[n - 1]))
                .add(new BigInteger(String.valueOf(E[n - 1])))
                .add(new BigInteger(String.valueOf(I[n - 1]))
                        .add(new BigInteger(String.valueOf(O[n - 1])))
                        .add(new BigInteger(String.valueOf(U[n - 1])))).mod(new BigInteger(String.valueOf(1000000007)));

//        return new BigInteger(String.valueOf(A[n - 1]))
//            .add(new BigInteger(String.valueOf(E[n - 1])))
//            .add(new BigInteger(String.valueOf(I[n - 1]))
//            .add(new BigInteger(String.valueOf(O[n - 1])))
//            .add(new BigInteger(String.valueOf(U[n - 1]))));
    }

    /*
     * Recursive approach
     */
    private static int countAll(String[] str, int n) {
        int sum = 0;
        for (String s: str) {
            if (s.equals("a")) sum+= cntA(n);
            else if (s.equals("e")) sum+= cntE(n);
            else if (s.equals("i")) sum+= cntI(n);
            else if (s.equals("o")) sum+= cntO(n);
            else if (s.equals("u")) sum+= cntU(n);
        }
        return sum;
    }

    private static int cntA(int n) {
        if (n <= 1) return n;
        return  cntE(n - 1);
    }

    private static int cntE(int n) {
        if (n <= 1) return n;
        return  cntA(n - 1) + cntI(n - 1);
    }

    private static int cntI(int n) {
        if (n <= 1) return n;
        return cntA(n - 1) + cntE(n - 1) + cntO(n - 1) + cntU(n - 1);
    }

    private static int cntU(int n) {
        if (n <= 1) return n;
        return cntA(n - 1);
    }

    private static int cntO(int n) {
        if (n <= 1) return n;
        return cntI(n - 1) + cntU(n - 1);
    }

}
