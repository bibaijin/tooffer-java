import java.util.Stack;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q7 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public void appendTail(int v) {
        s1.push(v);
    }

    public int deleteHead() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }
}
