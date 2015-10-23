package FrogRiverOne;

/**
 * https://codility.com/programmers/task/frog_river_one
 */
class Solution {
    public int solution(int X, int[] A) {
        int N = 100000;
        int[] pos = new int[N+1];
        for(int i =0; i < N+1; i++)
            pos[i] = 0;

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if(sum < X && pos[A[i]] == 0) {
                pos[A[i]]++;
                sum++;
                if(sum == X) return i;
            }
        }

        return -1;
    }
}

