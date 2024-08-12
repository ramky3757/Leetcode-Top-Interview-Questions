package easy.Linked_List;

public class DeleteNode {
    Node head;
    public static void main(String[] args) {

    }

    public void addNode(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void deleteNode(int data){
        if(head==null){
            return;
        }

        if(head.value == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next!=null && current.next.value!=data){
            current = current.next;
        }

        while(current.next!=null){
            current = current.next;
        }

        if(current.next!=null){
            current.next = current.next.next;
        }
    }
}

class Node{
    int value ;
    Node next;

    Node(int x){
        this.value=x;
        this.next=null;
    }
}
