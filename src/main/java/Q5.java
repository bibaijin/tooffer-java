import java.util.Stack;

/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q5 {
    public ListNode head;

    public Q5(int[] vs) {
        if (vs.length == 0) {
            return;
        }

        this.head = new ListNode(vs[0]);
        ListNode p = this.head;
        for (int i = 1; i < vs.length; i++) {
            ListNode n = new ListNode(vs[i]);
            p.next = n;
            p = n;
        }
    }

    public void reversePrint() {
        Stack<Integer> s = new Stack<>();
        ListNode p = this.head;
        while (p != null) {
            s.push(p.value);
            p = p.next;
        }

        while (!s.empty()) {
            System.out.printf("%d ", s.pop());
        }
    }

    public class ListNode {
        int value;
        ListNode next;

        public ListNode(int v) {
            this.value = v;
            this.next = null;
        }
    }
}
