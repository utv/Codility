import java.util.*;

/**
 * Created by Amata on 9/15/15 AD.
 *
 * https://codility.com/media/train/3-PrefixSums.pdf
 */
public class MushroomPicker {
    private static int[] prefixSum(int[] arr) {
        int[] sum = new int[arr.length + 1];
        sum[0] = 0;
        for (int i = 1; i < arr.length + 1; i++) {
            sum[i] = sum[i - 1] + arr[i - 1];
        }
        return sum;
    }

    private static int total(int[] arr, int x, int y) {
        return arr[y + 1] - arr[x];
    }

    private static int mushroom(int[] arr, int k, int moves) {
        int[] sum = prefixSum(arr);
        int result = 0;
        int left, right, goLeft, goRight;

        // Go left
        for (goLeft = 1; goLeft <= Math.min(moves, k) ; goLeft++) {
            left = Math.max(0, k - goLeft);
            goRight = moves - goLeft;
            right = Math.min(arr.length - 1, Math.max(left + goRight, k));
            result = Math.max(result, total(sum, left, right));
        }

        // Go right
        for (goRight = 1; goRight <= Math.min(moves, arr.length - k - 1); goRight++) {
            right = k + goRight;
            goLeft = moves - goRight;
            left = Math.max(0, Math.min(k, right - goLeft));
            result = Math.max(result, total(sum, left, right));
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 3, 7, 5, 1, 3, 9};
        int[] arr = {2, 3, 7, 5, 1, 3, 999};
         System.out.println("Mushroom = " + mushroom(arr, 4, 4));
    }
}
