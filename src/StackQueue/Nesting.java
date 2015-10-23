package StackQueue;

/**
 * Created by Amata on 10/2/15 AD.
 */
import java.util.Stack;

class Nesting {
    public int solution(String S) {
        Stack st = new Stack();
        for(int i=0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                st.push(S.charAt(i));
            else if (S.charAt(i) == ')' && !st.empty())
                st.pop();
            else
                return 0;
        }
        if (st.empty()) return 1;
        return 0;
    }
}
