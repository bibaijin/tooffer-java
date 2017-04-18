/**
 * Created by bibaijin on 15/04/2017.
 */
public class Q13 {
    // 调用方需要保证要删除的节点在列表中
    public void deleteNode(ListNode head, ListNode toDelete) throws Exception {
        if (head == null) {
            throw new Exception("invalid input");
        }

        if (head.next == null) {
            return;
        }

        if (toDelete.next == null) {
            ListNode p = head;
            while (p.next != toDelete) {
                p = p.next;
            }

            p.next = null;
            return;
        }

        toDelete.value = toDelete.next.value;
        toDelete.next = toDelete.next.next;
    }

    class ListNode {
        int value;
        ListNode next;
    }
}
