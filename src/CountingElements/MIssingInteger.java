package CountingElements;

/**
 https://codility.com/demo/results/trainingVE8KFD-ZRP/
 */
public class MIssingInteger {
    public static int solution(int[] A) {
        int[] count = new int[A.length];
        for (int n : A) {
            if (n > 0 && n <= A.length)
                count[n - 1]++;
        }

        for (int i = 0; i < A.length; i++) {
            if (count[i] == 0) return i + 1;
        }
        return A.length + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,6,4,1,2,}) == 5);
    }
}
