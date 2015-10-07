/**
 * Created by Amata on 9/28/15 AD.
 */
public class SwapToEqualSum {
    private static int sum(int[] A) {
        int total = 0;
        for (int i: A)
            total += i;
        return total;
    }

    private static boolean checkSwap(int[] A, int[] B, int maxInt) {
        int sumA = sum(A);
        int sumB = sum(B);


        return false;
    }

    public static void main(String[] args) {
        int[] A = {2,3,4,5};
        int[] B = {1,1,3,6};

        if (checkSwap(A, B, 100))
            System.out.println("Yes, it does.");
        System.out.println("No, it doesn't.");
    }
}
