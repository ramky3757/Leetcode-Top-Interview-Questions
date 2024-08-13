package easy.Linked_List;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode dummyNode = new ListNode(0);
        ListNode head = dummyNode;
        if(list1==null && list2==null){
            return ;
        }


        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummyNode.next=list1;
                list1=list1.next;
            } else{
                dummyNode.next=list2;
                list2=list2.next;
            }
            dummyNode = dummyNode.next;
        }

        if(list1!=null){
            dummyNode.next = list1;
        }

        if(list2!=null){
            dummyNode.next = list2;
        }

        System.out.println(head.next);
    }
}
