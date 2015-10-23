package Leader.Dominator;

/**
 https://codility.com/programmers/task/dominator
 */
import java.util.Stack;

class Dominator {
    public int solution(int[] A) {
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
        if (st.empty()) return -1;

        int candidate = (Integer)st.peek();
        int numDominator = 0;
        int dominatorIdx = 0;
        for(int i=0; i < A.length; i++) {
            if (A[i] == candidate) {
                numDominator++;
                dominatorIdx = i;
            }
        }

        if (numDominator > A.length / 2)
            return dominatorIdx;
        return -1;
    }
}
