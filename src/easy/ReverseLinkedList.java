package easy.Linked_List;
import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseList_StackMethod(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }

        if(!stack.isEmpty()){
            temp = stack.pop();
            head = temp;

            while(!stack.isEmpty()){
                temp.next = stack.pop();
                temp = temp.next;
            }
        }
        temp.next = null;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
