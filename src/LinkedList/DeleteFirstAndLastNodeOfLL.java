package LinkedList;

import static LinkedList.InsertAtEndOfLL.insertEnd;
import static LinkedList.InsertAtEndOfLL.traverse;

public class DeleteFirstAndLastNodeOfLL {
    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head,30);
        head = insertEnd(head,40);
        head = insertEnd(head,50);
        traverse(head);
        head = deleteFirst(head);
        head = deleteLast(head);
        traverse(head);
    }

    static Node deleteFirst(Node head)
    {
        return head.next;
    }
    static Node deleteLast(Node head)
    {
        Node curr = head;
        while (curr.next.next != null)
        {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

}
