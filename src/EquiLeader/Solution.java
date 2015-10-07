// https://codility.com/programmers/task/equi_leader

import java.util.Stack;

class Solution {
    public int solution(int[] A) {
        // Search for a leader
        Stack st = new Stack();
        for(int i=0; i < A.length; i++) {
            if (i == 0) st.push(A[i]);
            else if (!st.empty())
                if (A[i] != (Integer)st.peek())
                    st.pop();
                else
                    st.push(A[i]);
            else
                st.push(A[i]);
        }
        // If no leader, no equi leader either
        if (st.empty()) return 0;

        // Make sure it is a leader
        int leader = (Integer)st.peek();
        int numLeader = 0;
        int dominatorIdx = 0;
        for(int i=0; i < A.length; i++) {
            if (A[i] == leader) {
                numLeader++;
                dominatorIdx = i;
            }
        }
        if (numLeader <= A.length / 2)
            return 0;

        // If there is a leader, look for equi leaders
        int curNumLeader = 0;
        int equiLeader = 0;
        int firstHalf, secondHalf = 0;
        for (int i=0; i <= dominatorIdx; i++) {
            if (A[i] == leader)
                curNumLeader++;

            firstHalf = i+1;
            secondHalf = A.length - firstHalf;

            if (curNumLeader > firstHalf / 2 && Math.abs(numLeader - curNumLeader) > secondHalf / 2)
                equiLeader++;

        }
        return equiLeader;
    }
}