package LinkedList;

public class InsertAtEndOfLL {
    public static void main(String[] args) {
        Node head =  null;
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head,30);
        head = insertEnd(head,40);
        head = insertEnd(head,50);
        traverse(head);
    }
    static Node insertEnd(Node head,int data)
    {
        Node temp = new Node(data);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    static void traverse(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
