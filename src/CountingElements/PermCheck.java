package CountingElements;

/**
 https://codility.com/demo/results/trainingZEHSYA-74S/
 */
public class PermCheck {
    public static int solution(int[] A) {
        int[] count = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= A.length)
                count[A[i] - 1]++;
        }

        for (int i = 0; i < A.length ; i++) {
            if (count[i] == 0) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,1,3,2}) == 1);
        System.out.println(solution(new int[]{4,1,3}) == 0);
        System.out.println(solution(new int[]{1,1}) == 0);
        System.out.println(solution(new int[]{1}) == 1);
        System.out.println(solution(new int[]{2}) == 0);
    }
}
