package easy.Linked_List;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode slow_ptr = dummyNode;
        ListNode fast_ptr = dummyNode;

        for(int i=0;i<n+1;i++){
            fast_ptr = fast_ptr.next;
        }

        while (fast_ptr != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next;
        }
        slow_ptr.next = slow_ptr.next.next;
        return dummyNode.next;
    }

}
